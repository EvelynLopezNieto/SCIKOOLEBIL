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
package insumos;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Evelyn López Nieto
 */
public class Edicion_insumos extends javax.swing.JDialog {

    Panel_insumos insu = new Panel_insumos();

    public Edicion_insumos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/recursos_graficos/icono_scikoolebil_2.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtIDinsumoEdit = new javax.swing.JTextField();
        txtNombreInsuEdit = new javax.swing.JTextField();
        cbTipoInsuEdit = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaDescripInsuEdit = new javax.swing.JTextArea();
        txtUnitInsuEdit = new javax.swing.JTextField();
        txtTotalInsuEdit = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtaComentInsuEdit = new javax.swing.JTextArea();
        choEntregaInsuEdit = new com.toedter.calendar.JDateChooser();
        choCaduInsuEdit = new com.toedter.calendar.JDateChooser();
        btnUpdateInsuEditDerecho = new rojeru_san.complementos.RSButtonHover();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnUpdateInsumoIzquierda = new rojeru_san.complementos.RSButtonHover();
        jPanel2 = new javax.swing.JPanel();
        lblEncabezado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Actualización de insumo");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtIDinsumoEdit.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txtIDinsumoEdit.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtIDinsumoEditCaretUpdate(evt);
            }
        });
        jPanel1.add(txtIDinsumoEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 220, 30));

        txtNombreInsuEdit.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jPanel1.add(txtNombreInsuEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 220, 30));

        cbTipoInsuEdit.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        cbTipoInsuEdit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione tipo", "vegetal", "animal", "procesado", "bebida procesada", "vinos y licores", "cuidado personal", "jarciería", "detergente", "papelería", "mantenimiento" }));
        jPanel1.add(cbTipoInsuEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 220, 30));

        txtaDescripInsuEdit.setColumns(20);
        txtaDescripInsuEdit.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        txtaDescripInsuEdit.setLineWrap(true);
        txtaDescripInsuEdit.setRows(5);
        jScrollPane1.setViewportView(txtaDescripInsuEdit);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 220, -1));

        txtUnitInsuEdit.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jPanel1.add(txtUnitInsuEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 80, 30));

        txtTotalInsuEdit.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jPanel1.add(txtTotalInsuEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 80, 30));

        txtaComentInsuEdit.setColumns(20);
        txtaComentInsuEdit.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        txtaComentInsuEdit.setRows(5);
        jScrollPane2.setViewportView(txtaComentInsuEdit);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, 220, -1));

        choEntregaInsuEdit.setDateFormatString("yyyy/MM/d");
        choEntregaInsuEdit.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jPanel1.add(choEntregaInsuEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 220, 30));

        choCaduInsuEdit.setDateFormatString("yyyy/MM/d");
        choCaduInsuEdit.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jPanel1.add(choCaduInsuEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 220, 30));

        btnUpdateInsuEditDerecho.setText("Actualizar insumo");
        btnUpdateInsuEditDerecho.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnUpdateInsuEditDerecho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateInsuEditDerechoActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdateInsuEditDerecho, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, 160, -1));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("* ID insumo");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("* Nombre");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("* Tipo de insumo");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Descripción");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("* Precio unitario");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("* Precio total");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, -1, -1));

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Comentarios");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, -1, -1));

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("* Fecha de entrega");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, -1, -1));

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("* Fecha de caducidad");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, -1, -1));

        btnUpdateInsumoIzquierda.setText("Actualizar datos");
        btnUpdateInsumoIzquierda.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnUpdateInsumoIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateInsumoIzquierdaActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdateInsumoIzquierda, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, 150, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 750, 400));

        jPanel2.setBackground(new java.awt.Color(153, 204, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEncabezado.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblEncabezado.setForeground(new java.awt.Color(255, 255, 255));
        lblEncabezado.setText("Actualización de datos de insumo");
        jPanel2.add(lblEncabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateInsuEditDerechoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateInsuEditDerechoActionPerformed

        if (this.txtIDinsumoEdit.getText().isEmpty() || this.txtNombreInsuEdit.getText().isEmpty() || this.cbTipoInsuEdit.getSelectedIndex() == 0
               || this.txtUnitInsuEdit.getText().isEmpty() || this.txtTotalInsuEdit.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Faltan datos obligatorios. Por favor, complete la información", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
        } else {
            int valor = JOptionPane.showConfirmDialog(null, "Se actualizarán los datos de este insumo\n"
                   + "en todas las tablas en las que se utilice.\n"
                   + "¿Está seguro de actualizar la información de este insumo?", "Advertencia", JOptionPane.YES_NO_OPTION);
            if (valor == JOptionPane.YES_OPTION) {
                String idInsu = this.txtIDinsumoEdit.getText();
                String nombreInsu = this.txtNombreInsuEdit.getText();
                String tipo = this.cbTipoInsuEdit.getSelectedItem().toString();
                String descripcion = this.txtaDescripInsuEdit.getText();
                Double precioUni = Double.parseDouble(this.txtUnitInsuEdit.getText());
                Double precioTotal = Double.parseDouble(this.txtTotalInsuEdit.getText());
                String comentario = this.txtaComentInsuEdit.getText();
                Date fecha1 = this.choEntregaInsuEdit.getDate();
                DateFormat formato1 = new SimpleDateFormat("yyyy-MM-dd");
                String fechaEntrega = formato1.format(fecha1);
                Date fecha2 = this.choCaduInsuEdit.getDate();
                DateFormat formato2 = new SimpleDateFormat("yyyy-MM-dd");
                String fechaCaducidad = formato2.format(fecha2);

                insu.editarInsumo(idInsu, nombreInsu, tipo, descripcion, precioUni, precioTotal, comentario, fechaEntrega, fechaCaducidad);
                JOptionPane.showMessageDialog(this, "La información del insumo se ha actualizado con éxito", "Mensaje", JOptionPane.PLAIN_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnUpdateInsuEditDerechoActionPerformed

    private void btnUpdateInsumoIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateInsumoIzquierdaActionPerformed
        if (this.txtIDinsumoEdit.getText().isEmpty() || this.txtNombreInsuEdit.getText().isEmpty() || this.cbTipoInsuEdit.getSelectedIndex() == 0
               || this.txtUnitInsuEdit.getText().isEmpty() || this.txtTotalInsuEdit.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Faltan datos obligatorios. Por favor, complete la información", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
        } else {
            int valor = JOptionPane.showConfirmDialog(null, "Se actualizarán los datos de este insumo\n"
                   + "en todas las tablas en las que se utilice.\n"
                   + "¿Está seguro de actualizar la información de este insumo?", "Advertencia", JOptionPane.YES_NO_OPTION);
            if (valor == JOptionPane.YES_OPTION) {
                String idInsu = this.txtIDinsumoEdit.getText();
                String nombreInsu = this.txtNombreInsuEdit.getText();
                String tipo = this.cbTipoInsuEdit.getSelectedItem().toString();
                String descripcion = this.txtaDescripInsuEdit.getText();
                Double precioUni = Double.parseDouble(this.txtUnitInsuEdit.getText());
                Double precioTotal = Double.parseDouble(this.txtTotalInsuEdit.getText());
                String comentario = this.txtaComentInsuEdit.getText();
                Date fecha1 = this.choEntregaInsuEdit.getDate();
                DateFormat formato1 = new SimpleDateFormat("yyyy-MM-dd");
                String fechaEntrega = formato1.format(fecha1);
                Date fecha2 = this.choCaduInsuEdit.getDate();
                DateFormat formato2 = new SimpleDateFormat("yyyy-MM-dd");
                String fechaCaducidad = formato2.format(fecha2);

                insu.editarInsumo(idInsu, nombreInsu, tipo, descripcion, precioUni, precioTotal, comentario, fechaEntrega, fechaCaducidad);
                insu.registrarSuministroEdicion(idInsu, nombreInsu, tipo, descripcion, precioUni, precioTotal, fechaEntrega, comentario);
                JOptionPane.showMessageDialog(this, "La información del insumo se ha actualizado con éxito,\n"
                       + "y fue ingresado al registro de suministros", "Mensaje", JOptionPane.PLAIN_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnUpdateInsumoIzquierdaActionPerformed

    private void txtIDinsumoEditCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtIDinsumoEditCaretUpdate
        String id = this.txtIDinsumoEdit.getText();
        insu.cargarInsEdicionMasivaBD(id, txtNombreInsuEdit, cbTipoInsuEdit, txtaDescripInsuEdit, txtUnitInsuEdit, txtTotalInsuEdit, txtaComentInsuEdit);
        
    }//GEN-LAST:event_txtIDinsumoEditCaretUpdate

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
            java.util.logging.Logger.getLogger(Edicion_insumos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Edicion_insumos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Edicion_insumos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Edicion_insumos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Edicion_insumos dialog = new Edicion_insumos(new javax.swing.JFrame(), true);
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
    public rojeru_san.complementos.RSButtonHover btnUpdateInsuEditDerecho;
    public rojeru_san.complementos.RSButtonHover btnUpdateInsumoIzquierda;
    public javax.swing.JComboBox<String> cbTipoInsuEdit;
    private com.toedter.calendar.JDateChooser choCaduInsuEdit;
    private com.toedter.calendar.JDateChooser choEntregaInsuEdit;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JLabel lblEncabezado;
    public javax.swing.JTextField txtIDinsumoEdit;
    public javax.swing.JTextField txtNombreInsuEdit;
    public javax.swing.JTextField txtTotalInsuEdit;
    public javax.swing.JTextField txtUnitInsuEdit;
    public javax.swing.JTextArea txtaComentInsuEdit;
    public javax.swing.JTextArea txtaDescripInsuEdit;
    // End of variables declaration//GEN-END:variables
}
