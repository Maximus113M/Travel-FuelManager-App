/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.graphyinterface.menus;

import com.graphyinterface.Home;
import com.model.BudgetReport;
import com.model.Place;
import com.model.User;
import com.model.Vehicle;
import data.controller.UserData;
import data.functions.GenericFunctions;
import java.awt.BorderLayout;
import java.awt.Toolkit;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JFrame;


public class BAddBudgetPanelOption_2 extends javax.swing.JPanel {

    private static Place selectedPlace; 
    
    public BAddBudgetPanelOption_2() {
        initComponents();
    }

    public static Place getSelectedPlace() {
        return selectedPlace;
    }

    public static void setSelectedPlace(Place selectedPlace) {
        BAddBudgetPanelOption_2.selectedPlace = selectedPlace;
    }
    
    public void refreshPlaceField(String namePlace){
        //jFinalSelectedVehicle.setText(namePlace);
    }
    
   // public void 
    

    /*private void saveButtonEnable(){           //Maybe this functions can be use later
        if(!comboBoxTypeVehicle.getSelectedItem().equals("Seleccionar") && !jTextVehicleModel.getText().equals("") && !jTextVehiclePerformance.getText().equals("Km/Galon")){
            jSaveVehicleButton.setEnabled(true);
        }else{
            jSaveVehicleButton.setEnabled(false);
            System.out.println("*-*");
        }
    }*/
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jContent = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        sectionHeader = new javax.swing.JPanel();
        sectionTitle = new javax.swing.JLabel();
        backArrow = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        formTitle = new javax.swing.JLabel();
        typeTitle = new javax.swing.JLabel();
        modelTitle = new javax.swing.JLabel();
        fuelTitle = new javax.swing.JLabel();
        jTextFuelPrice = new javax.swing.JTextField();
        selectDefaultVehicle = new javax.swing.JCheckBox();
        jSaveVehicleButton = new javax.swing.JButton();
        jWarning = new javax.swing.JLabel();
        comboBoxChooseVehicle = new javax.swing.JComboBox<>();
        TouristPlaces = new javax.swing.JRadioButton();
        SavedPlaces = new javax.swing.JRadioButton();
        SelectedPlace = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();

        jContent.setBackground(new java.awt.Color(255, 255, 255));
        jContent.setBorder(javax.swing.BorderFactory.createMatteBorder(21, 0, 21, 19, new java.awt.Color(0, 0, 0)));
        jContent.setPreferredSize(new java.awt.Dimension(528, 509));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("DEFAULT PAGE");

        javax.swing.GroupLayout jContentLayout = new javax.swing.GroupLayout(jContent);
        jContent.setLayout(jContentLayout);
        jContentLayout.setHorizontalGroup(
            jContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jContentLayout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(jLabel2)
                .addContainerGap(183, Short.MAX_VALUE))
        );
        jContentLayout.setVerticalGroup(
            jContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jContentLayout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(jLabel2)
                .addContainerGap(235, Short.MAX_VALUE))
        );

        setBackground(new java.awt.Color(204, 204, 204));
        setBorder(javax.swing.BorderFactory.createMatteBorder(21, 0, 21, 19, new java.awt.Color(0, 0, 0)));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(715, 560));

        sectionHeader.setBackground(new java.awt.Color(0, 0, 0));

        sectionTitle.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        sectionTitle.setForeground(new java.awt.Color(255, 255, 255));
        sectionTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sectionTitle.setText("AÑADIR PRESUPUESTOS");

        backArrow.setForeground(new java.awt.Color(255, 255, 255));
        backArrow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Images/Arrow.png"))); // NOI18N
        backArrow.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        backArrow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                backArrowMousePressed(evt);
            }
        });

        javax.swing.GroupLayout sectionHeaderLayout = new javax.swing.GroupLayout(sectionHeader);
        sectionHeader.setLayout(sectionHeaderLayout);
        sectionHeaderLayout.setHorizontalGroup(
            sectionHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sectionHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backArrow, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sectionTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 637, Short.MAX_VALUE))
        );
        sectionHeaderLayout.setVerticalGroup(
            sectionHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sectionHeaderLayout.createSequentialGroup()
                .addGroup(sectionHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sectionTitle)
                    .addComponent(backArrow, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 15, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 4, new java.awt.Color(0, 0, 0)));

        formTitle.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        formTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        formTitle.setText("AGREGAR PRESUPUESTO");

        typeTitle.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        typeTitle.setText("SELECCIONAR DESTINO");

        modelTitle.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        modelTitle.setText("SELECCIONAR VEHICULO");

        fuelTitle.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
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

        selectDefaultVehicle.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        selectDefaultVehicle.setText(" Vehiculo por Defecto");
        selectDefaultVehicle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        selectDefaultVehicle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectDefaultVehicleActionPerformed(evt);
            }
        });

        jSaveVehicleButton.setBackground(new java.awt.Color(0, 0, 0));
        jSaveVehicleButton.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jSaveVehicleButton.setForeground(new java.awt.Color(255, 255, 255));
        jSaveVehicleButton.setText("GUARDAR");
        jSaveVehicleButton.setPreferredSize(new java.awt.Dimension(100, 35));
        jSaveVehicleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSaveVehicleButtonActionPerformed(evt);
            }
        });

        jWarning.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jWarning.setForeground(new java.awt.Color(255, 51, 51));
        jWarning.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jWarning.setText(" ");

        comboBoxChooseVehicle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Carro", "Motocicleta", "Camioneta" }));
        comboBoxChooseVehicle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxChooseVehicleActionPerformed(evt);
            }
        });

        TouristPlaces.setText("Destinos Turisticos");

        SavedPlaces.setText("Destinos Guardos");

        SelectedPlace.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(typeTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(modelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fuelTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFuelPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                        .addComponent(TouristPlaces)
                        .addComponent(SavedPlaces)
                        .addComponent(SelectedPlace)
                        .addComponent(selectDefaultVehicle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(comboBoxChooseVehicle, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(formTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jSaveVehicleButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(formTitle)
                .addGap(18, 18, 18)
                .addComponent(typeTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TouristPlaces)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SavedPlaces)
                .addGap(16, 16, 16)
                .addComponent(SelectedPlace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(modelTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboBoxChooseVehicle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(selectDefaultVehicle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(fuelTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFuelPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jSaveVehicleButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jWarning)
                .addGap(49, 49, 49))
        );

        jScrollPane1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(15, 20, 90, 20, new javax.swing.ImageIcon(getClass().getResource("/com/Images/FondoBosqueCarretera.jpg"))), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2))); // NOI18N

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "NOMBRE", "CIUDAD", "DISTANCIA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable.setShowVerticalLines(true);
        jTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sectionHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sectionHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backArrowMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backArrowMousePressed
        MenuBudgetsPanel menuBudgetsPanel = new MenuBudgetsPanel();
        JPanel x = PTouristPlacesPanelOption.backScreenPlacesPanelOption(menuBudgetsPanel);
        this.removeAll();
        this.add(x, BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_backArrowMousePressed

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

    private void selectDefaultVehicleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectDefaultVehicleActionPerformed
        
    }//GEN-LAST:event_selectDefaultVehicleActionPerformed

    private void comboBoxChooseVehicleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxChooseVehicleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxChooseVehicleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton SavedPlaces;
    private javax.swing.JTextField SelectedPlace;
    private javax.swing.JRadioButton TouristPlaces;
    private javax.swing.JLabel backArrow;
    private javax.swing.JComboBox<String> comboBoxChooseVehicle;
    private javax.swing.JLabel formTitle;
    private javax.swing.JLabel fuelTitle;
    private javax.swing.JPanel jContent;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jSaveVehicleButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTextFuelPrice;
    private javax.swing.JLabel jWarning;
    private javax.swing.JLabel modelTitle;
    private javax.swing.JPanel sectionHeader;
    private javax.swing.JLabel sectionTitle;
    private javax.swing.JCheckBox selectDefaultVehicle;
    private javax.swing.JLabel typeTitle;
    // End of variables declaration//GEN-END:variables
}
