
package interfaces_principales;

import com.mysql.jdbc.ResultSetMetaData;
import java.sql.ResultSet;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import Usuarios_sistema.Operaciones_usuarios;

/*
 * @author Evelyn López Nieto
 */
public class LOGIN extends javax.swing.JFrame {
    Operaciones_usuarios consulta = new Operaciones_usuarios();
    Icon denegado = new ImageIcon (getClass().getResource("/recursos_graficos/2.png"));
    Icon error = new ImageIcon (getClass().getResource("/recursos_graficos/6.png"));
    
    public LOGIN() {
        initComponents();
        this.setLocationRelativeTo(null);
        consulta.cargaUsuarioLogin(cbUsuarios);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        piFotoUser = new rojerusan.RSPanelImage();
        cbUsuarios = new javax.swing.JComboBox<>();
        txtPass = new RSMaterialComponent.RSPasswordTwo();
        lblSaludoUser = new javax.swing.JLabel();
        rSLabelIcon1 = new RSMaterialComponent.RSLabelIcon();
        rSLabelIcon2 = new RSMaterialComponent.RSLabelIcon();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtUser = new RSMaterialComponent.RSTextFieldTwo();
        btnIngresar = new RSMaterialComponent.RSButtonFormaIcon();
        rSPanelImage1 = new rojerusan.RSPanelImage();
        rSPanelImage2 = new rojerusan.RSPanelImage();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Iniciar Sesión - SCIKo'olebil");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 204, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("¿Quién quiere ingresar?");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, -1, -1));

        javax.swing.GroupLayout piFotoUserLayout = new javax.swing.GroupLayout(piFotoUser);
        piFotoUser.setLayout(piFotoUserLayout);
        piFotoUserLayout.setHorizontalGroup(
            piFotoUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        piFotoUserLayout.setVerticalGroup(
            piFotoUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        jPanel1.add(piFotoUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 60, -1, -1));

        cbUsuarios.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        cbUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbUsuariosActionPerformed(evt);
            }
        });
        jPanel1.add(cbUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 25, 180, -1));

        txtPass.setBackground(new java.awt.Color(153, 204, 0));
        txtPass.setForeground(new java.awt.Color(255, 255, 0));
        txtPass.setBorderColor(new java.awt.Color(255, 255, 255));
        txtPass.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txtPass.setPhColor(new java.awt.Color(0, 0, 0));
        txtPass.setPlaceholder("Ingrese su contraseña de acceso");
        jPanel1.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 250, 30));

        lblSaludoUser.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblSaludoUser.setForeground(new java.awt.Color(255, 255, 255));
        lblSaludoUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSaludoUser.setText("¡Hola usuario X!");
        jPanel1.add(lblSaludoUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 210, -1, -1));

        rSLabelIcon1.setForeground(new java.awt.Color(255, 255, 255));
        rSLabelIcon1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.PERSON);
        rSLabelIcon1.setMaximumSize(new java.awt.Dimension(32, 32));
        jPanel1.add(rSLabelIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 30, 30));

        rSLabelIcon2.setForeground(new java.awt.Color(255, 255, 255));
        rSLabelIcon2.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.LOCK);
        jPanel1.add(rSLabelIcon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 30, 30));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Usuario");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Contraseña");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 310, -1, -1));

        txtUser.setBackground(new java.awt.Color(153, 204, 0));
        txtUser.setForeground(new java.awt.Color(255, 255, 0));
        txtUser.setBorderColor(new java.awt.Color(255, 255, 255));
        txtUser.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txtUser.setPhColor(new java.awt.Color(0, 0, 0));
        txtUser.setPlaceholder("Ingrese su nombre de usuario");
        jPanel1.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 250, 30));

        btnIngresar.setBackground(new java.awt.Color(51, 0, 153));
        btnIngresar.setText("Ingresar");
        btnIngresar.setBackgroundHover(new java.awt.Color(204, 0, 153));
        btnIngresar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnIngresar.setForma(RSMaterialComponent.RSButtonFormaIcon.FORMA.ROUND);
        btnIngresar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.INPUT);
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 120, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 400, 450));

        rSPanelImage1.setImagen(new javax.swing.ImageIcon(getClass().getResource("/recursos_graficos/login_.jpg"))); // NOI18N
        rSPanelImage1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSPanelImage2.setImagen(new javax.swing.ImageIcon(getClass().getResource("/recursos_graficos/rediseno_logoKoolebil.png"))); // NOI18N

        javax.swing.GroupLayout rSPanelImage2Layout = new javax.swing.GroupLayout(rSPanelImage2);
        rSPanelImage2.setLayout(rSPanelImage2Layout);
        rSPanelImage2Layout.setHorizontalGroup(
            rSPanelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        rSPanelImage2Layout.setVerticalGroup(
            rSPanelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );

        rSPanelImage1.add(rSPanelImage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 135, 180, 180));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SCI");
        rSPanelImage1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Ko'olebil");
        rSPanelImage1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 345, -1, -1));

        getContentPane().add(rSPanelImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        String usuario = this.txtUser.getText();
        String contraseña =this.txtPass.getText();
        String nombre = this.cbUsuarios.getSelectedItem().toString();
        
        try {
            ResultSet re = consulta.consultaUserLogin(nombre);
            ResultSetMetaData rsMD = (ResultSetMetaData) re.getMetaData();
            int cantColumnas = rsMD.getColumnCount();
            Object[] datosUser = new Object[cantColumnas];
            while(re.next()){
                for (int i = 0; i < cantColumnas; i++) {
                    datosUser[i] = re.getObject(i + 1);
                }
            }
            
            if(usuario.equals(datosUser[0])&&contraseña.equals(datosUser[1])){
            this.repaint();
            Panel_principal menuP = new Panel_principal();
            menuP.setVisible(true);
            this.dispose();
        } else {
                JOptionPane.showMessageDialog(this, "¡¡ACCESO DENEGADO PARA "+nombre+"!!"
                       + "\nUsuario o contraseña incorrectos","Acceso denegado",JOptionPane.PLAIN_MESSAGE,denegado);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"Ocurrió un error con el programa","¡¡ERROR!!",JOptionPane.PLAIN_MESSAGE,error);
        }
        
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void cbUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbUsuariosActionPerformed
        String nombre = this.cbUsuarios.getSelectedItem().toString();
        
        if (nombre.equals("Seleccione nombre")) {
            this.lblSaludoUser.setText("");
        } else {
            this.lblSaludoUser.setText("¡Hola "+nombre+"!");
        }
        
    }//GEN-LAST:event_cbUsuariosActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOGIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonFormaIcon btnIngresar;
    private javax.swing.JComboBox<String> cbUsuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblSaludoUser;
    private rojerusan.RSPanelImage piFotoUser;
    private RSMaterialComponent.RSLabelIcon rSLabelIcon1;
    private RSMaterialComponent.RSLabelIcon rSLabelIcon2;
    private rojerusan.RSPanelImage rSPanelImage1;
    private rojerusan.RSPanelImage rSPanelImage2;
    private RSMaterialComponent.RSPasswordTwo txtPass;
    private RSMaterialComponent.RSTextFieldTwo txtUser;
    // End of variables declaration//GEN-END:variables
}
