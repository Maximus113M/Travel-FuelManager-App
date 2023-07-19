package com.graphyinterface;

import com.graphyinterface.menus.DefaultHome;
import com.graphyinterface.menus.MenuTouristPlacesPanel;
import com.graphyinterface.menus.MenuBudgetsPanel;
import com.graphyinterface.menus.MenuVehiclesPanel;
import com.graphyinterface.menus.Perfile;
import com.model.Place;
import com.model.User;
import com.model.Vehicle;
import data.controller.UserData;
import data.functions.GenericFunctions;
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Home extends javax.swing.JFrame {

    public Home(User user) {
        initComponents();
        this.setSize(1000, 600);
        this.setLocationRelativeTo(null);
        jGreetingHome.setText("¡Hola " + user.getName() + ", Bienvenido!");
        dateField2.setText(GenericFunctions.todayDate());
    }

    public void showMenusPanel(JPanel p) {
        setSizePanels(p);
        
        jContent.removeAll();
        jContent.add(p, BorderLayout.CENTER);
        jContent.revalidate();
        jContent.repaint();
    }
    
    public static void setSizePanels(JPanel p) {
        p.setSize(715, 560);
        p.setLocation(0, 0);
    }
    
    //
    public static void msgSucessfulAction(String message) {
        JOptionPane.showMessageDialog(null, message, "Proceso Completado", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void msgWarning(String message) {
        JOptionPane.showMessageDialog(null, message, "Advertencia", JOptionPane.CANCEL_OPTION);
    }
    
    public static void msgError(String message) {
        JOptionPane.showMessageDialog(null, message, "Advertencia", JOptionPane.ERROR_MESSAGE);
    }

    public static void msgNotSelected(String message) {
        JOptionPane.showMessageDialog(null, message, "Item No Seleccionado", JOptionPane.INFORMATION_MESSAGE);
    }

    public static int optionMsg(String message) {
        return JOptionPane.showConfirmDialog(null, message, "Eliminar", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        
    }
    
    //This Functions returns true if it don't had any selected
    public static boolean msgIsNotSelectedFila(JTable tbl) {
        return tbl.getSelectedRow() < 0 || tbl.getSelectedColumnCount() < 0;
    }
    
    //This return to deafult the warningLabel
    public static void defaultWarningLabel(String word, JLabel warning) {
        if (warning.getText().equals(word)) {
            warning.setText(" ");
        }
    }
    
    
    //This function load my vehicle Table 
    public static void loadSavedVehiclesTable(User user, JTable table) {
        List<Vehicle> mySavedVehicles = user.exportMyVehiclesList();
        DefaultTableModel modelo = (DefaultTableModel) table.getModel();

        if (!user.emptyVehiclesList()) {
            for (Vehicle vehicle : mySavedVehicles) {
                System.out.println("***" + vehicle);
                String[] fila = {String.valueOf(vehicle.getReference()), vehicle.getType(), vehicle.getModel(), String.valueOf(vehicle.getPerformance())};
                modelo.addRow(fila);
            }
        } else {
            System.out.println("Lista vacia");
        }
    }
    
    //This function load my tourist places Table 
    public static void loadSavedPlacesTable(User user, JTable table) {
        List<Place> mySavedPlaces = user.exportMyPlacesList();
        DefaultTableModel modelo = (DefaultTableModel) table.getModel();

        if (!user.emptyPlaceList()) {
            for (Place places : mySavedPlaces) {
                System.out.println("***" + places);
                String[] fila = {String.valueOf(places.getID()), places.getNamePlace(), places.getCiudad(), places.getDepartamento() ,String.valueOf(places.getDistance()+" km")};
                modelo.addRow(fila);
            }
        } else {
            System.out.println("Lista vacia");
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBackGround = new javax.swing.JPanel();
        jContent = new javax.swing.JPanel();
        jImageBackGround = new javax.swing.JLabel();
        jGreetingHome = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jMenuOptions = new javax.swing.JPanel();
        jMenuTitle = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jMyPerfileButton = new javax.swing.JButton();
        jBudgetButton = new javax.swing.JButton();
        jMyVehicleButton = new javax.swing.JButton();
        jTouristPlacesButton = new javax.swing.JButton();
        jLogOutButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        dateField2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jBackGround.setBackground(new java.awt.Color(102, 102, 102));
        jBackGround.setPreferredSize(new java.awt.Dimension(985, 560));

        jContent.setBackground(new java.awt.Color(241, 241, 241));
        jContent.setBorder(javax.swing.BorderFactory.createMatteBorder(21, 0, 21, 19, new java.awt.Color(0, 0, 0)));
        jContent.setPreferredSize(new java.awt.Dimension(528, 510));

        jImageBackGround.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jImageBackGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Images/FondoZorroSaltando.jpg"))); // NOI18N
        jImageBackGround.setPreferredSize(new java.awt.Dimension(497, 456));

        jGreetingHome.setFont(new java.awt.Font("Roboto Black", 2, 24)); // NOI18N
        jGreetingHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jGreetingHome.setText("¡Gestiona tus viajes!");

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        javax.swing.GroupLayout jContentLayout = new javax.swing.GroupLayout(jContent);
        jContent.setLayout(jContentLayout);
        jContentLayout.setHorizontalGroup(
            jContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jContentLayout.createSequentialGroup()
                .addGroup(jContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jContentLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jGreetingHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jContentLayout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jImageBackGround, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 696, Short.MAX_VALUE)
        );
        jContentLayout.setVerticalGroup(
            jContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jContentLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jGreetingHome)
                .addGap(0, 0, 0)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jImageBackGround, javax.swing.GroupLayout.PREFERRED_SIZE, 471, Short.MAX_VALUE))
        );

        jMenuOptions.setBackground(new java.awt.Color(255, 255, 255));
        jMenuOptions.setBorder(javax.swing.BorderFactory.createMatteBorder(20, 10, 20, 10, new java.awt.Color(0, 0, 0)));
        jMenuOptions.setPreferredSize(new java.awt.Dimension(293, 510));
        jMenuOptions.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jMenuTitle.setFont(new java.awt.Font("Roboto Black", 3, 34)); // NOI18N
        jMenuTitle.setForeground(new java.awt.Color(255, 255, 255));
        jMenuTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenuTitle.setText("MENÚ");
        jMenuTitle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuTitle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuTitleMouseClicked(evt);
            }
        });
        jMenuOptions.add(jMenuTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 35, 250, 26));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuOptions.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 67, 150, 16));

        jMyPerfileButton.setBackground(new java.awt.Color(242, 242, 242));
        jMyPerfileButton.setFont(new java.awt.Font("Roboto Black", 2, 16)); // NOI18N
        jMyPerfileButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Images/Edit.png"))); // NOI18N
        jMyPerfileButton.setText(" Mi perfíl      ");
        jMyPerfileButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jMyPerfileButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMyPerfileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMyPerfileButtonActionPerformed(evt);
            }
        });
        jMenuOptions.add(jMyPerfileButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 293, 215, 50));

        jBudgetButton.setBackground(new java.awt.Color(242, 242, 242));
        jBudgetButton.setFont(new java.awt.Font("Roboto Black", 2, 16)); // NOI18N
        jBudgetButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Images/BudgetPNG.png"))); // NOI18N
        jBudgetButton.setText(" Presupuestos  ");
        jBudgetButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jBudgetButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBudgetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBudgetButtonActionPerformed(evt);
            }
        });
        jMenuOptions.add(jBudgetButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 225, 215, 50));

        jMyVehicleButton.setBackground(new java.awt.Color(242, 242, 242));
        jMyVehicleButton.setFont(new java.awt.Font("Roboto Black", 2, 16)); // NOI18N
        jMyVehicleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Images/CarPng_1.png"))); // NOI18N
        jMyVehicleButton.setText(" Mi vehículo      ");
        jMyVehicleButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jMyVehicleButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMyVehicleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMyVehicleButtonActionPerformed(evt);
            }
        });
        jMenuOptions.add(jMyVehicleButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 157, 215, 50));

        jTouristPlacesButton.setBackground(new java.awt.Color(242, 242, 242));
        jTouristPlacesButton.setFont(new java.awt.Font("Roboto Black", 2, 16)); // NOI18N
        jTouristPlacesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Images/LogoPNG40.png"))); // NOI18N
        jTouristPlacesButton.setText("Destinos Turisticos");
        jTouristPlacesButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTouristPlacesButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTouristPlacesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTouristPlacesButtonActionPerformed(evt);
            }
        });
        jMenuOptions.add(jTouristPlacesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 89, 215, 50));

        jLogOutButton.setBackground(new java.awt.Color(242, 242, 242));
        jLogOutButton.setFont(new java.awt.Font("Roboto Black", 2, 16)); // NOI18N
        jLogOutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Images/LogOut.png"))); // NOI18N
        jLogOutButton.setText(" Cerrar Sesion ");
        jLogOutButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jLogOutButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLogOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLogOutButtonActionPerformed(evt);
            }
        });
        jMenuOptions.add(jLogOutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 361, 215, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("● ● ●");
        jMenuOptions.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 250, -1));

        dateField2.setBackground(new java.awt.Color(0, 0, 0));
        dateField2.setFont(new java.awt.Font("Serif", 3, 20)); // NOI18N
        dateField2.setForeground(new java.awt.Color(255, 255, 255));
        dateField2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dateField2.setText("12/07/2023");
        jMenuOptions.add(dateField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 230, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Images/fondoMaderaNegra.jpg"))); // NOI18N
        jMenuOptions.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 250, 520));

        javax.swing.GroupLayout jBackGroundLayout = new javax.swing.GroupLayout(jBackGround);
        jBackGround.setLayout(jBackGroundLayout);
        jBackGroundLayout.setHorizontalGroup(
            jBackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jBackGroundLayout.createSequentialGroup()
                .addComponent(jMenuOptions, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jContent, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jBackGroundLayout.setVerticalGroup(
            jBackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jMenuOptions, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jContent, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jBackGround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jBackGround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBudgetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBudgetButtonActionPerformed
        MenuBudgetsPanel menuBudgets = new MenuBudgetsPanel();
        showMenusPanel(menuBudgets);
    }//GEN-LAST:event_jBudgetButtonActionPerformed

    private void jTouristPlacesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTouristPlacesButtonActionPerformed
        MenuTouristPlacesPanel menuTouristPlaces = new MenuTouristPlacesPanel();
        showMenusPanel(menuTouristPlaces);
    }//GEN-LAST:event_jTouristPlacesButtonActionPerformed

    private void jLogOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLogOutButtonActionPerformed
        int resp=Home.optionMsg("Desea cerrar sesion?");
            if(resp == JOptionPane.YES_OPTION){
                new LogIn().setVisible(true);
                UserData.setActiveUser(null);
                System.out.println("***" + UserData.getActiveUser());
                this.dispose();
                System.out.println("***OUT"); 
            }   
        

    }//GEN-LAST:event_jLogOutButtonActionPerformed

    private void jMyVehicleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMyVehicleButtonActionPerformed
        MenuVehiclesPanel menuVehicles = new MenuVehiclesPanel();
        showMenusPanel(menuVehicles);
    }//GEN-LAST:event_jMyVehicleButtonActionPerformed

    private void jMenuTitleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuTitleMouseClicked
        DefaultHome home = new DefaultHome();
        showMenusPanel(home);
    }//GEN-LAST:event_jMenuTitleMouseClicked

    private void jMyPerfileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMyPerfileButtonActionPerformed
        Perfile perfile= new Perfile();
        showMenusPanel(perfile);
    }//GEN-LAST:event_jMyPerfileButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dateField2;
    private javax.swing.JPanel jBackGround;
    private javax.swing.JButton jBudgetButton;
    private javax.swing.JPanel jContent;
    private javax.swing.JLabel jGreetingHome;
    private javax.swing.JLabel jImageBackGround;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jLogOutButton;
    private javax.swing.JPanel jMenuOptions;
    private javax.swing.JLabel jMenuTitle;
    private javax.swing.JButton jMyPerfileButton;
    private javax.swing.JButton jMyVehicleButton;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton jTouristPlacesButton;
    // End of variables declaration//GEN-END:variables

    class BackGroundPanel extends JPanel
    {
        private Image imagen;
        
        @Override
        public void paint(Graphics g){
            imagen= new ImageIcon(getClass().getResource("/com.Images/FondoBosque2.jpg")).getImage();
            
            g.drawImage(imagen,0,0, getWidth(), getHeight(), this);
            
            setOpaque(false);
            super.paint(g);
        }    
    }




}
