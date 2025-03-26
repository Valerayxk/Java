package com.mycompany.client1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

import java.io.*;
import java.net.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client1 {
    private static final int SERVER_PORT = 9876;
    private static final int NUM_THREADS = 9;
    private static final Object lock = new Object();

    public static void main(String[] args) {
        // Запускаем несколько клиентов (можно запустить этот код в нескольких процессах)
        ExecutorService executor = Executors.newFixedThreadPool(NUM_THREADS);
        for (int i = 0; i < NUM_THREADS; i++) {
            executor.execute(Client1::runClient);
        }
    }

    private static void runClient() {
        while (true) {
            try (Socket socket = new Socket("localhost", SERVER_PORT);
                 BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                 PrintWriter out = new PrintWriter(socket.getOutputStream(), true)) {

                String receivedData = in.readLine();
                if (receivedData == null) break;

                String[] parts = receivedData.split(",");
                double lowerLimit = Double.parseDouble(parts[0]);
                double upperLimit = Double.parseDouble(parts[1]);
                double step = Double.parseDouble(parts[2]);

                double result = calculateIntegral(lowerLimit, upperLimit, step);

                out.println(result);
                
                synchronized (lock) {
                    System.out.println("Client sent result: " + result);
                }

            } catch (IOException e) {
                synchronized (lock) {
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ie) {
                    Thread.currentThread().interrupt();
                    return;
                }
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