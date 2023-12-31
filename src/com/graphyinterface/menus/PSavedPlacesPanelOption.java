/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.graphyinterface.menus;

import com.graphyinterface.Home;
import com.graphyinterface.PQuickBudgets;
import com.model.Place;
import com.model.User;
import data.controller.UserData;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Camil
 */
public class PSavedPlacesPanelOption extends javax.swing.JPanel {
    
    DefaultTableModel modelo;
    
    public PSavedPlacesPanelOption() {
        initComponents();
        this.setSize(715, 560);
        modelo= (DefaultTableModel)tblMySavedPlaces.getModel();
        Home.loadSavedPlacesTable(UserData.getActiveUser(), tblMySavedPlaces);
    }

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
        jPanel1 = new javax.swing.JPanel();
        sectionTitle = new javax.swing.JLabel();
        arrowBack = new javax.swing.JLabel();
        jWarning = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMySavedPlaces = new javax.swing.JTable();
        createNewPlaceButton = new javax.swing.JButton();
        searchVehicleButton = new javax.swing.JButton();
        refreshVehicleTblButton = new javax.swing.JButton();
        delVehicleButton = new javax.swing.JButton();

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

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createMatteBorder(10, 0, 21, 19, new java.awt.Color(0, 0, 0)));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(715, 560));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        sectionTitle.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        sectionTitle.setForeground(new java.awt.Color(255, 255, 255));
        sectionTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sectionTitle.setText("DESTINOS GUARDADOS");

        arrowBack.setForeground(new java.awt.Color(255, 255, 255));
        arrowBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Images/Arrow.png"))); // NOI18N
        arrowBack.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        arrowBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                arrowBackMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(arrowBack, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(sectionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sectionTitle)
                    .addComponent(arrowBack, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 15, Short.MAX_VALUE))
        );

        jWarning.setForeground(new java.awt.Color(255, 51, 51));
        jWarning.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jWarning.setText(" ");

        tblMySavedPlaces.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "CIUDAD", "DEPARTAMENTO", "DISTANCIA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMySavedPlaces.setGridColor(new java.awt.Color(204, 204, 204));
        tblMySavedPlaces.setSelectionBackground(new java.awt.Color(0, 153, 153));
        tblMySavedPlaces.setShowVerticalLines(true);
        tblMySavedPlaces.getTableHeader().setReorderingAllowed(false);
        tblMySavedPlaces.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMySavedPlacesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMySavedPlaces);

        createNewPlaceButton.setBackground(new java.awt.Color(0, 0, 0));
        createNewPlaceButton.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        createNewPlaceButton.setForeground(new java.awt.Color(255, 255, 255));
        createNewPlaceButton.setText("NUEVO DESTINO");
        createNewPlaceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createNewPlaceButtonActionPerformed(evt);
            }
        });

        searchVehicleButton.setBackground(new java.awt.Color(0, 0, 0));
        searchVehicleButton.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        searchVehicleButton.setForeground(new java.awt.Color(255, 255, 255));
        searchVehicleButton.setText("NUEVO PRESUPUESTO");
        searchVehicleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchVehicleButtonActionPerformed(evt);
            }
        });

        refreshVehicleTblButton.setBackground(new java.awt.Color(0, 0, 0));
        refreshVehicleTblButton.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        refreshVehicleTblButton.setForeground(new java.awt.Color(255, 255, 255));
        refreshVehicleTblButton.setText("ACTUALIZAR");
        refreshVehicleTblButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshVehicleTblButtonActionPerformed(evt);
            }
        });

        delVehicleButton.setBackground(new java.awt.Color(0, 0, 0));
        delVehicleButton.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        delVehicleButton.setForeground(new java.awt.Color(255, 255, 255));
        delVehicleButton.setText("ELIMINAR");
        delVehicleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delVehicleButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(refreshVehicleTblButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(searchVehicleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(createNewPlaceButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(delVehicleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchVehicleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refreshVehicleTblButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delVehicleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createNewPlaceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jWarning)
                .addContainerGap(48, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void arrowBackMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arrowBackMousePressed
        MenuTouristPlacesPanel menuTouristPlacesPanel = new MenuTouristPlacesPanel();
        JPanel x = PTouristPlacesPanelOption.backScreenPlacesPanelOption(menuTouristPlacesPanel);
        this.removeAll();
        this.add(x, BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_arrowBackMousePressed

    private void tblMySavedPlacesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMySavedPlacesMouseClicked
        jWarning.setText(" ");
    }//GEN-LAST:event_tblMySavedPlacesMouseClicked

    private void delVehicleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delVehicleButtonActionPerformed
        if(Home.msgIsNotSelectedFila(tblMySavedPlaces)){
            Home.msgNotSelected("Seleccione un Destino");
            System.out.println("***no selected");
        }else{
            int placeId= Integer.parseInt(tblMySavedPlaces.getValueAt(tblMySavedPlaces.getSelectedRow(), 0).toString());
            User user = UserData.getActiveUser();
            int resp=Home.optionMsg("Seguro que desea eliminar?");
            if(resp == JOptionPane.YES_OPTION){
                user.delPlaces(placeId);
                modelo.removeRow(tblMySavedPlaces.getSelectedRow());
                System.out.println("***Delete");
            }    
        }
    }//GEN-LAST:event_delVehicleButtonActionPerformed

    private void refreshVehicleTblButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshVehicleTblButtonActionPerformed
        modelo.setNumRows(0);
        Home.loadSavedPlacesTable(UserData.getActiveUser(), tblMySavedPlaces);
    }//GEN-LAST:event_refreshVehicleTblButtonActionPerformed

    private void createNewPlaceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createNewPlaceButtonActionPerformed
        new PCreatePlacesPanel().setVisible(true);
        
        
        
      /*  if(tblMySavedPlaces.getSelectedRow()<0){
            Home.msgNotSelected("Seleccione un Destino");
        }else{
            int placeId= Integer.parseInt(tblMySavedPlaces.getValueAt(tblMySavedPlaces.getSelectedRow(), 0).toString());
            User user = UserData.getActiveUser();
            Place selectedPlace = user.getPlaceFromID(placeId);
            new PSavedPlacesPanelEditScreen(selectedPlace).setVisible(true);
        }*/
    }//GEN-LAST:event_createNewPlaceButtonActionPerformed

    private void searchVehicleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchVehicleButtonActionPerformed
        if (Home.msgIsNotSelectedFila(tblMySavedPlaces)) {
            Home.msgNotSelected("Seleccione un Destino");
            System.out.println("no selected");
        } else {
            Place seletedPlace= UserData.activeUser.getPlaceFromID(Integer.parseInt(modelo.getValueAt(tblMySavedPlaces.getSelectedRow(), 0).toString()));
            new PQuickBudgets(seletedPlace).setVisible(true);
        }
    }//GEN-LAST:event_searchVehicleButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel arrowBack;
    private javax.swing.JButton createNewPlaceButton;
    private javax.swing.JButton delVehicleButton;
    private javax.swing.JPanel jContent;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jWarning;
    private javax.swing.JButton refreshVehicleTblButton;
    private javax.swing.JButton searchVehicleButton;
    private javax.swing.JLabel sectionTitle;
    private javax.swing.JTable tblMySavedPlaces;
    // End of variables declaration//GEN-END:variables
}
