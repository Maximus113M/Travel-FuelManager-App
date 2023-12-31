package com.graphyinterface.menus;

import com.graphyinterface.Home;
import com.model.User;
import data.controller.UserData;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import data.defaultplaces.DefaultPlaces;
import data.functions.GenericFunctions;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Camil
 */
public class MenuTouristPlacesPanel extends javax.swing.JPanel {

    DefaultTableModel modelo;
    
    public MenuTouristPlacesPanel() {
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

        BoxTouristPlaces = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        touristPlacesButton = new javax.swing.JButton();
        BoxSavePlaces = new javax.swing.JPanel();
        savedPlacesButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        titleSection = new javax.swing.JLabel();
        imageBackGround = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createMatteBorder(21, 0, 21, 19, new java.awt.Color(0, 0, 0)));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(715, 560));

        BoxTouristPlaces.setBackground(new java.awt.Color(204, 204, 204));
        BoxTouristPlaces.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        BoxTouristPlaces.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BoxTouristPlacesMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                BoxTouristPlacesMouseMoved(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Images/TouristPlaces redimencianada.png"))); // NOI18N

        touristPlacesButton.setBackground(new java.awt.Color(0, 0, 0));
        touristPlacesButton.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        touristPlacesButton.setForeground(new java.awt.Color(255, 255, 255));
        touristPlacesButton.setText("DESTINOS TURISTICOS");
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
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        BoxTouristPlacesLayout.setVerticalGroup(
            BoxTouristPlacesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BoxTouristPlacesLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(touristPlacesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        BoxSavePlaces.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        savedPlacesButton.setBackground(new java.awt.Color(0, 0, 0));
        savedPlacesButton.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        savedPlacesButton.setForeground(new java.awt.Color(255, 255, 255));
        savedPlacesButton.setText("DESTINOS GUARDADOS");
        savedPlacesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savedPlacesButtonActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Images/savedplaces dimencionada.png"))); // NOI18N

        javax.swing.GroupLayout BoxSavePlacesLayout = new javax.swing.GroupLayout(BoxSavePlaces);
        BoxSavePlaces.setLayout(BoxSavePlacesLayout);
        BoxSavePlacesLayout.setHorizontalGroup(
            BoxSavePlacesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(savedPlacesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3)
        );
        BoxSavePlacesLayout.setVerticalGroup(
            BoxSavePlacesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BoxSavePlacesLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(savedPlacesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        titleSection.setBackground(new java.awt.Color(255, 51, 0));
        titleSection.setFont(new java.awt.Font("Serif", 3, 28)); // NOI18N
        titleSection.setForeground(new java.awt.Color(232, 232, 232));
        titleSection.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleSection.setText("EXPLORA NUEVOS LUGARES");
        titleSection.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        imageBackGround.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imageBackGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Images/zyro-image (1) (1).png"))); // NOI18N
        imageBackGround.setPreferredSize(new java.awt.Dimension(696, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(titleSection, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(BoxTouristPlaces, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(BoxSavePlaces, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(imageBackGround, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(titleSection)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BoxTouristPlaces, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BoxSavePlaces, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addComponent(imageBackGround, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void touristPlacesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_touristPlacesButtonActionPerformed
        PTouristPlacesPanelOption touristPlacesList= new PTouristPlacesPanelOption(DefaultPlaces.defaultListPlaces(), modelo);
        Home.setSizePanels(touristPlacesList);
        
        this.removeAll();
        this.add(touristPlacesList,BorderLayout.CENTER);
        this.revalidate();
        this.repaint(); 
             
    }//GEN-LAST:event_touristPlacesButtonActionPerformed

    private void savedPlacesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savedPlacesButtonActionPerformed
        PSavedPlacesPanelOption savePlacesBox= new PSavedPlacesPanelOption();
        Home.setSizePanels(savePlacesBox);
        
        this.removeAll();
        this.add(savePlacesBox,BorderLayout.CENTER);
        this.revalidate();
        this.repaint();   
    }//GEN-LAST:event_savedPlacesButtonActionPerformed

    private void BoxTouristPlacesMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BoxTouristPlacesMouseMoved
        java.awt.event.MouseEvent evt2;
        /*BoxTouristPlaces.setBorder(BorderFactory.createLineBorder(Color.CYAN, 5)); 
        BoxTouristPlaces.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));*/
      
            
        //BoxTouristPlaces.setBorder(BorderFactory.createLineBorder(Color.CYAN, 5));
    }//GEN-LAST:event_BoxTouristPlacesMouseMoved

    private void BoxTouristPlacesMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BoxTouristPlacesMouseDragged
   
    }//GEN-LAST:event_BoxTouristPlacesMouseDragged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BoxSavePlaces;
    private javax.swing.JPanel BoxTouristPlaces;
    private javax.swing.JLabel imageBackGround;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton savedPlacesButton;
    private javax.swing.JLabel titleSection;
    private javax.swing.JButton touristPlacesButton;
    // End of variables declaration//GEN-END:variables
}
