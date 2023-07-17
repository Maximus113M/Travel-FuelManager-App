package com.graphyinterface.menus;

import com.graphyinterface.Home;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Camil
 */
public class MenuVehiclesPanel extends javax.swing.JPanel {

    DefaultTableModel modelo;

    public MenuVehiclesPanel() {
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

        BoxAddVehicles = new javax.swing.JPanel();
        addVehiclesPoster = new javax.swing.JLabel();
        addVehicleButton = new javax.swing.JButton();
        BoxSavedVehicles = new javax.swing.JPanel();
        savedVehiclesButton = new javax.swing.JButton();
        savedPlacesPoster = new javax.swing.JLabel();
        titleMyVehicles = new javax.swing.JLabel();
        imageBackGround = new javax.swing.JLabel();

        setBackground(new java.awt.Color(241, 241, 241));
        setBorder(javax.swing.BorderFactory.createMatteBorder(21, 0, 21, 19, new java.awt.Color(0, 0, 0)));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(715, 560));

        BoxAddVehicles.setBackground(new java.awt.Color(204, 204, 204));
        BoxAddVehicles.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        BoxAddVehicles.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BoxAddVehiclesMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                BoxAddVehiclesMouseMoved(evt);
            }
        });

        addVehiclesPoster.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Images/EscarabajoPalmeras.jpg"))); // NOI18N

        addVehicleButton.setBackground(new java.awt.Color(0, 0, 0));
        addVehicleButton.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        addVehicleButton.setForeground(new java.awt.Color(255, 255, 255));
        addVehicleButton.setText("ANADIR VEHICULOS");
        addVehicleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addVehicleButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BoxAddVehiclesLayout = new javax.swing.GroupLayout(BoxAddVehicles);
        BoxAddVehicles.setLayout(BoxAddVehiclesLayout);
        BoxAddVehiclesLayout.setHorizontalGroup(
            BoxAddVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BoxAddVehiclesLayout.createSequentialGroup()
                .addGroup(BoxAddVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(addVehicleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addVehiclesPoster, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        BoxAddVehiclesLayout.setVerticalGroup(
            BoxAddVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BoxAddVehiclesLayout.createSequentialGroup()
                .addComponent(addVehiclesPoster, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(addVehicleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        BoxSavedVehicles.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));

        savedVehiclesButton.setBackground(new java.awt.Color(0, 0, 0));
        savedVehiclesButton.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        savedVehiclesButton.setForeground(new java.awt.Color(255, 255, 255));
        savedVehiclesButton.setText("VEHICULOS GUARDADOS");
        savedVehiclesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savedVehiclesButtonActionPerformed(evt);
            }
        });

        savedPlacesPoster.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Images/van_blanconegro.jpg"))); // NOI18N

        javax.swing.GroupLayout BoxSavedVehiclesLayout = new javax.swing.GroupLayout(BoxSavedVehicles);
        BoxSavedVehicles.setLayout(BoxSavedVehiclesLayout);
        BoxSavedVehiclesLayout.setHorizontalGroup(
            BoxSavedVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(savedVehiclesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(savedPlacesPoster, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        BoxSavedVehiclesLayout.setVerticalGroup(
            BoxSavedVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BoxSavedVehiclesLayout.createSequentialGroup()
                .addComponent(savedPlacesPoster, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(savedVehiclesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        titleMyVehicles.setBackground(new java.awt.Color(255, 51, 0));
        titleMyVehicles.setFont(new java.awt.Font("Serif", 3, 28)); // NOI18N
        titleMyVehicles.setForeground(new java.awt.Color(232, 232, 232));
        titleMyVehicles.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleMyVehicles.setText("AÑADE TUS VEHICULOS");
        titleMyVehicles.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        imageBackGround.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        imageBackGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Images/fondoMaderaVehiculos.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(titleMyVehicles, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(BoxAddVehicles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(386, 386, 386)
                .addComponent(BoxSavedVehicles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(imageBackGround, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(titleMyVehicles)
                .addGap(45, 45, 45)
                .addComponent(BoxAddVehicles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(BoxSavedVehicles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(imageBackGround, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addVehicleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addVehicleButtonActionPerformed
        VAddVehiclesPanelOption addVehiclesBox = new VAddVehiclesPanelOption();
        Home.setSizePanels(addVehiclesBox);

        this.removeAll();
        this.add(addVehiclesBox, BorderLayout.CENTER);
        this.revalidate();
        this.repaint();

    }//GEN-LAST:event_addVehicleButtonActionPerformed

    private void savedVehiclesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savedVehiclesButtonActionPerformed
        VSavedVehiclesPanelOption saveVehiclesBox = new VSavedVehiclesPanelOption();
        Home.setSizePanels(saveVehiclesBox);

        this.removeAll();
        this.add(saveVehiclesBox, BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_savedVehiclesButtonActionPerformed

    private void BoxAddVehiclesMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BoxAddVehiclesMouseMoved
        java.awt.event.MouseEvent evt2;
        if (!evt.equals(evt)) {
            BoxAddVehicles.setBorder(BorderFactory.createLineBorder(Color.CYAN, 5));
        } else {
            BoxAddVehicles.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
        }

        //BoxTouristPlaces.setBorder(BorderFactory.createLineBorder(Color.CYAN, 5));
    }//GEN-LAST:event_BoxAddVehiclesMouseMoved

    private void BoxAddVehiclesMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BoxAddVehiclesMouseDragged

    }//GEN-LAST:event_BoxAddVehiclesMouseDragged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BoxAddVehicles;
    private javax.swing.JPanel BoxSavedVehicles;
    private javax.swing.JButton addVehicleButton;
    private javax.swing.JLabel addVehiclesPoster;
    private javax.swing.JLabel imageBackGround;
    private javax.swing.JLabel savedPlacesPoster;
    private javax.swing.JButton savedVehiclesButton;
    private javax.swing.JLabel titleMyVehicles;
    // End of variables declaration//GEN-END:variables
class BackGroundPanel extends JPanel {

        private Image image;

        @Override
        public void paint(Graphics g) {
            image = new ImageIcon(getClass().getResource("/com.Images/fondoMaderaVehiculos.png")).getImage();

            g.drawImage(image, 0, 0, getWidth(), getHeight(), this);

            setOpaque(false);
            super.paint(g);
        }
    }

}
