package suministros;

import com.mysql.jdbc.ResultSetMetaData;
import java.awt.HeadlessException;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * @author Evelyn López Nieto
 */
public class Ingreso_suministros extends javax.swing.JDialog {

    Form_sumiNuevos suministros = new Form_sumiNuevos();
    Form_adicionSumiExistentes adiSumi = new Form_adicionSumiExistentes();
    Icon error = new ImageIcon(getClass().getResource("/recursos_graficos/6.png"));

    public Ingreso_suministros(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.jPanel1.setVisible(false);

        cerrarFormulario();
    }

    public void cerrarFormulario() {
        try {
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent we) {
                    confirmSalida();
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void confirmSalida() {
        int valor = JOptionPane.showConfirmDialog(null, " ¿Está seguro de salir del formulario?", "Advertencia", JOptionPane.YES_NO_OPTION);
        if (valor == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlIngresarSumi = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cbArea = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        txtNameInsumoID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombreInsumo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAdescripcion = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtPrecioTotalInsu = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtPrecioUnitarioInsu = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtCantEntregadaInsu = new javax.swing.JTextField();
        txtPerdidasInsu = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtCantFinalInsu = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        dachoosCaduInsuSumi = new newscomponents.RSDateChooser();
        lblComentario = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAComentarios = new javax.swing.JTextArea();
        lblPorciones = new javax.swing.JLabel();
        txtPorciones = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        cbIDpersonal = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblPersonalSumi = new javax.swing.JTable();
        btnIngresarInsumo = new rojeru_san.complementos.RSButtonHover();
        cbTipoInsumo = new javax.swing.JComboBox<>();
        cbIDunidadM = new javax.swing.JComboBox<>();
        cbInicialArea = new javax.swing.JComboBox<>();
        spnDiaInsumo = new javax.swing.JSpinner();
        spnMesInsumo = new javax.swing.JSpinner();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblUnidadM = new javax.swing.JTable();
        btnLimpiar = new RSMaterialComponent.RSButtonFormaIcon();
        txtStockMin = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnAgregarInsumo = new rojeru_san.complementos.RSButtonHover();
        jLabel1 = new javax.swing.JLabel();
        rbtnInsumoN = new javax.swing.JRadioButton();
        rbtnAgregarInsumo = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlIngresarSumi.setBackground(new java.awt.Color(153, 204, 0));
        pnlIngresarSumi.setName("pnlIngresarSumi"); // NOI18N
        pnlIngresarSumi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Área de destino del insumo");
        pnlIngresarSumi.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 0, -1, -1));

        cbArea.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        cbArea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione área", "Servicio", "Restaurante", "Personal", "Bar", "Habitacion", "Mantenimiento", "Recepcion", "Otros" }));
        cbArea.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cbArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAreaActionPerformed(evt);
            }
        });
        pnlIngresarSumi.add(cbArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 25, 160, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNameInsumoID.setBackground(new java.awt.Color(255, 204, 204));
        txtNameInsumoID.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        txtNameInsumoID.setToolTipText("Ingrese nombre de insumo resumido");
        txtNameInsumoID.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(txtNameInsumoID, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 160, 30));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setText("* ID de insumo");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setText("*Nombre del insumo");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 75, -1, -1));

        txtNombreInsumo.setBackground(new java.awt.Color(255, 204, 204));
        txtNombreInsumo.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        txtNombreInsumo.setToolTipText("Ingrese el nombre del insumo");
        txtNombreInsumo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(txtNombreInsumo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 250, 30));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel5.setText("*Tipo de insumo");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 135, -1, -1));

        lblDescripcion.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblDescripcion.setText("Descripción del insumo (300 caracteres)");
        jPanel1.add(lblDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 195, -1, -1));

        jScrollPane1.setToolTipText("Ingrese una descripción del insumo");

        txtAdescripcion.setBackground(new java.awt.Color(255, 204, 204));
        txtAdescripcion.setColumns(20);
        txtAdescripcion.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txtAdescripcion.setLineWrap(true);
        txtAdescripcion.setRows(5);
        txtAdescripcion.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtAdescripcion.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtAdescripcionCaretUpdate(evt);
            }
        });
        jScrollPane1.setViewportView(txtAdescripcion);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 230, -1));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel7.setText("*Precio total del insumo");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 325, -1, -1));

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel8.setText("$");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        txtPrecioTotalInsu.setBackground(new java.awt.Color(255, 204, 204));
        txtPrecioTotalInsu.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        txtPrecioTotalInsu.setToolTipText("Ingrese el precio total del insumo");
        txtPrecioTotalInsu.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(txtPrecioTotalInsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 80, 30));

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel9.setText("*Precio unitario del insumo");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 325, -1, -1));

        txtPrecioUnitarioInsu.setBackground(new java.awt.Color(255, 204, 204));
        txtPrecioUnitarioInsu.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        txtPrecioUnitarioInsu.setToolTipText("Ingrese el precio unitario del insumo");
        txtPrecioUnitarioInsu.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(txtPrecioUnitarioInsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 80, 30));

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel10.setText("*Cantidad entregada");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        txtCantEntregadaInsu.setBackground(new java.awt.Color(255, 204, 204));
        txtCantEntregadaInsu.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        txtCantEntregadaInsu.setToolTipText("Ingrese la cantidad entregada del insumo");
        txtCantEntregadaInsu.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(txtCantEntregadaInsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 80, 30));

        txtPerdidasInsu.setBackground(new java.awt.Color(255, 204, 204));
        txtPerdidasInsu.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        txtPerdidasInsu.setToolTipText("Ingrese la cantidad de pérdidas, si existen");
        txtPerdidasInsu.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(txtPerdidasInsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 80, 30));

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel11.setText("Pérdidas");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, -1, -1));

        txtCantFinalInsu.setBackground(new java.awt.Color(255, 204, 204));
        txtCantFinalInsu.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        txtCantFinalInsu.setToolTipText("Ingrese la cantidad final del insumo");
        txtCantFinalInsu.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(txtCantFinalInsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, 80, 30));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel12.setText("*Cantidad final");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, -1, -1));

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel13.setText("*Unidad de medida");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, -1, -1));

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel14.setText("*Fecha de caducidad");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, -1, -1));

        dachoosCaduInsuSumi.setBackground(new java.awt.Color(255, 204, 204));
        dachoosCaduInsuSumi.setToolTipText("Ingrese fecha de caducidad el insumo, si la tiene");
        dachoosCaduInsuSumi.setBgColor(new java.awt.Color(0, 0, 0));
        dachoosCaduInsuSumi.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        dachoosCaduInsuSumi.setFormatDate("yyyy-MM-dd");
        jPanel1.add(dachoosCaduInsuSumi, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 40, -1, -1));

        lblComentario.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblComentario.setText("Comentarios (300 caracteres)");
        lblComentario.setToolTipText("Ingrese comentarios sobre el registro, si los hay");
        jPanel1.add(lblComentario, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 90, -1, -1));

        jScrollPane3.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N

        txtAComentarios.setBackground(new java.awt.Color(255, 204, 204));
        txtAComentarios.setColumns(20);
        txtAComentarios.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txtAComentarios.setLineWrap(true);
        txtAComentarios.setRows(5);
        txtAComentarios.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtAComentarios.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtAComentariosCaretUpdate(evt);
            }
        });
        jScrollPane3.setViewportView(txtAComentarios);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, 230, -1));

        lblPorciones.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblPorciones.setText("*Porciones");
        jPanel1.add(lblPorciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 230, -1, -1));

        txtPorciones.setBackground(new java.awt.Color(255, 204, 204));
        txtPorciones.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        txtPorciones.setToolTipText("Ingrese porción de uso total");
        txtPorciones.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(txtPorciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 260, 50, 30));

        jLabel17.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel17.setText("*Responsable de este movimiento");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 300, -1, -1));

        cbIDpersonal.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        cbIDpersonal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione ID" }));
        cbIDpersonal.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cbIDpersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbIDpersonalActionPerformed(evt);
            }
        });
        jPanel1.add(cbIDpersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 330, 170, 30));

        tblPersonalSumi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido Paterno", "Cargo", "Turno"
            }
        ));
        jScrollPane4.setViewportView(tblPersonalSumi);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 370, -1, 60));

        btnIngresarInsumo.setBackground(new java.awt.Color(153, 204, 0));
        btnIngresarInsumo.setText("Ingresar");
        btnIngresarInsumo.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        btnIngresarInsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarInsumoActionPerformed(evt);
            }
        });
        jPanel1.add(btnIngresarInsumo, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 550, 130, -1));

        cbTipoInsumo.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        cbTipoInsumo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "vegetal", "animal", "procesado", "bebida procesada", "vinos y licores", "cuidado personal", "jarciería", "detergente", "papelería", "mantenimiento" }));
        jPanel1.add(cbTipoInsumo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 160, 30));

        cbIDunidadM.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        cbIDunidadM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione ID" }));
        cbIDunidadM.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cbIDunidadM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbIDunidadMActionPerformed(evt);
            }
        });
        jPanel1.add(cbIDunidadM, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 140, 30));

        cbInicialArea.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        cbInicialArea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "S", "R", "P", "B", "H", "M", "RE", "O" }));
        jPanel1.add(cbInicialArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 50, 30));

        spnDiaInsumo.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jPanel1.add(spnDiaInsumo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 50, 30));

        spnMesInsumo.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jPanel1.add(spnMesInsumo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 50, 30));

        tblUnidadM.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID unidad", "Tipo unidad", "Nombre unidad", "Abrev. unidad"
            }
        ));
        jScrollPane5.setViewportView(tblUnidadM);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, -1, 60));

        btnLimpiar.setBackground(new java.awt.Color(153, 204, 0));
        btnLimpiar.setText("Limpiar campos");
        btnLimpiar.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        btnLimpiar.setForma(RSMaterialComponent.RSButtonFormaIcon.FORMA.ROUND);
        btnLimpiar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLimpiar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CLEAR);
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 550, -1, -1));

        txtStockMin.setBackground(new java.awt.Color(255, 204, 204));
        txtStockMin.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        txtStockMin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(txtStockMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 420, 80, 30));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel6.setText("*Stock min.");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 390, -1, -1));

        btnAgregarInsumo.setBackground(new java.awt.Color(153, 204, 0));
        btnAgregarInsumo.setText("Agregar");
        btnAgregarInsumo.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        btnAgregarInsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarInsumoActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarInsumo, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 550, 130, -1));

        pnlIngresarSumi.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 59, 1060, 600));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("¡CAMPOS OBLIGATORIOS! : *");
        pnlIngresarSumi.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        rbtnInsumoN.setBackground(new java.awt.Color(153, 204, 0));
        rbtnInsumoN.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        rbtnInsumoN.setForeground(new java.awt.Color(255, 255, 255));
        rbtnInsumoN.setText("Nuevo insumo");
        rbtnInsumoN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtnInsumoNMouseClicked(evt);
            }
        });
        pnlIngresarSumi.add(rbtnInsumoN, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 25, -1, -1));

        rbtnAgregarInsumo.setBackground(new java.awt.Color(153, 204, 0));
        rbtnAgregarInsumo.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        rbtnAgregarInsumo.setForeground(new java.awt.Color(255, 255, 255));
        rbtnAgregarInsumo.setText("Agregar a insumo existente");
        rbtnAgregarInsumo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtnAgregarInsumoMouseClicked(evt);
            }
        });
        pnlIngresarSumi.add(rbtnAgregarInsumo, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 25, -1, -1));

        getContentPane().add(pnlIngresarSumi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAreaActionPerformed

        String areaSeleccionada = this.cbArea.getSelectedItem().toString();
        int area = this.cbArea.getSelectedIndex();

        try {

            if (area == 0) {
                this.jPanel1.setVisible(false);
                if (this.rbtnInsumoN.isSelected()) {
                    this.jPanel1.setVisible(false);
                } else if (this.rbtnAgregarInsumo.isSelected()) {
                    this.jPanel1.setVisible(false);
                }
            } else {
                this.jPanel1.setVisible(false);
            }

            if ((areaSeleccionada.equals("Restaurante")) || (areaSeleccionada.equals("Personal")) || (areaSeleccionada.equals("Habitaciones"))
                   || (areaSeleccionada.equals("Mantenimiento")) || (areaSeleccionada.equals("Recepción")) || (areaSeleccionada.equals("Otros"))) {
                this.txtPorciones.setEnabled(false);
                suministros.cargarcbUM(cbIDunidadM);
                suministros.cargarIDper(cbIDpersonal);

            } else if (areaSeleccionada.equals("Seleccione área")) {
                this.jPanel1.setVisible(false);
            } else {
                this.txtPorciones.setEnabled(true);
                suministros.cargarcbUM(cbIDunidadM);
                suministros.cargarIDper(cbIDpersonal);
            }
            this.rbtnInsumoN.setSelected(false);
            this.rbtnAgregarInsumo.setSelected(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrio un error con la aplicación..." + e, "¡ERROR!", JOptionPane.PLAIN_MESSAGE, error);
        }

    }//GEN-LAST:event_cbAreaActionPerformed

    private void btnIngresarInsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarInsumoActionPerformed
        Icon valido = new ImageIcon(getClass().getResource("/recursos_graficos/1.png"));

        try {
            String dia = this.spnDiaInsumo.getValue().toString();
            String mes = this.spnMesInsumo.getValue().toString();
            String nombreInsuID = this.txtNameInsumoID.getText();
            String inicial = this.cbInicialArea.getSelectedItem().toString();
            String nombreInsumo = this.txtNombreInsumo.getText();
            String tipoInsu = this.cbTipoInsumo.getSelectedItem().toString();
            String descripcion = this.txtAdescripcion.getText();
            Double precioTotal = Double.parseDouble(this.txtPrecioTotalInsu.getText());
            Double precioUni = Double.parseDouble(this.txtPrecioUnitarioInsu.getText());
            Double cantEntregada = Double.parseDouble(this.txtCantEntregadaInsu.getText());
            Double perdidas = Double.parseDouble(this.txtPerdidasInsu.getText());
            Double cantFinal = Double.parseDouble(this.txtCantFinalInsu.getText());
            Double stockMin = Double.parseDouble(this.txtStockMin.getText());
            int unidadM = Integer.parseInt(this.cbIDunidadM.getSelectedItem().toString());
            Date fecha1 = this.dachoosCaduInsuSumi.getDate();
            DateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
            String fechaCadu = formato.format(fecha1);
            String comentarios = this.txtAComentarios.getText();
            Double porciones = null;
            int IDpersonal = Integer.parseInt(this.cbIDpersonal.getSelectedItem().toString());

            if (dia.isEmpty() || mes.isEmpty() || nombreInsuID.isEmpty() || inicial.isEmpty() || nombreInsumo.isEmpty() || tipoInsu.isEmpty()
                   || this.txtPrecioTotalInsu.getText().isEmpty() || this.txtPrecioUnitarioInsu.getText().isEmpty()
                   || this.txtCantEntregadaInsu.getText().isEmpty() || this.txtPerdidasInsu.getText().isEmpty() || this.txtCantFinalInsu.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Faltan campos obligatorios por llenar", "Advertencia", JOptionPane.WARNING_MESSAGE);
            } else {

                suministros.registroTablaInsumo(dia, mes, nombreInsuID, inicial, nombreInsumo, tipoInsu, descripcion,
                       precioUni, precioTotal, comentarios, fechaCadu);
                suministros.registroTablaSuministro(dia, mes, nombreInsuID, inicial, nombreInsumo, tipoInsu, descripcion,
                       precioUni, precioTotal, cantEntregada, perdidas, cantFinal, unidadM, comentarios);

                if (this.cbArea.getSelectedItem().equals("Servicio")) {
                    porciones = Double.parseDouble(this.txtPorciones.getText());
                    suministros.registroTablaStockServicio(dia, mes, nombreInsuID, inicial, cantFinal, stockMin, unidadM, porciones);
                    JOptionPane.showMessageDialog(this, "Registro existoso\n"
                           + "Enviado al registro general y al área de Servicio", "Mensaje del sistema", JOptionPane.PLAIN_MESSAGE, valido);
                }
                if (this.cbArea.getSelectedItem().equals("Restaurante")) {
                    suministros.registroTablaStockRestaurante(dia, mes, nombreInsuID, inicial, cantFinal, stockMin, unidadM);
                    JOptionPane.showMessageDialog(this, "Registro existoso\n"
                           + "Enviado al registro general y al área de Restaurante", "Mensaje del sistema", JOptionPane.PLAIN_MESSAGE, valido);
                }
                if (this.cbArea.getSelectedItem().equals("Personal")) {
                    suministros.registroTablaStockPersonal(dia, mes, nombreInsuID, inicial, cantFinal, stockMin, unidadM);
                    JOptionPane.showMessageDialog(this, "Registro existoso\n"
                           + "Enviado al registro general y al área de Personal", "Mensaje del sistema", JOptionPane.PLAIN_MESSAGE, valido);
                }
                if (this.cbArea.getSelectedItem().equals("Bar")) {
                    porciones = Double.parseDouble(this.txtPorciones.getText());
                    suministros.registroTablaStockBar(dia, mes, nombreInsuID, inicial, cantFinal, stockMin, unidadM, porciones);
                    JOptionPane.showMessageDialog(this, "Registro existoso\n"
                           + "Enviado al registro general y al área de Bar", "Mensaje del sistema", JOptionPane.PLAIN_MESSAGE, valido);
                }
                if (this.cbArea.getSelectedItem().equals("Habitaciones")) {
                    suministros.registroTablaStockHabitacion(dia, mes, nombreInsuID, inicial, cantFinal, stockMin, unidadM);
                    JOptionPane.showMessageDialog(this, "Registro existoso\n"
                           + "Enviado al registro general y al área de Habitaciones", "Mensaje del sistema", JOptionPane.PLAIN_MESSAGE, valido);
                }
                if (this.cbArea.getSelectedItem().equals("Mantenimiento")) {
                    suministros.registroTablaStockMantenimiento(dia, mes, nombreInsuID, inicial, cantFinal, stockMin, unidadM);
                    JOptionPane.showMessageDialog(this, "Registro existoso\n"
                           + "Enviado al registro general y al área de Mantenimiento", "Mensaje del sistema", JOptionPane.PLAIN_MESSAGE, valido);
                }
                if (this.cbArea.getSelectedItem().equals("Recepción")) {
                    suministros.registroTablaStockRecepcion(dia, mes, nombreInsuID, inicial, cantFinal, stockMin, unidadM);
                    JOptionPane.showMessageDialog(this, "Registro existoso\n"
                           + "Enviado al registro general y al área de Recepción", "Mensaje del sistema", JOptionPane.PLAIN_MESSAGE, valido);
                }
                if (this.cbArea.getSelectedItem().equals("Otros")) {
                    suministros.registroTablaStockOtros(dia, mes, nombreInsuID, inicial, cantFinal, stockMin, unidadM);
                    JOptionPane.showMessageDialog(this, "Registro existoso\n"
                           + "Enviado al registro general", "Mensaje del sistema", JOptionPane.PLAIN_MESSAGE, valido);
                }

                suministros.registroTablaAccesosP(IDpersonal);

            }
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ocurrio un error con la aplicación..." + e, "¡ERROR!", JOptionPane.PLAIN_MESSAGE, error);
        }

    }//GEN-LAST:event_btnIngresarInsumoActionPerformed

    private void cbIDunidadMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbIDunidadMActionPerformed

        String columnas[] = {"ID unidad", "Tipo unidad", "Nombre unidad", "Abrev. unidad"};
        String datos[][] = {};
        DefaultTableModel tablaUnidadM = new DefaultTableModel(datos, columnas) {
            @Override
            public boolean isCellEditable(int filas, int columnas) {
                if (columnas == 4) {
                    return true;
                } else {
                    return false;
                }
            }
        };
        this.tblUnidadM.setModel(tablaUnidadM);

        try {
            int unidad = this.cbIDunidadM.getSelectedIndex();
            ResultSet re = suministros.verIDum(unidad);
            ResultSetMetaData rM = (ResultSetMetaData) re.getMetaData();
            int nColumnas = rM.getColumnCount();

            Object[] datosTabla = new Object[nColumnas];

            while (re.next()) {
                for (int i = 0; i < nColumnas; i++) {
                    datosTabla[i] = re.getObject(i + 1);
                }
                tablaUnidadM.addRow(datosTabla);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Ocurrió un problema al cargar las unidades..." + e, "¡ERROR!", JOptionPane.PLAIN_MESSAGE, error);
        }
    }//GEN-LAST:event_cbIDunidadMActionPerformed

    private void cbIDpersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbIDpersonalActionPerformed
        String columnas[] = {"Nombre", "Apellido paterno", "Cargo", "Turno"};
        String datos[][] = {};
        DefaultTableModel tablaPersonal = new DefaultTableModel(datos, columnas) {
            @Override
            public boolean isCellEditable(int filas, int columnas) {
                if (columnas == 4) {
                    return true;
                } else {
                    return false;
                }
            }
        };
        this.tblPersonalSumi.setModel(tablaPersonal);

        try {
            int personal = this.cbIDpersonal.getSelectedIndex();
            ResultSet re = suministros.verIDper(personal);
            ResultSetMetaData rM = (ResultSetMetaData) re.getMetaData();
            int nColumnas = rM.getColumnCount();

            Object[] datosTabla = new Object[nColumnas];

            while (re.next()) {
                for (int i = 0; i < nColumnas; i++) {
                    datosTabla[i] = re.getObject(i + 1);
                }
                tablaPersonal.addRow(datosTabla);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Ocurrió un problema al cargar inf. del personal..." + e, "¡ERROR!", JOptionPane.PLAIN_MESSAGE, error);
        }
    }//GEN-LAST:event_cbIDpersonalActionPerformed

    private void txtAdescripcionCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtAdescripcionCaretUpdate
        int caracter = this.txtAdescripcion.getCaretPosition();
        this.lblDescripcion.setText("Descripción del insumo (" + caracter + "/300) caracteres");
    }//GEN-LAST:event_txtAdescripcionCaretUpdate

    private void txtAComentariosCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtAComentariosCaretUpdate
        int caracter = this.txtAComentarios.getCaretPosition();
        this.lblComentario.setText("Comentarios (" + caracter + "/300) caracteres");
    }//GEN-LAST:event_txtAComentariosCaretUpdate

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        this.cbArea.setSelectedIndex(0);
        this.spnDiaInsumo.setValue(0);
        this.spnMesInsumo.setValue(0);
        this.txtNameInsumoID.setText("");
        this.cbInicialArea.setSelectedIndex(0);
        this.txtNombreInsumo.setText("");
        this.cbTipoInsumo.setSelectedIndex(0);
        this.txtAdescripcion.setText("");
        this.txtPrecioTotalInsu.setText("");
        this.txtPrecioUnitarioInsu.setText("");
        this.txtCantEntregadaInsu.setText("");
        this.txtPerdidasInsu.setText("");
        this.txtCantFinalInsu.setText("");
        this.cbIDunidadM.setSelectedIndex(0);
        this.txtAComentarios.setText("");
        this.cbIDpersonal.setSelectedIndex(0);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void rbtnInsumoNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnInsumoNMouseClicked

        this.rbtnAgregarInsumo.setSelected(false);
        if (this.cbArea.getSelectedIndex() == 0) {
            this.jPanel1.setVisible(false);
        } else {
            this.jPanel1.setVisible(true);
            this.spnDiaInsumo.setEnabled(true);
            this.spnMesInsumo.setEnabled(true);
            this.cbInicialArea.setEnabled(true);
            this.btnAgregarInsumo.setEnabled(false);
        }
    }//GEN-LAST:event_rbtnInsumoNMouseClicked

    private void rbtnAgregarInsumoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnAgregarInsumoMouseClicked
        this.rbtnInsumoN.setSelected(false);
        if (this.cbArea.getSelectedIndex() == 0) {
            this.jPanel1.setVisible(false);
        } else {
            this.jPanel1.setVisible(true);
            this.spnDiaInsumo.setEnabled(false);
            this.spnMesInsumo.setEnabled(false);
            this.cbInicialArea.setEnabled(false);
            this.btnIngresarInsumo.setEnabled(false);
        }
    }//GEN-LAST:event_rbtnAgregarInsumoMouseClicked

    private void btnAgregarInsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarInsumoActionPerformed
        String idInsu = this.txtNameInsumoID.getText();
        Double cantidadN = Double.parseDouble(this.txtCantFinalInsu.getText());
        String nombreArea = this.cbArea.getSelectedItem().toString();
        int IDpersonal = Integer.parseInt(this.cbIDpersonal.getSelectedItem().toString());
        int area = this.cbArea.getSelectedIndex();
        String iniArea = null;

        if (area == 1) {
            iniArea = "S";
        }
        if (area == 2) {
            iniArea = "R";
        }
        if (area == 3) {
            iniArea = "P";
        }
        if (area == 4) {
            iniArea = "B";
        }
        if (area == 5) {
            iniArea = "H";
        }
        if (area == 6) {
            iniArea = "M";
        }
        if (area == 7) {
            iniArea = "Re";
        }
        if (area == 8) {
            iniArea = "O";
        }
        try {
            adiSumi.agregarInsumoExistente(nombreArea, iniArea, cantidadN, idInsu);
            //adiSumi.registroTablaSuministroExistente(idInsu, nombreArea, idInsu, iniArea, cantidadN, cantidadN, cantidadN, cantidadN, cantidadN, WIDTH, nombreArea)
            adiSumi.registroTablaAccesosP(IDpersonal);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrió un problema con la aplicación..." + e, "¡ERROR!", JOptionPane.PLAIN_MESSAGE, error);
        }
    }//GEN-LAST:event_btnAgregarInsumoActionPerformed

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
            java.util.logging.Logger.getLogger(Ingreso_suministros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingreso_suministros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingreso_suministros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingreso_suministros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Ingreso_suministros dialog = new Ingreso_suministros(new javax.swing.JFrame(), true);
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
    private rojeru_san.complementos.RSButtonHover btnAgregarInsumo;
    private rojeru_san.complementos.RSButtonHover btnIngresarInsumo;
    private RSMaterialComponent.RSButtonFormaIcon btnLimpiar;
    private javax.swing.JComboBox<String> cbArea;
    private javax.swing.JComboBox<String> cbIDpersonal;
    private javax.swing.JComboBox<String> cbIDunidadM;
    private javax.swing.JComboBox<String> cbInicialArea;
    private javax.swing.JComboBox<String> cbTipoInsumo;
    private newscomponents.RSDateChooser dachoosCaduInsuSumi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblComentario;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblPorciones;
    private javax.swing.JPanel pnlIngresarSumi;
    private javax.swing.JRadioButton rbtnAgregarInsumo;
    private javax.swing.JRadioButton rbtnInsumoN;
    private javax.swing.JSpinner spnDiaInsumo;
    private javax.swing.JSpinner spnMesInsumo;
    private javax.swing.JTable tblPersonalSumi;
    private javax.swing.JTable tblUnidadM;
    private javax.swing.JTextArea txtAComentarios;
    private javax.swing.JTextArea txtAdescripcion;
    private javax.swing.JTextField txtCantEntregadaInsu;
    private javax.swing.JTextField txtCantFinalInsu;
    private javax.swing.JTextField txtNameInsumoID;
    private javax.swing.JTextField txtNombreInsumo;
    private javax.swing.JTextField txtPerdidasInsu;
    private javax.swing.JTextField txtPorciones;
    private javax.swing.JTextField txtPrecioTotalInsu;
    private javax.swing.JTextField txtPrecioUnitarioInsu;
    private javax.swing.JTextField txtStockMin;
    // End of variables declaration//GEN-END:variables
}
