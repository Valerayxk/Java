package com.mycompany.mavenproject1;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import java.util.Scanner;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.EOFException;
import java.util.List;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class NewJFrame extends javax.swing.JFrame {

    public NewJFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ADD = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Delete = new javax.swing.JButton();
        Calc = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        Fill = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        SavingF = new javax.swing.JButton();
        LoadF = new javax.swing.JButton();
        SavingBF = new javax.swing.JButton();
        LoadBF = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ADD.setText("Добавить");
        ADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel1.setText("Н");

        jLabel2.setText("В");

        jLabel3.setText("Ш");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Нижняя", "Верхняя", "Шаг", "Резульат"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        Delete.setText("Удалить");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        Calc.setText("Расчитать");
        Calc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcActionPerformed(evt);
            }
        });

        Clear.setText("Очистить");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        Fill.setText("Заполнить");
        Fill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FillActionPerformed(evt);
            }
        });

        jLabel4.setText("integral(cos(x^2))");

        jLabel5.setText("Текстовый вид");

        jLabel6.setText("Двоичный вид");

        SavingF.setText("Сохранение");
        SavingF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SavingFActionPerformed(evt);
            }
        });

        LoadF.setText("Загрузка");
        LoadF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadFActionPerformed(evt);
            }
        });

        SavingBF.setText("Сохранение");
        SavingBF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SavingBFActionPerformed(evt);
            }
        });

        LoadBF.setText("Загрузка");
        LoadBF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadBFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Calc)
                                .addGap(102, 102, 102))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Delete)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Fill))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(ADD)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Clear))))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addGap(74, 74, 74))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(SavingBF)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                                        .addComponent(LoadBF))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(SavingF)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(LoadF)))
                                .addGap(19, 19, 19))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ADD)
                            .addComponent(Clear))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Delete)
                            .addComponent(Fill))
                        .addGap(18, 18, 18)
                        .addComponent(Calc)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SavingF)
                            .addComponent(LoadF))
                        .addGap(33, 33, 33)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SavingBF)
                            .addComponent(LoadBF))
                        .addGap(153, 153, 153))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
       
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
       
    }//GEN-LAST:event_jTextField3ActionPerformed

     private static final int SERVER_PORT = 9876;
    private static final int[] CLIENT_PORTS = {9877, 9878, 9879, 9880, 9881, 9882, 9883, 9884, 9885};
    private static final int NUM_CLIENTS = 9;
 
    private ArrayList<RecIntegral> integrals = new ArrayList<>();
    
    private void ADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDActionPerformed
   try {
        double lower = Double.parseDouble(jTextField2.getText().trim());
        double upper = Double.parseDouble(jTextField1.getText().trim());
        double step = Double.parseDouble(jTextField3.getText().trim());

        RecIntegral integral = new RecIntegral(lower, upper, step);
        integrals.add(integral);

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{lower, upper, step, ""});

        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Ошибка: введите числа!", "Ошибка", JOptionPane.ERROR_MESSAGE);
    } catch (InvalidInputException e) {
        JOptionPane.showMessageDialog(this, e.getMessage(), "Ошибка", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_ADDActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
         int selectedRow = jTable1.getSelectedRow();
    if (selectedRow != -1) {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.removeRow(selectedRow);

        integrals.remove(selectedRow);
    } else {
        JOptionPane.showMessageDialog(this, "Выберите строку для удаления!", "Ошибка", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_DeleteActionPerformed
    
    private void CalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    long startTime = System.nanoTime();
    
    try (ServerSocket serverSocket = new ServerSocket(9876)) {
        ExecutorService executor = Executors.newFixedThreadPool(NUM_CLIENTS);
        
        for (int row = 0; row < model.getRowCount(); row++) {
            final double lowerLimit = (double) model.getValueAt(row, 0); 
            final double upperLimit = (double) model.getValueAt(row, 1);
            final double step = (double) model.getValueAt(row, 2); 

            double range = (upperLimit - lowerLimit) / NUM_CLIENTS;
            List<Double> results = new ArrayList<>();

            for (int i = 0; i < NUM_CLIENTS; i++) {
                final int clientIndex = i; 
                Socket clientSocket = serverSocket.accept();
                
                executor.execute(() -> {
                    try {
                        double clientLowerLimit = lowerLimit + (clientIndex * range);
                        double clientUpperLimit = clientLowerLimit + range;
                        
                        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                        String data = clientLowerLimit + "," + clientUpperLimit + "," + step;
                        out.println(data);
                        
                        BufferedReader in = new BufferedReader(
                            new InputStreamReader(clientSocket.getInputStream()));
                        String resultStr = in.readLine();
                        synchronized (results) {
                            results.add(Double.parseDouble(resultStr));
                        }
                        
                        clientSocket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
            }
            
            executor.shutdown();
            while (!executor.isTerminated()) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }

            double totalResult = results.stream().mapToDouble(Double::doubleValue).sum();
            model.setValueAt(totalResult, row, 3);
        }
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, 
            "Ошибка при работе с клиентами: " + e.getMessage(), "Ошибка", JOptionPane.ERROR_MESSAGE);
    }
    
    long endTime = System.nanoTime();
    System.out.printf("Total execution time: %.2f ms\n", (endTime - startTime) / 1_000_000.0);
    }//GEN-LAST:event_CalcActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
         ((DefaultTableModel) jTable1.getModel()).setRowCount(0);
            //integrals.clear();// Очиста колекции

    }//GEN-LAST:event_ClearActionPerformed

    private void FillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FillActionPerformed
             DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    
    if (!integrals.isEmpty()) {
        model.setRowCount(0); 
        for (RecIntegral param : integrals) {
            model.addRow(new Object[]{
                param.getLowerLimit(), 
                param.getUpperLimit(), 
                param.getStep(), 
                param.getResult()
            });
        }
    } else {
        JOptionPane.showMessageDialog(this, "Коллекция пуста!", "Ошибка", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_FillActionPerformed

    private void SavingFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SavingFActionPerformed

    JFileChooser fileChooser = new JFileChooser();
    fileChooser.setDialogTitle("Сохранить в текстовом формате");
    fileChooser.setFileFilter(new FileNameExtensionFilter("Текстовые файлы (*.txt)", "txt"));

    int userSelection = fileChooser.showSaveDialog(NewJFrame.this);

    if (userSelection == JFileChooser.APPROVE_OPTION) {

        File fileToSave = fileChooser.getSelectedFile();

        if (!fileToSave.getName().endsWith(".txt")) {
            fileToSave = new File(fileToSave.getAbsolutePath() + ".txt");
        }
        try (FileWriter writer = new FileWriter(fileToSave)) {
            for (RecIntegral integral : integrals) {
                String line = String.format("%s,%s,%s,%s",
                        integral.getLowerLimit(), 
                        integral.getUpperLimit(), 
                        integral.getStep(), 
                        integral.getResult());
                writer.write(line);
                writer.append('\n');
            }
            JOptionPane.showMessageDialog(NewJFrame.this, "Данные успешно сохранены!", "Успех", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(NewJFrame.this, "Ошибка при сохранении файла!", "Ошибка", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    }//GEN-LAST:event_SavingFActionPerformed

    private void SavingBFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SavingBFActionPerformed

    JFileChooser fileChooser = new JFileChooser();
    fileChooser.setDialogTitle("Сохранить в бинарном формате");
    fileChooser.setFileFilter(new FileNameExtensionFilter("Двоичные файлы (*.dat)", "dat"));

    int userSelection = fileChooser.showSaveDialog(NewJFrame.this);

    if (userSelection == JFileChooser.APPROVE_OPTION) {

        File fileToSave = fileChooser.getSelectedFile();

        if (!fileToSave.getName().endsWith(".dat")) {
            fileToSave = new File(fileToSave.getAbsolutePath() + ".dat");
        }

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileToSave))) {
            for (RecIntegral integral : integrals) {
                oos.writeObject(integral);
            }
            JOptionPane.showMessageDialog(NewJFrame.this, "Данные успешно сохранены в файл в бинарном виде!", "Успех", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(NewJFrame.this, "Ошибка при сохранении файла!", "Ошибка", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
}

    }//GEN-LAST:event_SavingBFActionPerformed

    private void LoadFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadFActionPerformed
    JFileChooser fileChooser = new JFileChooser();
    fileChooser.setDialogTitle("Загрузить из текстового формата");
    fileChooser.setFileFilter(new FileNameExtensionFilter("Текстовые файлы (*.txt)", "txt"));

    int userSelection = fileChooser.showOpenDialog(NewJFrame.this);

    if (userSelection == JFileChooser.APPROVE_OPTION) {
        File fileToLoad = fileChooser.getSelectedFile();

        try (FileReader reader = new FileReader(fileToLoad)) {
            Scanner scan = new Scanner(reader);
            integrals.clear();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);

            while (scan.hasNextLine()) {
                String[] line = scan.nextLine().split(",");
                RecIntegral integral = new RecIntegral(
                        Double.parseDouble(line[0]), 
                        Double.parseDouble(line[1]), 
                        Double.parseDouble(line[2])
                );
                integral.setResult(Double.parseDouble(line[3]));
                integrals.add(integral);
                model.addRow(new Object[]{
                        Double.valueOf(line[0]), 
                        Double.valueOf(line[1]), 
                        Double.valueOf(line[2]), 
                        Double.valueOf(line[3])
                });
            }
            scan.close();

            JOptionPane.showMessageDialog(NewJFrame.this, "Данные успешно загружены!", "Успех", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException | NumberFormatException | InvalidInputException e) {
            JOptionPane.showMessageDialog(NewJFrame.this, "Ошибка при загрузке файла!", "Ошибка", JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_LoadFActionPerformed

    private void LoadBFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadBFActionPerformed
      
    JFileChooser fileChooser = new JFileChooser();
    fileChooser.setDialogTitle("Загрузить из бинарного формата");
    fileChooser.setFileFilter(new FileNameExtensionFilter("Двоичные файлы (*.dat)", "dat"));

    int userSelection = fileChooser.showOpenDialog(NewJFrame.this);

    if (userSelection == JFileChooser.APPROVE_OPTION) {
        File fileToLoad = fileChooser.getSelectedFile();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileToLoad))) {
            integrals.clear();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);

            while (true) {
                try {
                    RecIntegral integral = (RecIntegral) ois.readObject();
                    integrals.add(integral);
                    model.addRow(new Object[]{
                        integral.getLowerLimit(),
                        integral.getUpperLimit(),
                        integral.getStep(),
                        integral.getResult()
                    });
                } catch (EOFException e) {
                    break; 
                }
            }

            JOptionPane.showMessageDialog(NewJFrame.this, "Данные успешно загружены!", "Успех", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(NewJFrame.this, "Ошибка при загрузке файла!", "Ошибка", JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_LoadBFActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADD;
    private javax.swing.JButton Calc;
    private javax.swing.JButton Clear;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Fill;
    private javax.swing.JButton LoadBF;
    private javax.swing.JButton LoadF;
    private javax.swing.JButton SavingBF;
    private javax.swing.JButton SavingF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
