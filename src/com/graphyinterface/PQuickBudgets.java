/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.graphyinterface;

import data.functions.GenericFunctions;
import java.awt.Color;

/**
 *
 * @author Camil
 */
public class PQuickBudgets extends javax.swing.JFrame {

    /**
     * Creates new form PQuickBudgets
     */
    public PQuickBudgets(String place) {
        initComponents();
        selectedPlace.setText(place);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        typeTitle = new javax.swing.JLabel();
        modelTitle = new javax.swing.JLabel();
        comboBoxChooseVehicle = new javax.swing.JComboBox<>();
        selectDefaultVehicle = new javax.swing.JCheckBox();
        fuelTitle = new javax.swing.JLabel();
        jTextFuelPrice = new javax.swing.JTextField();
        jSaveVehicleButton = new javax.swing.JButton();
        typeTitle1 = new javax.swing.JLabel();
        selectedPlace = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        typeTitle2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(460, 615));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 15), javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(20, 20, 20, 20, new javax.swing.ImageIcon(getClass().getResource("/com/Images/FONDO GRIS.jpg"))), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5)))); // NOI18N

        typeTitle.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        typeTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        typeTitle.setText("DESTINO SELECCIONADO");

        modelTitle.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        modelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        modelTitle.setText("SELECCIONAR VEHICULO");

        comboBoxChooseVehicle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Carro", "Motocicleta", "Camioneta" }));
        comboBoxChooseVehicle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxChooseVehicleActionPerformed(evt);
            }
        });

        selectDefaultVehicle.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        selectDefaultVehicle.setText(" Vehiculo por Defecto");
        selectDefaultVehicle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        selectDefaultVehicle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectDefaultVehicleActionPerformed(evt);
            }
        });

        fuelTitle.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        fuelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fuelTitle.setText("VALOR DE COMBUSTIBLE");

        jTextFuelPrice.setForeground(new java.awt.Color(204, 204, 204));
        jTextFuelPrice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFuelPrice.setText("Precio/Galon");
        jTextFuelPrice.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFuelPriceFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFuelPriceFocusLost(evt);
            }
        });
        jTextFuelPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFuelPriceKeyTyped(evt);
            }
        });

        jSaveVehicleButton.setBackground(new java.awt.Color(0, 0, 0));
        jSaveVehicleButton.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        jSaveVehicleButton.setForeground(new java.awt.Color(255, 255, 255));
        jSaveVehicleButton.setText("GUARDAR");
        jSaveVehicleButton.setPreferredSize(new java.awt.Dimension(100, 35));
        jSaveVehicleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSaveVehicleButtonActionPerformed(evt);
            }
        });

        typeTitle1.setFont(new java.awt.Font("Serif", 1, 32)); // NOI18N
        typeTitle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        typeTitle1.setText("CREAR PRESUPUESTO");

        selectedPlace.setFont(new java.awt.Font("Serif", 2, 16)); // NOI18N
        selectedPlace.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        selectedPlace.setText("DESTINO SELECCIONADO");

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("CERRAR");

        typeTitle2.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        typeTitle2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        typeTitle2.setText("NOMBRE DEL PRESUPUESTO");

        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 81, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFuelPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jSaveVehicleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(selectDefaultVehicle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboBoxChooseVehicle, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(80, 80, 80))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(typeTitle1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(selectedPlace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fuelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(typeTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(typeTitle2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(modelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(typeTitle1)
                .addGap(18, 18, 18)
                .addComponent(typeTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectedPlace)
                .addGap(18, 18, 18)
                .addComponent(typeTitle2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(modelTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboBoxChooseVehicle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(selectDefaultVehicle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fuelTitle)
                .addGap(8, 8, 8)
                .addComponent(jTextFuelPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSaveVehicleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxChooseVehicleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxChooseVehicleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxChooseVehicleActionPerformed

    private void selectDefaultVehicleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectDefaultVehicleActionPerformed

    }//GEN-LAST:event_selectDefaultVehicleActionPerformed

    private void jTextFuelPriceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFuelPriceFocusGained
        if (jTextFuelPrice.getText().equals("Precio/Galon")) {
            jTextFuelPrice.setText("");
            jTextFuelPrice.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jTextFuelPriceFocusGained

    private void jTextFuelPriceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFuelPriceFocusLost
        if (jTextFuelPrice.getText().equals("")) {
            jTextFuelPrice.setText("Precio/Galon");
            jTextFuelPrice.setForeground(Color.lightGray);
        }
    }//GEN-LAST:event_jTextFuelPriceFocusLost

    private void jTextFuelPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFuelPriceKeyTyped
        GenericFunctions.inputOnlyNumber(evt);
    }//GEN-LAST:event_jTextFuelPriceKeyTyped

    private void jSaveVehicleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSaveVehicleButtonActionPerformed
        //if (!comboBoxChooseVehicle.getSelectedItem().equals("Seleccionar") && !.getText().equals("") && !jTextFuelPrice.getText().equals("Km/Galon") && !jTextFuelPrice.getText().equals("")) {

            /*String vehicle = comboBoxChooseVehicle.getSelectedItem().toString();
            String model = jTextVehicleModel.getText();
            double performance = Double.parseDouble(jTextFuelPrice.getText());

            User user = UserData.getActiveUser();
            BudgetReport AutoCompleteReports( vehicleId,  placeId, fuelPrice);
            user.AddVehicle(newVehicle);
            if(jCheckBoxSelectDefaultVehicle.isSelected()){
                user.setDefaultVehicle(newVehicle);
            }
            System.out.println("***Vehiculo anhadido");
            Home.msgSucessfulAction("Vehiculo Guardado");

            comboBoxChoosePlace.setSelectedIndex(0);
            jTextVehicleModel.setText("");
            jTextFuelPrice.setForeground(Color.lightGray);
            jTextFuelPrice.setText("Km/Galon");
            jWarning.setText(" ");

            System.out.println("defaultVehicle "+ user.getDefaultVehicle());

        } else {
            Toolkit.getDefaultToolkit().beep();
            jWarning.setText("Complete todos los campos");
            */
            // }
    }//GEN-LAST:event_jSaveVehicleButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboBoxChooseVehicle;
    private javax.swing.JLabel fuelTitle;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jSaveVehicleButton;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFuelPrice;
    private javax.swing.JLabel modelTitle;
    private javax.swing.JCheckBox selectDefaultVehicle;
    private javax.swing.JLabel selectedPlace;
    private javax.swing.JLabel typeTitle;
    private javax.swing.JLabel typeTitle1;
    private javax.swing.JLabel typeTitle2;
    // End of variables declaration//GEN-END:variables
}
