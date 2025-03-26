package com.mycompany.client1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Client1 {

    private static final int SERVER_PORT = 9876;
    private static final int[] CLIENT_PORTS = {9877, 9878, 9879, 9880, 9881, 9882, 9883, 9884, 9885};
    private static final int NUM_THREADS = 9;
    private static final Object lock = new Object();

    public static void main(String[] args) {
        for (int i = 0; i < CLIENT_PORTS.length; i++) {
            int clientPort = CLIENT_PORTS[i];
            int clientNumber = i + 1;
            new Thread(() -> startClient(clientPort, clientNumber)).start();
        }
    }

    private static void startClient(int clientPort, int clientNumber) {
        try (DatagramSocket clientSocket = new DatagramSocket(clientPort)) {
            InetAddress serverAddress;
            try {
                serverAddress = InetAddress.getByName("localhost");
            } catch (UnknownHostException e) {
                synchronized (lock) {
                    System.err.println("Client " + clientNumber + " cannot resolve localhost: " + e.getMessage());
                }
                return;
            }
            
            synchronized (lock) {
                System.out.println("Client " + clientNumber + " launched on the port " + clientPort);
            }

            while (true) {
                try {
                    byte[] receiveData = new byte[1024];
                    DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                    clientSocket.receive(receivePacket);

                    String receivedData = new String(receivePacket.getData(), 0, receivePacket.getLength());
                    String[] parts = receivedData.split(",");
                    double lowerLimit = Double.parseDouble(parts[0]);
                    double upperLimit = Double.parseDouble(parts[1]);
                    double step = Double.parseDouble(parts[2]);

                    double totalResult = calculateIntegral(lowerLimit, upperLimit, step);

                    synchronized (lock) {
                        System.out.println("Client " + clientNumber + " sent the result: " + totalResult);
                    }

                    String resultStr = Double.toString(totalResult);
                    byte[] sendData = resultStr.getBytes();
                    DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, SERVER_PORT);
                    clientSocket.send(sendPacket);

                } catch (IOException e) {
                    synchronized (lock) {
                        System.err.println("Client " + clientNumber + " I/O error: " + e.getMessage());
                    }
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ie) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                }
            }
        } catch (SocketException e) {
            synchronized (lock) {
                System.err.println("Error when creating a socket for the client " + clientNumber + ": " + e.getMessage());
            }
        }
    }

    private static double calculateIntegral(double lowerLimit, double upperLimit, double step) {
        double range = (upperLimit - lowerLimit) / NUM_THREADS;
        double totalResult = 0.0;

        Thread[] threads = new Thread[NUM_THREADS];
        IntegralCalculator[] calculators = new IntegralCalculator[NUM_THREADS];

        for (int i = 0; i < NUM_THREADS; i++) {
            double threadLowerLimit = lowerLimit + i * range;
            double threadUpperLimit = threadLowerLimit + range;
            calculators[i] = new IntegralCalculator(threadLowerLimit, threadUpperLimit, step);
            threads[i] = new Thread(calculators[i]);
            threads[i].start();
        }

        for (int i = 0; i < NUM_THREADS; i++) {
            try {
                threads[i].join();
                totalResult += calculators[i].getResult();
            } catch (InterruptedException e) {
                synchronized (lock) {
                    System.err.println("The stream was interrupted: " + e.getMessage());
                }
                Thread.currentThread().interrupt();
            }
        }

        return totalResult;
    }

    private static class IntegralCalculator implements Runnable {
        private double lowerLimit;
        private double upperLimit;
        private double step;
        private double result;

        public IntegralCalculator(double lowerLimit, double upperLimit, double step) {
            this.lowerLimit = lowerLimit;
            this.upperLimit = upperLimit;
            this.step = step;
        }

        public double getResult() {
            return result;
        }

        @Override
        public void run() {
            double sum = 0.0;
            double x = lowerLimit;
            while (x + step <= upperLimit) {
                sum += step / 2 * (Math.cos(x * x) + Math.cos((x + step) * (x + step)));
                x += step;
            }
            sum += (upperLimit - x) / 2 * (Math.cos(x * x) + Math.cos(upperLimit * upperLimit));
            result = sum;
        }
    }
}