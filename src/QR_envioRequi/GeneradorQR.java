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
package QR_envioRequi;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

/*
 * @author Evelyn López Nieto
 */
public class GeneradorQR extends javax.swing.JDialog {

    public GeneradorQR(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtCodigo = new RSMaterialComponent.RSTextFieldOne();
        btnGenerarQR = new rojeru_san.rsbutton.RSButtonForma();
        lblQR = new necesario.RSLabelImage();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCodigo.setForeground(new java.awt.Color(0, 0, 0));
        txtCodigo.setBorderColor(new java.awt.Color(255, 51, 0));
        txtCodigo.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txtCodigo.setPlaceholder("Ingrese codigo");
        jPanel1.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 320, -1));

        btnGenerarQR.setBackground(new java.awt.Color(255, 51, 0));
        btnGenerarQR.setText("Generar");
        btnGenerarQR.setColorHover(new java.awt.Color(255, 153, 51));
        btnGenerarQR.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        btnGenerarQR.setForma(rojeru_san.rsbutton.RSButtonForma.FORMA.ROUND);
        btnGenerarQR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarQRActionPerformed(evt);
            }
        });
        jPanel1.add(btnGenerarQR, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 130, -1));

        lblQR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos_graficos/rediseno_logoKoolebil.png"))); // NOI18N
        jPanel1.add(lblQR, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 300, 300));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarQRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarQRActionPerformed
        int size = 1000;
        String FileType = "png";

        String codigo = txtCodigo.getText().trim();
        
        // Elegir la ruta de la imagen
        String filePath = "";
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            filePath = chooser.getSelectedFile().getAbsolutePath();
        }
        
        // Generar el QR 
        QRCodeWriter qrcode = new QRCodeWriter();
        try {
            BitMatrix matrix = qrcode.encode(codigo, BarcodeFormat.QR_CODE, size, size);
            File f = new File(filePath + "/" + codigo + "." + FileType);
            int matrixWidth = matrix.getWidth();
            BufferedImage image = new BufferedImage(matrixWidth, matrixWidth, BufferedImage.TYPE_INT_RGB);
            image.createGraphics();

            Graphics2D gd = (Graphics2D) image.getGraphics();
            gd.setColor(Color.WHITE); // Fondo
            gd.fillRect(0, 0, size, size);
            gd.setColor(Color.black); // Qr

            for (int b = 0; b < matrixWidth; b++) {
                for (int j = 0; j < matrixWidth; j++) {
                    if (matrix.get(b, j)) {
                        gd.fillRect(b, j, 1, 1);
                    }
                }
            }
            
            // Mostrar la imagen generada
            ImageIO.write(image, FileType, f);
            Image mImagen = new ImageIcon(filePath + "/" + codigo + "." + FileType).getImage();
            ImageIcon mIcono = new ImageIcon(mImagen.getScaledInstance(lblQR.getWidth(), lblQR.getHeight(), 0));
            lblQR.setIcon(mIcono);
            
        } catch (WriterException ex) {
            Logger.getLogger(GeneradorQR.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GeneradorQR.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGenerarQRActionPerformed

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
            java.util.logging.Logger.getLogger(GeneradorQR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GeneradorQR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GeneradorQR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GeneradorQR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GeneradorQR dialog = new GeneradorQR(new javax.swing.JFrame(), true);
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
    private rojeru_san.rsbutton.RSButtonForma btnGenerarQR;
    private javax.swing.JPanel jPanel1;
    private necesario.RSLabelImage lblQR;
    private RSMaterialComponent.RSTextFieldOne txtCodigo;
    // End of variables declaration//GEN-END:variables
}
