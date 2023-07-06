package com.graphyinterface;

import com.model.User;
import data.controller.UserData;
import java.awt.Color;
import com.graphyinterface.Home;

public class LogIn extends javax.swing.JFrame {

    public LogIn() {
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

        BackGround = new javax.swing.JPanel();
        jImage = new javax.swing.JLabel();
        jLogInSection = new javax.swing.JPanel();
        jTitle = new javax.swing.JLabel();
        jLabelTitleUser = new javax.swing.JLabel();
        jTextUserEmail = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelTitlePassword = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButtonLogIn = new javax.swing.JButton();
        jButtonCheckIn = new javax.swing.JButton();
        jLogInState = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TRAVEL FUEL-MANAGER APP");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        BackGround.setBackground(new java.awt.Color(0, 0, 0));
        BackGround.setPreferredSize(new java.awt.Dimension(800, 540));
        BackGround.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Images/beach.jpg"))); // NOI18N
        jImage.setText("jLabel1");
        jImage.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        BackGround.add(jImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 420, 490));

        jLogInSection.setBackground(new java.awt.Color(255, 255, 255));
        jLogInSection.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTitle.setBackground(new java.awt.Color(236, 109, 32));
        jTitle.setFont(new java.awt.Font("Roboto Black", 1, 20)); // NOI18N
        jTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTitle.setText("INICIO DE SESIÓN");

        jLabelTitleUser.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabelTitleUser.setText("USUARIO");

        jTextUserEmail.setForeground(new java.awt.Color(204, 204, 204));
        jTextUserEmail.setText("Ingrese su Email");
        jTextUserEmail.setBorder(null);
        jTextUserEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextUserEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextUserEmailFocusLost(evt);
            }
        });
        jTextUserEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextUserEmailActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jLabelTitlePassword.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabelTitlePassword.setText("CONTRASEÑA");

        jPasswordField.setForeground(new java.awt.Color(204, 204, 204));
        jPasswordField.setText("**************");
        jPasswordField.setBorder(null);
        jPasswordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordFieldFocusLost(evt);
            }
        });
        jPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldActionPerformed(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("● ● ●");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Images/travel (1).jpg"))); // NOI18N
        jLabel5.setText("jLabel5");

        jButtonLogIn.setBackground(new java.awt.Color(242, 242, 242));
        jButtonLogIn.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jButtonLogIn.setText("INGRESAR");
        jButtonLogIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonLogIn.setPreferredSize(new java.awt.Dimension(89, 35));
        jButtonLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogInActionPerformed(evt);
            }
        });

        jButtonCheckIn.setBackground(new java.awt.Color(242, 242, 242));
        jButtonCheckIn.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jButtonCheckIn.setText("REGISTRARSE");
        jButtonCheckIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCheckIn.setPreferredSize(new java.awt.Dimension(112, 35));
        jButtonCheckIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCheckInActionPerformed(evt);
            }
        });

        jLogInState.setForeground(new java.awt.Color(255, 102, 102));
        jLogInState.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jLogInSectionLayout = new javax.swing.GroupLayout(jLogInSection);
        jLogInSection.setLayout(jLogInSectionLayout);
        jLogInSectionLayout.setHorizontalGroup(
            jLogInSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLogInSectionLayout.createSequentialGroup()
                .addGap(0, 106, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
            .addGroup(jLogInSectionLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jLogInSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelTitlePassword)
                    .addComponent(jTextUserEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addComponent(jPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                    .addComponent(jSeparator2)
                    .addComponent(jLabelTitleUser, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLogInState, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLogInSectionLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLogInSectionLayout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLogInSectionLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jButtonCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLogInSectionLayout.setVerticalGroup(
            jLogInSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLogInSectionLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(54, 54, 54)
                .addComponent(jLabelTitleUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextUserEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTitlePassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLogInState, javax.swing.GroupLayout.DEFAULT_SIZE, 6, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButtonLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        BackGround.add(jLogInSection, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 320, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackGround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BackGround, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextUserEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextUserEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextUserEmailActionPerformed

    private void jPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldActionPerformed

    private void jButtonLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogInActionPerformed
        String userEmail = jTextUserEmail.getText();
        String userPassword = String.valueOf(jPasswordField.getPassword());

        if (UserData.validateUser(userEmail, userPassword)) {
            User user = UserData.ActiveUser(userEmail);
            new Home(user).setVisible(true);
            
            UserData.setActiveUser(user);
            System.out.println("*** " + UserData.getActiveUser());
            dispose();
        } else {
            jLogInState.setText("Credenciales de Ingreso invalidas");
        }
    }//GEN-LAST:event_jButtonLogInActionPerformed

    private void jButtonCheckInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCheckInActionPerformed
        jLogInState.setText("");
        new CheckIn().setVisible(true);
    }//GEN-LAST:event_jButtonCheckInActionPerformed

    private void jTextUserEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextUserEmailFocusGained
        if (jTextUserEmail.getText().equalsIgnoreCase("Ingrese su Email")) {
            jTextUserEmail.setText("");
            jTextUserEmail.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jTextUserEmailFocusGained

    private void jTextUserEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextUserEmailFocusLost
        if (jTextUserEmail.getText().equalsIgnoreCase("")) {
            jTextUserEmail.setText("Ingrese su Email");
            jTextUserEmail.setForeground(Color.lightGray);
        }
    }//GEN-LAST:event_jTextUserEmailFocusLost

    private void jPasswordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldFocusGained
        if (String.valueOf(jPasswordField.getPassword()).equals("**************")) {
            jPasswordField.setText("");
            jPasswordField.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jPasswordFieldFocusGained

    private void jPasswordFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldFocusLost
        if (String.valueOf(jPasswordField.getPassword()).isEmpty()) {
            jPasswordField.setText("**************");
            jPasswordField.setForeground(Color.lightGray);
        }
    }//GEN-LAST:event_jPasswordFieldFocusLost

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        UserData.AddAdmin();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);

            }
        });

        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackGround;
    private javax.swing.JButton jButtonCheckIn;
    private javax.swing.JButton jButtonLogIn;
    private javax.swing.JLabel jImage;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelTitlePassword;
    private javax.swing.JLabel jLabelTitleUser;
    private javax.swing.JPanel jLogInSection;
    private javax.swing.JLabel jLogInState;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextUserEmail;
    private javax.swing.JLabel jTitle;
    // End of variables declaration//GEN-END:variables
}