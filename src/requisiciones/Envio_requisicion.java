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
package requisiciones;

import java.io.File;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Evelyn López Nieto
 */
public class Envio_requisicion extends javax.swing.JDialog {

    Icon valido = new ImageIcon(getClass().getResource("/recursos_graficos/1.png"));

    public Envio_requisicion(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtAsuntoCorreo = new RSMaterialComponent.RSTextFieldOne();
        txtCorreoDestinatario = new RSMaterialComponent.RSTextFieldOne();
        txtCorreoRemitente = new RSMaterialComponent.RSTextFieldOne();
        passvPasswordRemitente = new rojeru_san.rsfield.RSPassView();
        btnEnviarCorreo = new RSMaterialComponent.RSButtonFormaIcon();
        btnCancelarCorreo = new RSMaterialComponent.RSButtonFormaIcon();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaMensajeCorre = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        btnAdjuntarArchivo = new RSMaterialComponent.RSButtonIconOne();
        lblRutaArchivo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Envío de requisición");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Correo del remitente:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 180, -1));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Contraseña del remitente:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 180, -1));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Correo del destinatario:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 180, -1));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Asunto:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 180, -1));

        txtAsuntoCorreo.setForeground(new java.awt.Color(0, 0, 0));
        txtAsuntoCorreo.setBorderColor(new java.awt.Color(0, 0, 0));
        txtAsuntoCorreo.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtAsuntoCorreo.setPlaceholder("Escribir asunto");
        jPanel1.add(txtAsuntoCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 135, 420, 30));

        txtCorreoDestinatario.setForeground(new java.awt.Color(0, 0, 0));
        txtCorreoDestinatario.setBorderColor(new java.awt.Color(0, 0, 0));
        txtCorreoDestinatario.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtCorreoDestinatario.setPlaceholder("ejemploDestino@gmail.com");
        jPanel1.add(txtCorreoDestinatario, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 420, 30));

        txtCorreoRemitente.setForeground(new java.awt.Color(0, 0, 0));
        txtCorreoRemitente.setBorderColor(new java.awt.Color(0, 0, 0));
        txtCorreoRemitente.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtCorreoRemitente.setPlaceholder("ejemploRemitente@gmail.com");
        jPanel1.add(txtCorreoRemitente, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 420, 30));

        passvPasswordRemitente.setForeground(new java.awt.Color(0, 0, 0));
        passvPasswordRemitente.setBorderColor(new java.awt.Color(0, 0, 0));
        passvPasswordRemitente.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        passvPasswordRemitente.setPlaceholder("Contraseña de acceso del correo del remitente");
        jPanel1.add(passvPasswordRemitente, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 55, 320, 40));

        btnEnviarCorreo.setBackground(new java.awt.Color(0, 51, 204));
        btnEnviarCorreo.setText("Enviar");
        btnEnviarCorreo.setBackgroundHover(new java.awt.Color(0, 153, 204));
        btnEnviarCorreo.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnEnviarCorreo.setForma(RSMaterialComponent.RSButtonFormaIcon.FORMA.ROUND);
        btnEnviarCorreo.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEND);
        btnEnviarCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarCorreoActionPerformed(evt);
            }
        });
        jPanel1.add(btnEnviarCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 100, 30));

        btnCancelarCorreo.setBackground(new java.awt.Color(0, 51, 204));
        btnCancelarCorreo.setText("Cancelar");
        btnCancelarCorreo.setBackgroundHover(new java.awt.Color(0, 153, 204));
        btnCancelarCorreo.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnCancelarCorreo.setForma(RSMaterialComponent.RSButtonFormaIcon.FORMA.ROUND);
        btnCancelarCorreo.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CANCEL);
        btnCancelarCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarCorreoActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelarCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 110, 30));

        txtaMensajeCorre.setColumns(20);
        txtaMensajeCorre.setLineWrap(true);
        txtaMensajeCorre.setRows(5);
        txtaMensajeCorre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(txtaMensajeCorre);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 530, 110));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Mensaje");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, -1, -1));

        btnAdjuntarArchivo.setBackground(new java.awt.Color(0, 51, 204));
        btnAdjuntarArchivo.setBackgroundHover(new java.awt.Color(0, 153, 204));
        btnAdjuntarArchivo.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.ATTACH_FILE);
        btnAdjuntarArchivo.setTypeBorder(RSMaterialComponent.RSButtonIconOne.TYPEBORDER.CIRCLE);
        btnAdjuntarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdjuntarArchivoActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdjuntarArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        lblRutaArchivo.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblRutaArchivo.setForeground(new java.awt.Color(255, 255, 255));
        lblRutaArchivo.setText("Adjunto");
        jPanel1.add(lblRutaArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 321, 580, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarCorreoActionPerformed
        try {
            Properties props = new Properties();
            props.setProperty("mail.smtp.host", "smtp.gmail.com");
            props.setProperty("mail.smtp.starttls.enable", "true");
            props.setProperty("mail.smtp.port", "587");
            props.setProperty("mail.smtp.auth", "true");

            Session session = Session.getDefaultInstance(props);
            String correoRemitente = this.txtCorreoRemitente.getText();
            String passwordRemitente = this.passvPasswordRemitente.getText();
            String correoReceptor = this.txtCorreoDestinatario.getText();
            String asunto = this.txtAsuntoCorreo.getText();
            String mensaje = this.txtaMensajeCorre.getText();

            if (this.txtCorreoRemitente.getText().isEmpty() || this.passvPasswordRemitente.getText().isEmpty()
                   || this.txtCorreoDestinatario.getText().isEmpty() || this.txtAsuntoCorreo.getText().isEmpty()
                   || this.txtaMensajeCorre.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "No se puede enviar el correo porque\n"
                       + "faltan campos por llenar", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
            } else {
                if (this.lblRutaArchivo.getText().isEmpty() || this.lblRutaArchivo.getText().equals("Adjunto")) {
                    BodyPart texto = new MimeBodyPart();
                    texto.setText(mensaje);

                    MimeMultipart multiparte = new MimeMultipart();
                    multiparte.addBodyPart(texto);

                    MimeMessage message = new MimeMessage(session);
                    message.setFrom(new InternetAddress(correoRemitente));
                    message.addRecipient(Message.RecipientType.TO, new InternetAddress(correoReceptor));
                    message.setSubject(asunto);
                    message.setContent(multiparte);

                    Transport t = session.getTransport("smtp");
                    t.connect(correoRemitente, passwordRemitente);
                    t.sendMessage(message, message.getRecipients(Message.RecipientType.TO));
                    t.close();
                    JOptionPane.showMessageDialog(this, "Correo enviado con éxito: ", "Envío requisiciones", JOptionPane.PLAIN_MESSAGE, valido);
                } else {
                    BodyPart texto = new MimeBodyPart();
                    texto.setText(mensaje);

                    BodyPart adjunto = new MimeBodyPart();
                    String archivo = this.lblRutaArchivo.getText();
                    String pathEditado = archivo.replace("\\", "/");
                    File file = new File(archivo);
                    file.getAbsolutePath();
                    adjunto.setDataHandler(new DataHandler(new FileDataSource(pathEditado)));
                    adjunto.setFileName(file.getName());

                    MimeMultipart multiparte = new MimeMultipart();
                    multiparte.addBodyPart(texto);
                    multiparte.addBodyPart(adjunto);

                    MimeMessage message = new MimeMessage(session);
                    message.setFrom(new InternetAddress(correoRemitente));
                    message.addRecipient(Message.RecipientType.TO, new InternetAddress(correoReceptor));
                    message.setSubject(asunto);
                    message.setContent(multiparte);

                    Transport t = session.getTransport("smtp");
                    t.connect(correoRemitente, passwordRemitente);
                    t.sendMessage(message, message.getRecipients(Message.RecipientType.TO));
                    t.close();
                    JOptionPane.showMessageDialog(this, "Correo enviado con éxito: ", "Envío requisiciones", JOptionPane.PLAIN_MESSAGE, valido);
                }
            }
        } catch (MessagingException e) {
            //System.out.println(e);
            JOptionPane.showMessageDialog(this, "Ocurrió un error con el sistema al enviar las requisiciones..." + e, "Envío requisiciones", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEnviarCorreoActionPerformed

    private void btnAdjuntarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdjuntarArchivoActionPerformed
        String filePath = "";
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            filePath = chooser.getSelectedFile().getAbsolutePath();
        }
        this.lblRutaArchivo.setText(filePath);
    }//GEN-LAST:event_btnAdjuntarArchivoActionPerformed

    private void btnCancelarCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarCorreoActionPerformed
        this.txtCorreoRemitente.setText("");
        this.passvPasswordRemitente.setText("");
        this.txtCorreoDestinatario.setText("");
        this.txtAsuntoCorreo.setText("");
        this.txtaMensajeCorre.setText("");
        this.lblRutaArchivo.setText("Adjunto");
    }//GEN-LAST:event_btnCancelarCorreoActionPerformed

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
            java.util.logging.Logger.getLogger(Envio_requisicion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Envio_requisicion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Envio_requisicion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Envio_requisicion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Envio_requisicion dialog = new Envio_requisicion(new javax.swing.JFrame(), true);
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
    private RSMaterialComponent.RSButtonIconOne btnAdjuntarArchivo;
    private RSMaterialComponent.RSButtonFormaIcon btnCancelarCorreo;
    private RSMaterialComponent.RSButtonFormaIcon btnEnviarCorreo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblRutaArchivo;
    private rojeru_san.rsfield.RSPassView passvPasswordRemitente;
    private RSMaterialComponent.RSTextFieldOne txtAsuntoCorreo;
    private RSMaterialComponent.RSTextFieldOne txtCorreoDestinatario;
    private RSMaterialComponent.RSTextFieldOne txtCorreoRemitente;
    private javax.swing.JTextArea txtaMensajeCorre;
    // End of variables declaration//GEN-END:variables
}
