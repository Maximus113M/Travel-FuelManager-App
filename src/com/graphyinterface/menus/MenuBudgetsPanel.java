package com.graphyinterface.menus;

import com.graphyinterface.Home;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import data.controller.PlacesData;
import data.controller.UserData;
import data.controller.VehicleData;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Camil
 */
public class MenuBudgetsPanel extends javax.swing.JPanel {

    DefaultTableModel modelo;
    
    public MenuBudgetsPanel() {
        initComponents();
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
        jRadioButton1 = new javax.swing.JRadioButton();
        BoxTouristPlaces = new javax.swing.JPanel();
        addVehiclesLog = new javax.swing.JLabel();
        touristPlacesButton = new javax.swing.JButton();
        BoxSavePlaces = new javax.swing.JPanel();
        savedPlacesButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        titleMyVehicles = new javax.swing.JLabel();

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

        jRadioButton1.setText("jRadioButton1");

        setBackground(new java.awt.Color(241, 241, 241));
        setBorder(javax.swing.BorderFactory.createMatteBorder(21, 0, 21, 19, new java.awt.Color(0, 0, 0)));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(715, 560));

        BoxTouristPlaces.setBackground(new java.awt.Color(204, 204, 204));
        BoxTouristPlaces.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        BoxTouristPlaces.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BoxTouristPlacesMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                BoxTouristPlacesMouseMoved(evt);
            }
        });

        addVehiclesLog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Images/Globo-Viajes redimencionada.png"))); // NOI18N

        touristPlacesButton.setBackground(new java.awt.Color(0, 0, 0));
        touristPlacesButton.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        touristPlacesButton.setForeground(new java.awt.Color(255, 255, 255));
        touristPlacesButton.setText("CREAR PRESUPUESTO");
        touristPlacesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                touristPlacesButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BoxTouristPlacesLayout = new javax.swing.GroupLayout(BoxTouristPlaces);
        BoxTouristPlaces.setLayout(BoxTouristPlacesLayout);
        BoxTouristPlacesLayout.setHorizontalGroup(
            BoxTouristPlacesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BoxTouristPlacesLayout.createSequentialGroup()
                .addGroup(BoxTouristPlacesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(touristPlacesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addVehiclesLog, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        BoxTouristPlacesLayout.setVerticalGroup(
            BoxTouristPlacesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BoxTouristPlacesLayout.createSequentialGroup()
                .addComponent(addVehiclesLog, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(touristPlacesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        BoxSavePlaces.setBackground(new java.awt.Color(0, 0, 0));
        BoxSavePlaces.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        BoxSavePlaces.setPreferredSize(new java.awt.Dimension(210, 329));

        savedPlacesButton.setBackground(new java.awt.Color(0, 0, 0));
        savedPlacesButton.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        savedPlacesButton.setForeground(new java.awt.Color(255, 255, 255));
        savedPlacesButton.setText("PRESUPUESTOS");
        savedPlacesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savedPlacesButtonActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Images/mapa_brujula.jpg"))); // NOI18N

        javax.swing.GroupLayout BoxSavePlacesLayout = new javax.swing.GroupLayout(BoxSavePlaces);
        BoxSavePlaces.setLayout(BoxSavePlacesLayout);
        BoxSavePlacesLayout.setHorizontalGroup(
            BoxSavePlacesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(savedPlacesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        BoxSavePlacesLayout.setVerticalGroup(
            BoxSavePlacesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BoxSavePlacesLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(savedPlacesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        titleMyVehicles.setBackground(new java.awt.Color(255, 51, 0));
        titleMyVehicles.setFont(new java.awt.Font("Serif", 2, 28)); // NOI18N
        titleMyVehicles.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleMyVehicles.setText("CREA TUS PRESUPUESTOS");
        titleMyVehicles.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(BoxTouristPlaces, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BoxSavePlaces, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(128, Short.MAX_VALUE)
                .addComponent(titleMyVehicles, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(titleMyVehicles)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BoxSavePlaces, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BoxTouristPlaces, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(73, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void touristPlacesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_touristPlacesButtonActionPerformed
        BAddBudgetPanelOption_3 addBudgetsBox= new BAddBudgetPanelOption_3();
        Home.setSizePanels(addBudgetsBox);
        
        this.removeAll();
        this.add(addBudgetsBox,BorderLayout.CENTER);
        this.revalidate();
        this.repaint(); 
             
    }//GEN-LAST:event_touristPlacesButtonActionPerformed

    private void savedPlacesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savedPlacesButtonActionPerformed
        BSavedBudgetPanelOption savedBudgetsBox= new BSavedBudgetPanelOption();
        Home.setSizePanels(savedBudgetsBox);
        
        this.removeAll();
        this.add(savedBudgetsBox,BorderLayout.CENTER);
        this.revalidate();
        this.repaint(); 
    }//GEN-LAST:event_savedPlacesButtonActionPerformed

    private void BoxTouristPlacesMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BoxTouristPlacesMouseMoved
        if(!evt.equals(evt)){
           BoxTouristPlaces.setBorder(BorderFactory.createLineBorder(Color.CYAN, 5)); 
        }else{
            BoxTouristPlaces.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
        }
            
        //BoxTouristPlaces.setBorder(BorderFactory.createLineBorder(Color.CYAN, 5));
    }//GEN-LAST:event_BoxTouristPlacesMouseMoved

    private void BoxTouristPlacesMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BoxTouristPlacesMouseDragged
   
    }//GEN-LAST:event_BoxTouristPlacesMouseDragged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BoxSavePlaces;
    private javax.swing.JPanel BoxTouristPlaces;
    private javax.swing.JLabel addVehiclesLog;
    private javax.swing.JPanel jContent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JButton savedPlacesButton;
    private javax.swing.JLabel titleMyVehicles;
    private javax.swing.JButton touristPlacesButton;
    // End of variables declaration//GEN-END:variables
}
