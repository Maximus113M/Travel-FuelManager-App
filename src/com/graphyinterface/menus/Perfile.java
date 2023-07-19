package com.graphyinterface.menus;

import com.graphyinterface.Home;
import static com.graphyinterface.Home.setSizePanels;
import com.model.User;
import data.controller.UserData;
import data.functions.GenericFunctions;
import java.awt.BorderLayout;
import javax.swing.border.Border;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JTextField;

public class Perfile extends javax.swing.JPanel {

    private User activeUser = UserData.getActiveUser();
    private Border border = BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(190, 190, 190));
    private boolean changePassword;
    private boolean editDate;

    public Perfile() {
        initComponents();
        changePassword = false;
        editDate = false;
        jUserLabel.setText(activeUser.getEmail());
        nameUserField.setText(activeUser.getName());
        notEditableColor(nameUserField);
        phoneNumberField.setText(activeUser.getNumber());
        notEditableColor(phoneNumberField);
    }

    public void defaultEditable(JTextField field) {
        field.setBorder(border);
        field.setEditable(true);
        field.setFocusable(true);
        field.setForeground(new java.awt.Color(50, 50, 50));
        field.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
    }

    public void notEditableColor(JTextField field) {
        field.setForeground(new java.awt.Color(130, 130, 130));
    }

    public void reLoadPanel() {
        Perfile perf = new Perfile();
        setSizePanels(perf);
        this.removeAll();
        this.add(perf, BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
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
        sectionHeader = new javax.swing.JPanel();
        sectionTitle = new javax.swing.JLabel();
        jForm = new javax.swing.JPanel();
        UserImage = new javax.swing.JLabel();
        jUserLabel = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        nameUserField = new javax.swing.JTextField();
        phoneNumber = new javax.swing.JLabel();
        phoneNumberField = new javax.swing.JTextField();
        jEditPassword = new javax.swing.JButton();
        passwordTitle = new javax.swing.JLabel();
        jInputPassword = new javax.swing.JPasswordField();
        newPasswordTitle1 = new javax.swing.JLabel();
        newPasswordTitle2 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jSaveForm = new javax.swing.JButton();
        jEditForm = new javax.swing.JButton();
        jWarning = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        phoneNumber1 = new javax.swing.JLabel();
        rightBackGround = new javax.swing.JLabel();
        leftBackGround = new javax.swing.JLabel();

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

        setBackground(new java.awt.Color(0, 0, 0));
        setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 21, 19, new java.awt.Color(0, 0, 0)));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(715, 560));

        sectionHeader.setBackground(new java.awt.Color(0, 0, 0));
        sectionHeader.setPreferredSize(new java.awt.Dimension(668, 34));

        sectionTitle.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        sectionTitle.setForeground(new java.awt.Color(255, 255, 255));
        sectionTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sectionTitle.setText("PERFIL DE USUARIO");

        javax.swing.GroupLayout sectionHeaderLayout = new javax.swing.GroupLayout(sectionHeader);
        sectionHeader.setLayout(sectionHeaderLayout);
        sectionHeaderLayout.setHorizontalGroup(
            sectionHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sectionHeaderLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(sectionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        sectionHeaderLayout.setVerticalGroup(
            sectionHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sectionHeaderLayout.createSequentialGroup()
                .addComponent(sectionTitle)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        jForm.setBackground(new java.awt.Color(255, 255, 255));
        jForm.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jForm.setPreferredSize(new java.awt.Dimension(308, 420));

        UserImage.setBackground(new java.awt.Color(204, 204, 204));
        UserImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UserImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Images/gatoSmokinRecortada70x90.jpg"))); // NOI18N
        UserImage.setOpaque(true);

        jUserLabel.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jUserLabel.setForeground(new java.awt.Color(51, 51, 51));
        jUserLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jUserLabel.setText("MaximusMeridio@gmail.edu.co");

        name.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        name.setText("NOMBRE");

        nameUserField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(230, 230, 230)));
        nameUserField.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        nameUserField.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        nameUserField.setFocusable(false);
        nameUserField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameUserFieldActionPerformed(evt);
            }
        });
        nameUserField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameUserFieldKeyTyped(evt);
            }
        });

        phoneNumber.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        phoneNumber.setText("TELEFONO");

        phoneNumberField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(230, 230, 230)));
        phoneNumberField.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        phoneNumberField.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        phoneNumberField.setFocusable(false);
        phoneNumberField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                phoneNumberFieldKeyTyped(evt);
            }
        });

        jEditPassword.setBackground(new java.awt.Color(204, 204, 204));
        jEditPassword.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jEditPassword.setText("CAMBIAR");
        jEditPassword.setPreferredSize(new java.awt.Dimension(100, 35));
        jEditPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEditPasswordActionPerformed(evt);
            }
        });

        passwordTitle.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        passwordTitle.setText("CAMBIAR CONTRASENA");

        jInputPassword.setForeground(new java.awt.Color(204, 204, 204));
        jInputPassword.setText("jPasswordField1");
        jInputPassword.setToolTipText("Ingrese su Contraseña");
        jInputPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        jInputPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jInputPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jInputPasswordFocusLost(evt);
            }
        });

        newPasswordTitle1.setFont(new java.awt.Font("Roboto Black", 3, 12)); // NOI18N

        newPasswordTitle2.setFont(new java.awt.Font("Roboto Black", 3, 12)); // NOI18N

        jPasswordField1.setEditable(false);
        jPasswordField1.setBorder(null);
        jPasswordField1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPasswordField1.setFocusable(false);

        jPasswordField2.setEditable(false);
        jPasswordField2.setBorder(null);
        jPasswordField2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPasswordField2.setFocusable(false);

        jSaveForm.setBackground(new java.awt.Color(0, 0, 0));
        jSaveForm.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jSaveForm.setForeground(new java.awt.Color(255, 255, 255));
        jSaveForm.setText("GUARDAR");
        jSaveForm.setEnabled(false);
        jSaveForm.setPreferredSize(new java.awt.Dimension(100, 35));
        jSaveForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSaveFormActionPerformed(evt);
            }
        });

        jEditForm.setBackground(new java.awt.Color(0, 0, 0));
        jEditForm.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jEditForm.setForeground(new java.awt.Color(255, 255, 255));
        jEditForm.setText("EDITAR");
        jEditForm.setPreferredSize(new java.awt.Dimension(100, 35));
        jEditForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEditFormActionPerformed(evt);
            }
        });

        jWarning.setForeground(new java.awt.Color(255, 51, 51));
        jWarning.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jWarning.setText(" ");

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setFocusable(false);
        jScrollPane1.setOpaque(false);

        jTextArea1.setColumns(4);
        jTextArea1.setFont(new java.awt.Font("Serif", 0, 10)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(153, 153, 153));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("Ultima Conexion\n    15/11/2023");
        jTextArea1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextArea1.setFocusable(false);
        jScrollPane1.setViewportView(jTextArea1);

        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane2.setFocusable(false);
        jScrollPane2.setOpaque(false);

        jTextArea2.setColumns(4);
        jTextArea2.setFont(new java.awt.Font("Serif", 0, 10)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(153, 153, 153));
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setText("Ultima Actualizacion\n    15/11/2023");
        jTextArea2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextArea2.setFocusable(false);
        jScrollPane2.setViewportView(jTextArea2);

        jRadioButton1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(51, 51, 51));
        jRadioButton1.setText("Hombre");

        jRadioButton2.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(51, 51, 51));
        jRadioButton2.setText("Mujer");

        phoneNumber1.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        phoneNumber1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        phoneNumber1.setText("GENERO");

        javax.swing.GroupLayout jFormLayout = new javax.swing.GroupLayout(jForm);
        jForm.setLayout(jFormLayout);
        jFormLayout.setHorizontalGroup(
            jFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFormLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jWarning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jFormLayout.createSequentialGroup()
                        .addGroup(jFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jUserLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jFormLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(UserImage, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jScrollPane1))
                            .addGroup(jFormLayout.createSequentialGroup()
                                .addGroup(jFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jFormLayout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addGroup(jFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(phoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(phoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jRadioButton1)
                                            .addComponent(jRadioButton2)
                                            .addGroup(jFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(nameUserField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                                                .addComponent(name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(phoneNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(jFormLayout.createSequentialGroup()
                                                    .addComponent(jInputPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jEditPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(newPasswordTitle1)
                                                .addComponent(newPasswordTitle2)
                                                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(passwordTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                    .addGroup(jFormLayout.createSequentialGroup()
                                        .addGap(57, 57, 57)
                                        .addComponent(jEditForm, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jSaveForm, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jFormLayout.setVerticalGroup(
            jFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFormLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(UserImage)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jUserLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(name)
                .addGap(0, 0, 0)
                .addComponent(nameUserField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(phoneNumber)
                .addGap(0, 0, 0)
                .addComponent(phoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phoneNumber1)
                .addGap(0, 0, 0)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jEditPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jInputPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newPasswordTitle1)
                .addGap(0, 0, 0)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(newPasswordTitle2)
                .addGap(0, 0, 0)
                .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jEditForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSaveForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jWarning)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        rightBackGround.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rightBackGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Images/FondoGrisMetal.jpg"))); // NOI18N
        rightBackGround.setPreferredSize(new java.awt.Dimension(180, 580));

        leftBackGround.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        leftBackGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Images/FondoGrisMetal.jpg"))); // NOI18N
        leftBackGround.setPreferredSize(new java.awt.Dimension(180, 580));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(leftBackGround, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jForm, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(rightBackGround, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(sectionHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 696, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sectionHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rightBackGround, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jForm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
                    .addComponent(leftBackGround, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jEditFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEditFormActionPerformed
        defaultEditable(nameUserField);
        defaultEditable(phoneNumberField);
        jSaveForm.setEnabled(true);
        editDate = true;
    }//GEN-LAST:event_jEditFormActionPerformed

    private void nameUserFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameUserFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameUserFieldActionPerformed

    private void jSaveFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSaveFormActionPerformed
        jWarning.setText(" ");
        if (changePassword) {
            if (String.valueOf(jPasswordField1.getPassword()).equals(String.valueOf(jPasswordField2.getPassword()))) {
                if (!String.valueOf(jPasswordField1.getPassword()).isBlank() && String.valueOf(jPasswordField1.getPassword()).length() >= 5) {
                    activeUser.setName(nameUserField.getText());
                    activeUser.setNumber(phoneNumberField.getText());
                    activeUser.setPassword(String.valueOf(jPasswordField1.getPassword()));
                    Home.msgSucessfulAction("Datos Actualizados");
                    reLoadPanel();
                } else if (String.valueOf(jPasswordField1.getPassword()).isBlank() && editDate) {
                    activeUser.setName(nameUserField.getText());
                    activeUser.setNumber(phoneNumberField.getText());
                    Home.msgSucessfulAction("Datos Actualizados");
                    reLoadPanel();
                } else if (String.valueOf(jPasswordField1.getPassword()).isBlank()){
                    Home.msgSucessfulAction("Sin Cambios");
                    reLoadPanel();
                } else if(String.valueOf(jPasswordField1.getPassword()).length() < 5){
                    jWarning.setText("Contraseña Invalida o No Coincide");
                }
            }else{
                jWarning.setText("Contraseña Invalida o No Coincide");
            }
        } else {           
            if (phoneNumberField.getText().length() != 10 || nameUserField.getText().isBlank()) {
                if (phoneNumberField.getText().length() != 10) {
                    jWarning.setText("Telefono Incorrecto");
                } else {
                    jWarning.setText("No puedes dejar Campos vacios");
                }
            } else {
                activeUser.setName(nameUserField.getText());
                activeUser.setNumber(phoneNumberField.getText());
                Home.msgSucessfulAction("Datos Actualizados");
                reLoadPanel();
            }
        }

    }//GEN-LAST:event_jSaveFormActionPerformed

    private void jEditPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEditPasswordActionPerformed
        if (activeUser.getPassword().equals(String.valueOf(jInputPassword.getPassword()))) {

            newPasswordTitle1.setText("NUEVA CONTRASEÑA");
            defaultEditable(jPasswordField1);
            jPasswordField1.setBorder(border);

            newPasswordTitle2.setText("REPITA LA CONTRASEÑA");
            defaultEditable(jPasswordField2);
            jPasswordField2.setBorder(border);

            jSaveForm.setEnabled(true);
            changePassword = true;
        } else {
            Home.msgError("Contraseña Incorrecta");
        }
    }//GEN-LAST:event_jEditPasswordActionPerformed

    private void phoneNumberFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneNumberFieldKeyTyped
        GenericFunctions.inputOnlyNumber(evt);
        if (phoneNumberField.getText().length() > 9) {
            evt.consume();
        }
    }//GEN-LAST:event_phoneNumberFieldKeyTyped

    private void jInputPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jInputPasswordFocusGained
        if (String.valueOf(jInputPassword.getPassword()).equals("jPasswordField1")) {
            jInputPassword.setText("");
            jInputPassword.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jInputPasswordFocusGained

    private void jInputPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jInputPasswordFocusLost
        if (String.valueOf(jInputPassword.getPassword()).equals("")) {
            jInputPassword.setText("jPasswordField1");
            jInputPassword.setForeground(Color.lightGray);
        }
    }//GEN-LAST:event_jInputPasswordFocusLost

    private void nameUserFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameUserFieldKeyTyped
        if(nameUserField.getText().length() > 30){
            evt.consume();
        }
    }//GEN-LAST:event_nameUserFieldKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel UserImage;
    private javax.swing.JPanel jContent;
    private javax.swing.JButton jEditForm;
    private javax.swing.JButton jEditPassword;
    private javax.swing.JPanel jForm;
    private javax.swing.JPasswordField jInputPassword;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JButton jSaveForm;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel jUserLabel;
    private javax.swing.JLabel jWarning;
    private javax.swing.JLabel leftBackGround;
    private javax.swing.JLabel name;
    private javax.swing.JTextField nameUserField;
    private javax.swing.JLabel newPasswordTitle1;
    private javax.swing.JLabel newPasswordTitle2;
    private javax.swing.JLabel passwordTitle;
    private javax.swing.JLabel phoneNumber;
    private javax.swing.JLabel phoneNumber1;
    private javax.swing.JTextField phoneNumberField;
    private javax.swing.JLabel rightBackGround;
    private javax.swing.JPanel sectionHeader;
    private javax.swing.JLabel sectionTitle;
    // End of variables declaration//GEN-END:variables
}
