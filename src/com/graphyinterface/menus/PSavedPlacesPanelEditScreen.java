package com.graphyinterface.menus;

import com.graphyinterface.Home;
import com.model.Place;
import data.functions.GenericFunctions;
import java.awt.Color;

public class PSavedPlacesPanelEditScreen extends javax.swing.JFrame {

    private final Place place;

    /**
     * Creates new form VSavedVehiclesPanelEditScreen
     */
    public PSavedPlacesPanelEditScreen(Place selectedPlace) {
        initComponents();
        this.setLocationRelativeTo(null);
        place = selectedPlace;

        jTextNamePlace.setText(selectedPlace.getNamePlace());
        jTextCity.setText(selectedPlace.getCiudad());
        jTextState.setText(selectedPlace.getDepartamento());
        jTextDistance.setText(String.valueOf(selectedPlace.getDistance()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        editBackGround = new javax.swing.JPanel();
        editFormPanel = new javax.swing.JPanel();
        sectionTitle = new javax.swing.JLabel();
        namePlaceTitle = new javax.swing.JLabel();
        cityTitle = new javax.swing.JLabel();
        jTextCity = new javax.swing.JTextField();
        stateTitle = new javax.swing.JLabel();
        jTextState = new javax.swing.JTextField();
        jSaveVehicleButton = new javax.swing.JButton();
        jTextNamePlace = new javax.swing.JTextField();
        distanceTitle = new javax.swing.JLabel();
        jTextDistance = new javax.swing.JTextField();
        waring = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        editBackGround.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true), javax.swing.BorderFactory.createMatteBorder(30, 30, 90, 30, new javax.swing.ImageIcon(getClass().getResource("/com/Images/FondoBosqueCarretera.jpg"))))); // NOI18N
        editBackGround.setPreferredSize(new java.awt.Dimension(340, 495));

        editFormPanel.setBackground(new java.awt.Color(255, 255, 255));
        editFormPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        editFormPanel.setPreferredSize(new java.awt.Dimension(275, 372));

        sectionTitle.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        sectionTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sectionTitle.setText("EDITA TUS DESTINOS");

        namePlaceTitle.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        namePlaceTitle.setText("NOMBRE DEL DESTINO");

        cityTitle.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        cityTitle.setText("CIUDAD");

        stateTitle.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        stateTitle.setText("DEPARTAMENTO");

        jTextState.setHorizontalAlignment(javax.swing.JTextField.CENTER);

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

        distanceTitle.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        distanceTitle.setText("DISTANCIA");

        jTextDistance.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextDistance.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextDistanceFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextDistanceFocusLost(evt);
            }
        });
        jTextDistance.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextDistanceKeyTyped(evt);
            }
        });

        waring.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        waring.setForeground(new java.awt.Color(255, 51, 51));
        waring.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        waring.setText(" ");

        javax.swing.GroupLayout editFormPanelLayout = new javax.swing.GroupLayout(editFormPanel);
        editFormPanel.setLayout(editFormPanelLayout);
        editFormPanelLayout.setHorizontalGroup(
            editFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editFormPanelLayout.createSequentialGroup()
                .addGroup(editFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editFormPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(sectionTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(editFormPanelLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(editFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(namePlaceTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                            .addComponent(cityTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextCity)
                            .addComponent(stateTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextState)
                            .addComponent(jTextNamePlace, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(distanceTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextDistance)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editFormPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(waring, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editFormPanelLayout.createSequentialGroup()
                .addGap(0, 89, Short.MAX_VALUE)
                .addComponent(jSaveVehicleButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
        );
        editFormPanelLayout.setVerticalGroup(
            editFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editFormPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sectionTitle)
                .addGap(18, 18, 18)
                .addComponent(namePlaceTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextNamePlace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cityTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(stateTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(distanceTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextDistance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(waring)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSaveVehicleButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout editBackGroundLayout = new javax.swing.GroupLayout(editBackGround);
        editBackGround.setLayout(editBackGroundLayout);
        editBackGroundLayout.setHorizontalGroup(
            editBackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(editFormPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
        );
        editBackGroundLayout.setVerticalGroup(
            editBackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(editFormPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(editBackGround, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(editBackGround, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSaveVehicleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSaveVehicleButtonActionPerformed
        if (jTextNamePlace.getText().isEmpty() || jTextCity.getText().isEmpty() || jTextState.getText().isEmpty() || jTextDistance.getText().isEmpty()) {
            waring.setText("Campos vacios");
        } else {
            place.setNamePlace(jTextNamePlace.getText());
            place.setCiudad(jTextCity.getText());
            place.setDepartamento(jTextState.getText());
            place.setDistance(Double.parseDouble(jTextDistance.getText()));
            waring.setText(" ");
            Home.msgSucessfulAction("Datos Actualizados");
            this.dispose();
        }
    }//GEN-LAST:event_jSaveVehicleButtonActionPerformed

    private void jTextDistanceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextDistanceFocusGained
        if (jTextDistance.getText().equals("Distancia desde Bucaramanga")) {
            jTextDistance.setText("");
            jTextDistance.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jTextDistanceFocusGained

    private void jTextDistanceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextDistanceFocusLost
        if (jTextDistance.getText().equals("")) {
            jTextDistance.setText("Distancia desde Bucaramanga");
            jTextDistance.setForeground(Color.lightGray);
        }
    }//GEN-LAST:event_jTextDistanceFocusLost

    private void jTextDistanceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextDistanceKeyTyped
        GenericFunctions.inputOnlyNumber(evt);
    }//GEN-LAST:event_jTextDistanceKeyTyped

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cityTitle;
    private javax.swing.JLabel distanceTitle;
    private javax.swing.JPanel editBackGround;
    private javax.swing.JPanel editFormPanel;
    private javax.swing.JButton jSaveVehicleButton;
    private javax.swing.JTextField jTextCity;
    private javax.swing.JTextField jTextDistance;
    private javax.swing.JTextField jTextNamePlace;
    private javax.swing.JTextField jTextState;
    private javax.swing.JLabel namePlaceTitle;
    private javax.swing.JLabel sectionTitle;
    private javax.swing.JLabel stateTitle;
    private javax.swing.JLabel waring;
    // End of variables declaration//GEN-END:variables
}
