/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.graphyinterface.menus;

import com.graphyinterface.Home;
import com.model.Place;
import data.controller.PlacesData;
import data.controller.UserData;
import data.defaultplaces.DefaultPlaces;

import java.awt.BorderLayout;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import javax.swing.JPanel;

public class PTouristPlacesPanelOption extends javax.swing.JPanel {

    public PTouristPlacesPanelOption(List<Place> defaultPlaces, DefaultTableModel modelo) {
        initComponents();
        this.setSize(715, 560);
        modelo = (DefaultTableModel) tblTouristPlaces.getModel();

        for (Place place : defaultPlaces) {
            String[] fila = {String.valueOf(place.getID()), place.getNamePlace(), place.getCiudad(), place.getDepartamento(), String.valueOf(place.getDistance()) + " km"};
            modelo.addRow(fila);
        }
    }

    protected static JPanel backScreenPlacesPanelOption(JPanel p) {
        p.setSize(715, 560);
        p.setLocation(0, 0);
        return p;
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
        jLabel1 = new javax.swing.JLabel();
        jArrowBack = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTouristPlaces = new javax.swing.JTable();
        warningLabel = new javax.swing.JLabel();
        savePlaceButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        makeReportButton = new javax.swing.JButton();

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
        setBorder(javax.swing.BorderFactory.createMatteBorder(21, 0, 21, 19, new java.awt.Color(0, 0, 0)));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(715, 560));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TODOS LOS DESTINOS");

        jArrowBack.setForeground(new java.awt.Color(255, 255, 255));
        jArrowBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Images/Arrow.png"))); // NOI18N
        jArrowBack.setText("jLabel3");
        jArrowBack.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jArrowBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jArrowBackMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jArrowBack, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jArrowBack, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        tblTouristPlaces.setModel(new javax.swing.table.DefaultTableModel(
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
        tblTouristPlaces.setGridColor(new java.awt.Color(204, 204, 204));
        tblTouristPlaces.setSelectionBackground(new java.awt.Color(0, 153, 153));
        tblTouristPlaces.setShowVerticalLines(true);
        tblTouristPlaces.getTableHeader().setReorderingAllowed(false);
        tblTouristPlaces.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTouristPlacesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTouristPlaces);
        if (tblTouristPlaces.getColumnModel().getColumnCount() > 0) {
            tblTouristPlaces.getColumnModel().getColumn(0).setResizable(false);
            tblTouristPlaces.getColumnModel().getColumn(0).setPreferredWidth(10);
            tblTouristPlaces.getColumnModel().getColumn(1).setPreferredWidth(108);
            tblTouristPlaces.getColumnModel().getColumn(2).setPreferredWidth(50);
            tblTouristPlaces.getColumnModel().getColumn(3).setPreferredWidth(60);
            tblTouristPlaces.getColumnModel().getColumn(4).setResizable(false);
            tblTouristPlaces.getColumnModel().getColumn(4).setPreferredWidth(22);
        }

        warningLabel.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        warningLabel.setForeground(new java.awt.Color(255, 51, 51));
        warningLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        warningLabel.setText(" ");

        savePlaceButton.setBackground(new java.awt.Color(0, 0, 0));
        savePlaceButton.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        savePlaceButton.setForeground(new java.awt.Color(255, 255, 255));
        savePlaceButton.setText("GENERAR PRESUPUESTO");
        savePlaceButton.setPreferredSize(new java.awt.Dimension(190, 35));

        searchButton.setBackground(new java.awt.Color(0, 0, 0));
        searchButton.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        searchButton.setForeground(new java.awt.Color(255, 255, 255));
        searchButton.setText("GUARDAR DESTINO");
        searchButton.setPreferredSize(new java.awt.Dimension(195, 35));
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        makeReportButton.setBackground(new java.awt.Color(0, 0, 0));
        makeReportButton.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        makeReportButton.setForeground(new java.awt.Color(255, 255, 255));
        makeReportButton.setText("BUSCAR");
        makeReportButton.setPreferredSize(new java.awt.Dimension(81, 35));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(warningLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(makeReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(savePlaceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(makeReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(savePlaceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(warningLabel)
                .addContainerGap(38, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jArrowBackMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jArrowBackMousePressed
        MenuTouristPlacesPanel menuTouristPlacesPanel = new MenuTouristPlacesPanel();
        JPanel x = backScreenPlacesPanelOption(menuTouristPlacesPanel);
        this.removeAll();
        this.add(x, BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_jArrowBackMousePressed

    private void tblTouristPlacesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTouristPlacesMouseClicked
        warningLabel.setText(" ");
    }//GEN-LAST:event_tblTouristPlacesMouseClicked

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        if (Home.msgIsNotSelectedFila(tblTouristPlaces)) {
            Home.msgNotSelected("Seleccione un Destino");
            System.out.println("no selected");
        } else {
            System.out.println("selected");
            int selectedId = Integer.parseInt(tblTouristPlaces.getValueAt(tblTouristPlaces.getSelectedRow(), 0).toString());
            System.out.println("***" + selectedId);
            Place placeSelected = PlacesData.SearchPlaceID(selectedId, DefaultPlaces.defaultListPlaces());

            if (!UserData.getActiveUser().SearchDuplicatePlace(placeSelected.getID())) {
                UserData.getActiveUser().AddToMySavedList(placeSelected);
                Home.defaultWarningLabel("El destino ya ha sido añadido", warningLabel);
                Home.msgSucessfulAction("El Destino ha sido Guardado");
            } else {
                warningLabel.setText("El destino ya ha sido añadido");
            }
        }
    }//GEN-LAST:event_searchButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jArrowBack;
    private javax.swing.JPanel jContent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton makeReportButton;
    private javax.swing.JButton savePlaceButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JTable tblTouristPlaces;
    private javax.swing.JLabel warningLabel;
    // End of variables declaration//GEN-END:variables
}