/*
 * Copyright (C) 2021 Evelyn López Nieto
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package Usuarios_sistema;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Evelyn López Nieto
 */
public class Administracion_usuarios extends javax.swing.JDialog {

    Operaciones_usuarios usuario = new Operaciones_usuarios();
    Icon valido = new ImageIcon(getClass().getResource("/recursos_graficos/1.png"));
    
    public Administracion_usuarios(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/recursos_graficos/icono_scikoolebil_2.png")).getImage());
        this.txtIDpersonalEliminar.setEnabled(false);
        this.btnEliminarPerfil.setEnabled(false);
        this.tblPerfiles.setEnabled(false);
        this.pnlPerfiles.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pm_tblPerfiles = new javax.swing.JPopupMenu();
        mi_verReg_tblPerfiles = new javax.swing.JMenuItem();
        pnlPerfiles = new javax.swing.JPanel();
        pnl_tblHistorialUser = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHistorialUser = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtPaternoUser = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMaternoUser = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTelefonoUser = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPuestoUser = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        rbtnMatutino = new javax.swing.JRadioButton();
        rbtnVespertino = new javax.swing.JRadioButton();
        lblIDuser = new javax.swing.JLabel();
        txtNombreUser = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtPasswordUser = new javax.swing.JTextField();
        btnEditarInfUser = new RSMaterialComponent.RSButtonIconOne();
        btnGuardarNUser = new RSMaterialComponent.RSButtonIconOne();
        btnHistorialUser = new rojeru_san.rsbutton.RSButtonForma();
        rbtnAdmin = new javax.swing.JRadioButton();
        rbtnUser = new javax.swing.JRadioButton();
        btnActualizarInfUser = new RSMaterialComponent.RSButtonIconOne();
        pnlControlesPerfiles = new javax.swing.JPanel();
        rbtnVerPerfiles = new javax.swing.JRadioButton();
        rbtnIngresarNuser = new javax.swing.JRadioButton();
        rbtnEliminarPerfiles = new javax.swing.JRadioButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblPerfiles = new javax.swing.JTable();
        txtIDpersonalEliminar = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnEliminarPerfil = new rojeru_san.rsbutton.RSButtonForma();

        mi_verReg_tblPerfiles.setText("Ver datos del perfil");
        mi_verReg_tblPerfiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_verReg_tblPerfilesActionPerformed(evt);
            }
        });
        pm_tblPerfiles.add(mi_verReg_tblPerfiles);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Administración de usuarios");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlPerfiles.setBackground(new java.awt.Color(153, 204, 0));
        pnlPerfiles.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_tblHistorialUser.setBackground(new java.awt.Color(102, 204, 0));
        pnl_tblHistorialUser.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblHistorialUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "ID acceso", "Fecha acceso", "Hora acceso", "Movimiento"
            }
        ));
        jScrollPane1.setViewportView(tblHistorialUser);

        pnl_tblHistorialUser.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 430, 150));

        pnlPerfiles.add(pnl_tblHistorialUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 450, 160));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel2.setText("Nombre:");
        pnlPerfiles.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 135, 50, -1));

        txtPaternoUser.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        pnlPerfiles.add(txtPaternoUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 205, 210, 30));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel3.setText("Apellido paterno:");
        pnlPerfiles.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 185, 100, -1));

        txtMaternoUser.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        pnlPerfiles.add(txtMaternoUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 255, 210, 30));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel4.setText("Apellido materno:");
        pnlPerfiles.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 235, 100, -1));

        txtTelefonoUser.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        pnlPerfiles.add(txtTelefonoUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 305, 210, 30));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel5.setText("Teléfono:");
        pnlPerfiles.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 285, 60, -1));

        txtPuestoUser.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        pnlPerfiles.add(txtPuestoUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 355, 210, 30));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel6.setText("Puesto:");
        pnlPerfiles.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 335, 50, -1));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel7.setText("Turno:");
        pnlPerfiles.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 135, 40, -1));

        rbtnMatutino.setBackground(new java.awt.Color(153, 204, 0));
        rbtnMatutino.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        rbtnMatutino.setText("Matutino");
        rbtnMatutino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtnMatutinoMouseClicked(evt);
            }
        });
        pnlPerfiles.add(rbtnMatutino, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 155, -1, -1));

        rbtnVespertino.setBackground(new java.awt.Color(153, 204, 0));
        rbtnVespertino.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        rbtnVespertino.setText("Vespertino");
        rbtnVespertino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtnVespertinoMouseClicked(evt);
            }
        });
        pnlPerfiles.add(rbtnVespertino, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 155, -1, -1));

        lblIDuser.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        lblIDuser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIDuser.setText("#");
        lblIDuser.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlPerfiles.add(lblIDuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 5, 100, 100));

        txtNombreUser.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        pnlPerfiles.add(txtNombreUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 155, 210, 30));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel1.setText("Privilegios:");
        pnlPerfiles.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 185, 70, -1));

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel9.setText("Usuario:");
        pnlPerfiles.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 285, 60, -1));

        txtUsuario.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        pnlPerfiles.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 305, 210, 30));

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel10.setText("Contraseña:");
        pnlPerfiles.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 335, 70, -1));

        txtPasswordUser.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        pnlPerfiles.add(txtPasswordUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 355, 210, 30));

        btnEditarInfUser.setBackground(new java.awt.Color(0, 0, 153));
        btnEditarInfUser.setToolTipText("Editar datos de perfil");
        btnEditarInfUser.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.EDIT);
        btnEditarInfUser.setTypeBorder(RSMaterialComponent.RSButtonIconOne.TYPEBORDER.CIRCLE);
        btnEditarInfUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarInfUserActionPerformed(evt);
            }
        });
        pnlPerfiles.add(btnEditarInfUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 395, -1, -1));

        btnGuardarNUser.setBackground(new java.awt.Color(0, 0, 153));
        btnGuardarNUser.setToolTipText("Insertar nuevo perfil");
        btnGuardarNUser.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SAVE);
        btnGuardarNUser.setTypeBorder(RSMaterialComponent.RSButtonIconOne.TYPEBORDER.CIRCLE);
        btnGuardarNUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarNUserActionPerformed(evt);
            }
        });
        pnlPerfiles.add(btnGuardarNUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 395, -1, -1));

        btnHistorialUser.setBackground(new java.awt.Color(0, 0, 153));
        btnHistorialUser.setText("Historial");
        btnHistorialUser.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnHistorialUser.setForma(rojeru_san.rsbutton.RSButtonForma.FORMA.ROUND);
        btnHistorialUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistorialUserActionPerformed(evt);
            }
        });
        pnlPerfiles.add(btnHistorialUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 395, 100, -1));

        rbtnAdmin.setBackground(new java.awt.Color(153, 204, 0));
        rbtnAdmin.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        rbtnAdmin.setText("Administrador");
        rbtnAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtnAdminMouseClicked(evt);
            }
        });
        pnlPerfiles.add(rbtnAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 205, -1, -1));

        rbtnUser.setBackground(new java.awt.Color(153, 204, 0));
        rbtnUser.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        rbtnUser.setText("Usuario");
        rbtnUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtnUserMouseClicked(evt);
            }
        });
        pnlPerfiles.add(rbtnUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 205, -1, -1));

        btnActualizarInfUser.setBackground(new java.awt.Color(0, 0, 153));
        btnActualizarInfUser.setToolTipText("Actualizar datos de perfil");
        btnActualizarInfUser.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.UPDATE);
        btnActualizarInfUser.setTypeBorder(RSMaterialComponent.RSButtonIconOne.TYPEBORDER.CIRCLE);
        btnActualizarInfUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarInfUserActionPerformed(evt);
            }
        });
        pnlPerfiles.add(btnActualizarInfUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 395, -1, -1));

        getContentPane().add(pnlPerfiles, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 450, 600));

        pnlControlesPerfiles.setBackground(new java.awt.Color(153, 204, 0));
        pnlControlesPerfiles.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rbtnVerPerfiles.setBackground(new java.awt.Color(153, 204, 0));
        rbtnVerPerfiles.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        rbtnVerPerfiles.setText("Ver perfiles");
        rbtnVerPerfiles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtnVerPerfilesMouseClicked(evt);
            }
        });
        pnlControlesPerfiles.add(rbtnVerPerfiles, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        rbtnIngresarNuser.setBackground(new java.awt.Color(153, 204, 0));
        rbtnIngresarNuser.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        rbtnIngresarNuser.setText("Ingresar nuevo usuario");
        rbtnIngresarNuser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtnIngresarNuserMouseClicked(evt);
            }
        });
        pnlControlesPerfiles.add(rbtnIngresarNuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, -1, -1));

        rbtnEliminarPerfiles.setBackground(new java.awt.Color(153, 204, 0));
        rbtnEliminarPerfiles.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        rbtnEliminarPerfiles.setText("Eliminar perfiles");
        rbtnEliminarPerfiles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtnEliminarPerfilesMouseClicked(evt);
            }
        });
        pnlControlesPerfiles.add(rbtnEliminarPerfiles, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        tblPerfiles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Cargo", "Turno"
            }
        ));
        tblPerfiles.setComponentPopupMenu(pm_tblPerfiles);
        jScrollPane3.setViewportView(tblPerfiles);

        pnlControlesPerfiles.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 430, 150));

        txtIDpersonalEliminar.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        pnlControlesPerfiles.add(txtIDpersonalEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 210, 30));

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel11.setText("Ingrese ID de personal:");
        pnlControlesPerfiles.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        btnEliminarPerfil.setBackground(new java.awt.Color(0, 0, 153));
        btnEliminarPerfil.setText("Eliminar");
        btnEliminarPerfil.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnEliminarPerfil.setForma(rojeru_san.rsbutton.RSButtonForma.FORMA.ROUND);
        btnEliminarPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPerfilActionPerformed(evt);
            }
        });
        pnlControlesPerfiles.add(btnEliminarPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 100, -1));

        getContentPane().add(pnlControlesPerfiles, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtnVerPerfilesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnVerPerfilesMouseClicked
        this.rbtnEliminarPerfiles.setSelected(false);
        this.txtIDpersonalEliminar.setEnabled(false);
        this.btnEliminarPerfil.setEnabled(false);
        this.rbtnIngresarNuser.setSelected(false);
        this.tblPerfiles.setEnabled(true);
        this.pnlPerfiles.setVisible(false);

        usuario.verPerfiles(tblPerfiles);

    }//GEN-LAST:event_rbtnVerPerfilesMouseClicked

    private void rbtnEliminarPerfilesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnEliminarPerfilesMouseClicked
        this.rbtnVerPerfiles.setSelected(false);
        this.tblPerfiles.setEnabled(false);
        this.rbtnIngresarNuser.setSelected(false);
        this.txtIDpersonalEliminar.setEnabled(true);
        this.btnEliminarPerfil.setEnabled(true);
        this.pnlPerfiles.setVisible(false);
    }//GEN-LAST:event_rbtnEliminarPerfilesMouseClicked

    private void rbtnIngresarNuserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnIngresarNuserMouseClicked
        this.rbtnVerPerfiles.setSelected(false);
        this.tblPerfiles.setEnabled(false);
        this.rbtnEliminarPerfiles.setSelected(false);
        this.txtIDpersonalEliminar.setEnabled(false);
        this.btnEliminarPerfil.setEnabled(false);

        this.pnlPerfiles.setVisible(true);
        this.btnEditarInfUser.setVisible(false);
        this.btnActualizarInfUser.setVisible(false);
        this.btnGuardarNUser.setVisible(true);
        this.btnHistorialUser.setVisible(false);
        this.pnl_tblHistorialUser.setVisible(false);

        this.lblIDuser.setText("#");
        this.txtNombreUser.setEnabled(true);
        this.txtNombreUser.setText("");
        this.txtPaternoUser.setEnabled(true);
        this.txtPaternoUser.setText("");
        this.txtMaternoUser.setEnabled(true);
        this.txtMaternoUser.setText("");
        this.txtTelefonoUser.setEnabled(true);
        this.txtTelefonoUser.setText("");
        this.txtPuestoUser.setEnabled(true);
        this.txtPuestoUser.setText("");
        this.rbtnMatutino.setEnabled(true);
        this.rbtnMatutino.setSelected(false);
        this.rbtnVespertino.setEnabled(true);
        this.rbtnVespertino.setSelected(false);
        this.rbtnAdmin.setEnabled(true);
        this.rbtnAdmin.setSelected(false);
        this.rbtnUser.setEnabled(true);
        this.rbtnUser.setSelected(false);
        this.txtUsuario.setEnabled(true);
        this.txtUsuario.setText("");
        this.txtPasswordUser.setEnabled(true);
        this.txtPasswordUser.setText("");
    }//GEN-LAST:event_rbtnIngresarNuserMouseClicked

    private void btnEliminarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPerfilActionPerformed

        if (this.txtIDpersonalEliminar.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No ha ingresado ningún dato en el campo", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
        } else {
            int IDuser = Integer.parseInt(this.txtIDpersonalEliminar.getText());
            usuario.eliminarPerfiles(IDuser);
            JOptionPane.showMessageDialog(this, "Perfil eliminado con éxito", "Mensaje del sistema", JOptionPane.PLAIN_MESSAGE, valido);
        }

    }//GEN-LAST:event_btnEliminarPerfilActionPerformed

    private void mi_verReg_tblPerfilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_verReg_tblPerfilesActionPerformed
        this.pnlPerfiles.setVisible(true);
        this.txtNombreUser.setEnabled(false);
        this.txtPaternoUser.setEnabled(false);
        this.txtMaternoUser.setEnabled(false);
        this.txtTelefonoUser.setEnabled(false);
        this.txtPuestoUser.setEnabled(false);
        this.rbtnMatutino.setEnabled(false);
        this.rbtnVespertino.setEnabled(false);
        this.rbtnAdmin.setEnabled(false);
        this.rbtnUser.setEnabled(false);
        this.txtUsuario.setEnabled(false);
        this.txtPasswordUser.setEnabled(false);
        this.btnEditarInfUser.setVisible(true);
        this.btnActualizarInfUser.setVisible(true);
        this.btnGuardarNUser.setVisible(false);
        this.btnHistorialUser.setVisible(true);
        this.pnl_tblHistorialUser.setVisible(true);

        int fila = this.tblPerfiles.getSelectedRow();
        String IDinsumo = this.tblPerfiles.getValueAt(fila, 0).toString();

        if (IDinsumo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "La celda que ha seleccionado está vacía.\n"
                   + " No se mostrará información de ningún registro.", "Información", JOptionPane.INFORMATION_MESSAGE);
        } else {
            int IDinsumoCel = Integer.parseInt(this.tblPerfiles.getValueAt(fila, 0).toString());
            usuario.cargaPerf(IDinsumoCel, lblIDuser, txtNombreUser, txtPaternoUser, txtMaternoUser, txtTelefonoUser,
                   txtPuestoUser, rbtnMatutino, rbtnVespertino, rbtnAdmin, rbtnUser, txtUsuario, txtPasswordUser);
        }
    }//GEN-LAST:event_mi_verReg_tblPerfilesActionPerformed

    private void btnEditarInfUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarInfUserActionPerformed
        this.txtNombreUser.setEnabled(true);
        this.txtPaternoUser.setEnabled(true);
        this.txtMaternoUser.setEnabled(true);
        this.txtTelefonoUser.setEnabled(true);
        this.txtPuestoUser.setEnabled(true);
        this.rbtnMatutino.setEnabled(true);
        this.rbtnVespertino.setEnabled(true);
        this.rbtnAdmin.setEnabled(true);
        this.rbtnUser.setEnabled(true);
        this.txtUsuario.setEnabled(true);
        this.txtPasswordUser.setEnabled(true);
    }//GEN-LAST:event_btnEditarInfUserActionPerformed

    private void btnActualizarInfUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarInfUserActionPerformed
        int ID = Integer.parseInt(this.lblIDuser.getText());
        String nombre = this.txtNombreUser.getText();
        String paterno = this.txtPaternoUser.getText();
        String materno = this.txtMaternoUser.getText();
        String telefono = this.txtTelefonoUser.getText();
        String puesto = this.txtPuestoUser.getText();
        String turno = null;
        if (this.rbtnMatutino.isSelected()) {
            turno = this.rbtnMatutino.getText();
        } else if (this.rbtnVespertino.isSelected()) {
            turno = this.rbtnVespertino.getText();
        }
        String privilegio = null;
        if (this.rbtnAdmin.isSelected()) {
            privilegio = this.rbtnAdmin.getText();
        } else if (this.rbtnUser.isSelected()) {
            privilegio = this.rbtnUser.getText();
        }
        String user = this.txtUsuario.getText();
        String pass = this.txtPasswordUser.getText();

        usuario.editarPerfil(ID, nombre, paterno, materno, telefono, puesto, turno, privilegio, user, pass);
        JOptionPane.showMessageDialog(this, "Perfil actualizado con éxito", "Mensaje del sistema", JOptionPane.PLAIN_MESSAGE, valido);
    }//GEN-LAST:event_btnActualizarInfUserActionPerformed

    private void rbtnMatutinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnMatutinoMouseClicked
        this.rbtnVespertino.setSelected(false);
    }//GEN-LAST:event_rbtnMatutinoMouseClicked

    private void rbtnVespertinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnVespertinoMouseClicked
        this.rbtnMatutino.setSelected(false);
    }//GEN-LAST:event_rbtnVespertinoMouseClicked

    private void rbtnAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnAdminMouseClicked
        this.rbtnUser.setSelected(false);
    }//GEN-LAST:event_rbtnAdminMouseClicked

    private void rbtnUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnUserMouseClicked
        this.rbtnAdmin.setSelected(false);
    }//GEN-LAST:event_rbtnUserMouseClicked

    private void btnGuardarNUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarNUserActionPerformed
        String nombre = this.txtNombreUser.getText();
        String paterno = this.txtPaternoUser.getText();
        String materno = this.txtMaternoUser.getText();
        String telefono = this.txtTelefonoUser.getText();
        String puesto = this.txtPuestoUser.getText();
        String turno = null;
        if (this.rbtnMatutino.isSelected()) {
            turno = this.rbtnMatutino.getText();
        } else if (this.rbtnVespertino.isSelected()) {
            turno = this.rbtnVespertino.getText();
        }
        String privilegio = null;
        if (this.rbtnAdmin.isSelected()) {
            privilegio = this.rbtnAdmin.getText();
        } else if (this.rbtnUser.isSelected()) {
            privilegio = this.rbtnUser.getText();
        }
        String user = this.txtUsuario.getText();
        String pass = this.txtPasswordUser.getText();

        usuario.agregarPerfiles(nombre, paterno, materno, telefono, puesto, turno, privilegio, user, pass);
        JOptionPane.showMessageDialog(this, "Perfil agregado con éxito", "Mensaje del sistema", JOptionPane.PLAIN_MESSAGE, valido);

    }//GEN-LAST:event_btnGuardarNUserActionPerformed

    private void btnHistorialUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistorialUserActionPerformed

        this.pnl_tblHistorialUser.setVisible(true);
        int idUser = Integer.parseInt(this.lblIDuser.getText());
        usuario.historialUser(idUser, tblHistorialUser);

    }//GEN-LAST:event_btnHistorialUserActionPerformed

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
            java.util.logging.Logger.getLogger(Administracion_usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administracion_usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administracion_usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administracion_usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Administracion_usuarios dialog = new Administracion_usuarios(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonIconOne btnActualizarInfUser;
    private RSMaterialComponent.RSButtonIconOne btnEditarInfUser;
    private rojeru_san.rsbutton.RSButtonForma btnEliminarPerfil;
    private RSMaterialComponent.RSButtonIconOne btnGuardarNUser;
    private rojeru_san.rsbutton.RSButtonForma btnHistorialUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblIDuser;
    private javax.swing.JMenuItem mi_verReg_tblPerfiles;
    private javax.swing.JPopupMenu pm_tblPerfiles;
    private javax.swing.JPanel pnlControlesPerfiles;
    private javax.swing.JPanel pnlPerfiles;
    private javax.swing.JPanel pnl_tblHistorialUser;
    private javax.swing.JRadioButton rbtnAdmin;
    private javax.swing.JRadioButton rbtnEliminarPerfiles;
    private javax.swing.JRadioButton rbtnIngresarNuser;
    private javax.swing.JRadioButton rbtnMatutino;
    private javax.swing.JRadioButton rbtnUser;
    private javax.swing.JRadioButton rbtnVerPerfiles;
    private javax.swing.JRadioButton rbtnVespertino;
    private javax.swing.JTable tblHistorialUser;
    private javax.swing.JTable tblPerfiles;
    private javax.swing.JTextField txtIDpersonalEliminar;
    private javax.swing.JTextField txtMaternoUser;
    private javax.swing.JTextField txtNombreUser;
    private javax.swing.JTextField txtPasswordUser;
    private javax.swing.JTextField txtPaternoUser;
    private javax.swing.JTextField txtPuestoUser;
    private javax.swing.JTextField txtTelefonoUser;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
