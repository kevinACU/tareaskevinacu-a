package tienda;
import javax.swing.*;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Venta");
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MiTiendita = new javax.swing.JLabel();
        ivProducto1 = new javax.swing.JLabel();
        ivProducto2 = new javax.swing.JLabel();
        ivProducto3 = new javax.swing.JLabel();
        ivProducto4 = new javax.swing.JLabel();
        tAceiteVegetal = new javax.swing.JLabel();
        tLeche = new javax.swing.JLabel();
        tAtun = new javax.swing.JLabel();
        tCola = new javax.swing.JLabel();
        precio1 = new javax.swing.JLabel();
        precio2 = new javax.swing.JLabel();
        precio3 = new javax.swing.JLabel();
        precio4 = new javax.swing.JLabel();
        btSuma1 = new javax.swing.JButton();
        etCantidad1 = new javax.swing.JTextField();
        btResta1 = new javax.swing.JButton();
        btSuma2 = new javax.swing.JButton();
        etCantidad2 = new javax.swing.JTextField();
        btResta2 = new javax.swing.JButton();
        btSuma3 = new javax.swing.JButton();
        etCantidad3 = new javax.swing.JTextField();
        btResta3 = new javax.swing.JButton();
        btSuma4 = new javax.swing.JButton();
        etCantidad4 = new javax.swing.JTextField();
        btResta4 = new javax.swing.JButton();
        txtCantidad = new javax.swing.JLabel();
        txtCantidad1 = new javax.swing.JLabel();
        txtCantidad2 = new javax.swing.JLabel();
        txtCantidad3 = new javax.swing.JLabel();
        btCleanVenta = new javax.swing.JButton();
        btPagar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btCerrarSesion = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fondo1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MiTiendita.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        MiTiendita.setForeground(new java.awt.Color(255, 255, 51));
        MiTiendita.setText("TIENDA - STORE");
        getContentPane().add(MiTiendita, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

        ivProducto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/aceite.jpg"))); // NOI18N
        getContentPane().add(ivProducto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 170, 170));

        ivProducto2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/leche.jpg"))); // NOI18N
        getContentPane().add(ivProducto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 170, 170));

        ivProducto3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pescado.jpg"))); // NOI18N
        getContentPane().add(ivProducto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 170, 170));

        ivProducto4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refresco.jpg"))); // NOI18N
        getContentPane().add(ivProducto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 80, 180, 170));

        tAceiteVegetal.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tAceiteVegetal.setForeground(new java.awt.Color(255, 255, 255));
        tAceiteVegetal.setText("Aceite vegetal");
        getContentPane().add(tAceiteVegetal, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        tLeche.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tLeche.setForeground(new java.awt.Color(255, 255, 255));
        tLeche.setText("Leche de vaca");
        getContentPane().add(tLeche, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, -1, -1));

        tAtun.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tAtun.setForeground(new java.awt.Color(255, 255, 255));
        tAtun.setText("Atún en lata");
        getContentPane().add(tAtun, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, -1, -1));

        tCola.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tCola.setForeground(new java.awt.Color(255, 255, 255));
        tCola.setText("Refresco en lata");
        getContentPane().add(tCola, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 260, -1, 20));

        precio1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        precio1.setForeground(new java.awt.Color(255, 255, 0));
        precio1.setText("13000");
        getContentPane().add(precio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, -1));

        precio2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        precio2.setForeground(new java.awt.Color(255, 255, 0));
        precio2.setText("9000");
        getContentPane().add(precio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, -1, -1));

        precio3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        precio3.setForeground(new java.awt.Color(255, 255, 0));
        precio3.setText("11500");
        getContentPane().add(precio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, -1, -1));

        precio4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        precio4.setForeground(new java.awt.Color(255, 255, 0));
        precio4.setText("6000");
        getContentPane().add(precio4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 280, -1, -1));

        btSuma1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btSuma1.setText("+");
        btSuma1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuma1ActionPerformed(evt);
            }
        });
        getContentPane().add(btSuma1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 50, 30));

        etCantidad1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etCantidad1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        etCantidad1.setText("0");
        etCantidad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etCantidad1ActionPerformed(evt);
            }
        });
        getContentPane().add(etCantidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 50, 30));

        btResta1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btResta1.setText("-");
        btResta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResta1ActionPerformed(evt);
            }
        });
        getContentPane().add(btResta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 50, 30));

        btSuma2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btSuma2.setText("+");
        btSuma2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuma2ActionPerformed(evt);
            }
        });
        getContentPane().add(btSuma2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, 50, 30));

        etCantidad2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etCantidad2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        etCantidad2.setText("0");
        getContentPane().add(etCantidad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 50, 30));

        btResta2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btResta2.setText("-");
        btResta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResta2ActionPerformed(evt);
            }
        });
        getContentPane().add(btResta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 50, 30));

        btSuma3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btSuma3.setText("+");
        btSuma3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuma3ActionPerformed(evt);
            }
        });
        getContentPane().add(btSuma3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 350, 50, 30));

        etCantidad3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etCantidad3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        etCantidad3.setText("0");
        etCantidad3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etCantidad3ActionPerformed(evt);
            }
        });
        getContentPane().add(etCantidad3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 350, 50, 30));

        btResta3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btResta3.setText("-");
        btResta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResta3ActionPerformed(evt);
            }
        });
        getContentPane().add(btResta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, 50, 30));

        btSuma4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btSuma4.setText("+");
        btSuma4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuma4ActionPerformed(evt);
            }
        });
        getContentPane().add(btSuma4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 350, 50, 30));

        etCantidad4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etCantidad4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        etCantidad4.setText("0");
        getContentPane().add(etCantidad4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 350, 50, 30));

        btResta4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btResta4.setText("-");
        btResta4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResta4ActionPerformed(evt);
            }
        });
        getContentPane().add(btResta4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 350, 50, 30));

        txtCantidad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCantidad.setForeground(new java.awt.Color(255, 255, 255));
        txtCantidad.setText("Cantidad");
        getContentPane().add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        txtCantidad1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCantidad1.setForeground(new java.awt.Color(255, 255, 255));
        txtCantidad1.setText("Cantidad");
        getContentPane().add(txtCantidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, -1, -1));

        txtCantidad2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCantidad2.setForeground(new java.awt.Color(255, 255, 255));
        txtCantidad2.setText("Cantidad");
        getContentPane().add(txtCantidad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, -1, -1));

        txtCantidad3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCantidad3.setForeground(new java.awt.Color(255, 255, 255));
        txtCantidad3.setText("Cantidad");
        getContentPane().add(txtCantidad3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 310, -1, -1));

        btCleanVenta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btCleanVenta.setText("Cancelar compra");
        btCleanVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCleanVentaActionPerformed(evt);
            }
        });
        getContentPane().add(btCleanVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 410, 180, 50));

        btPagar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btPagar.setText("Proceder al pago");
        btPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPagarActionPerformed(evt);
            }
        });
        getContentPane().add(btPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 410, 180, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/papas.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, 120, 110));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/yerba.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 470, 130, 110));

        btCerrarSesion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btCerrarSesion.setText("Cerrar sesión");
        btCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCerrarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(btCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 170, 51));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/harina.jpeg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 470, 120, 110));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/huevo.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 470, 140, 120));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Papas Fritas");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 580, -1, -1));

        fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/store.jpg"))); // NOI18N
        fondo1.setText("jLabel3");
        getContentPane().add(fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 470));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 0));
        jLabel13.setText("5000");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 600, -1, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jButton1.setText("-");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 660, -1, -1));

        jTextField1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("0");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 660, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Cantidad");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 630, -1, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jButton2.setText("+");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 660, -1, -1));

        jButton3.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jButton3.setText("+");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 660, -1, -1));

        jTextField2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("0");
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 660, -1, -1));

        jButton4.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jButton4.setText("-");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 660, -1, -1));

        jTextField3.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("0");
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 660, -1, -1));

        jButton5.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jButton5.setText("-");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 660, -1, -1));

        jButton6.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jButton6.setText("+");
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 660, -1, -1));

        jButton7.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jButton7.setText("+");
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 660, -1, -1));

        jButton8.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jButton8.setText("-");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 660, -1, -1));

        jTextField4.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("0");
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 660, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Yerba");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 580, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 0));
        jLabel19.setText("12000");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 600, -1, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Cantidad");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 630, -1, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Cantidad");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 630, -1, 30));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Harina");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 580, -1, 30));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 0));
        jLabel23.setText("4600");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 600, -1, 30));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 0));
        jLabel24.setText("6500");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 600, -1, 30));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Huevo");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 580, -1, 30));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Cantidad");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 630, -1, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/store.jpg"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 800, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btResta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResta1ActionPerformed
        // TODO add your handling code here:
        Integer cantidad = Integer.parseInt(etCantidad1.getText());
        
        String resultado = String.valueOf(resta(cantidad));
       
        etCantidad1.setText(resultado);
    }//GEN-LAST:event_btResta1ActionPerformed

    private void btResta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResta2ActionPerformed
        // TODO add your handling code here:
        Integer cantidad = Integer.parseInt(etCantidad2.getText());
        
        String resultado = String.valueOf(resta(cantidad));
       
        etCantidad2.setText(resultado);
    }//GEN-LAST:event_btResta2ActionPerformed

    private void btResta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResta3ActionPerformed
        // TODO add your handling code here:
        Integer cantidad = Integer.parseInt(etCantidad3.getText());
        
        String resultado = String.valueOf(resta(cantidad));
       
        etCantidad3.setText(resultado);
    }//GEN-LAST:event_btResta3ActionPerformed

    private void btResta4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResta4ActionPerformed
        // TODO add your handling code here:
        Integer cantidad = Integer.parseInt(etCantidad4.getText());
        
        String resultado = String.valueOf(resta(cantidad));
       
        etCantidad4.setText(resultado);
    }//GEN-LAST:event_btResta4ActionPerformed

    private void btSuma2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuma2ActionPerformed
        // TODO add your handling code here:
        Integer cantidad = Integer.parseInt(etCantidad2.getText());
        
        String resultado = String.valueOf(suma(cantidad));
       
        etCantidad2.setText(resultado);
    }//GEN-LAST:event_btSuma2ActionPerformed

    private void btPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPagarActionPerformed
        // TODO add your handling code here:
        
        String cantidad1= etCantidad1.getText();
        int c1 = Integer.parseInt(cantidad1);
        String cantidad2= etCantidad2.getText();
        int c2 = Integer.parseInt(cantidad2);
        String cantidad3= etCantidad3.getText();
        int c3 = Integer.parseInt(cantidad3);
        String cantidad4= etCantidad4.getText();
        int c4 = Integer.parseInt(cantidad4);
        
        if(c1==0 && c2==0 && c3==0 && c4==0){
            JOptionPane.showMessageDialog(null, "No hay articulos para pagar");
        }else{
            if(c1<0|| c2<0 || c3<0 || c4<0){
            JOptionPane.showMessageDialog(null, "NO PUEDES INGRESAR CANTIDADES NEGATIVAS");
            }else{
                this.setVisible(false);
                Detalle ventana3 = new Detalle();
        
                ventana3.cantidades(cantidad1, cantidad2, cantidad3, cantidad4);
                ventana3.setVisible(true);
            }
        
        
        }
        
        
        
    }//GEN-LAST:event_btPagarActionPerformed
    
    private void btSuma1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuma1ActionPerformed
        // TODO add your handling code here:
        Integer cantidad = Integer.parseInt(etCantidad1.getText());
        
        String resultado = String.valueOf(suma(cantidad));
       
        etCantidad1.setText(resultado);
    }//GEN-LAST:event_btSuma1ActionPerformed

    private void btSuma3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuma3ActionPerformed
        // TODO add your handling code here:
        Integer cantidad = Integer.parseInt(etCantidad3.getText());
        
        String resultado = String.valueOf(suma(cantidad));
       
        etCantidad3.setText(resultado);
    }//GEN-LAST:event_btSuma3ActionPerformed

    private void btSuma4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuma4ActionPerformed
        // TODO add your handling code here:
        Integer cantidad = Integer.parseInt(etCantidad4.getText());
        
        String resultado = String.valueOf(suma(cantidad));
       
        etCantidad4.setText(resultado);
    }//GEN-LAST:event_btSuma4ActionPerformed

    private void etCantidad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etCantidad1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etCantidad1ActionPerformed

    
    private void btCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCerrarSesionActionPerformed
        // TODO add your handling code here:
        Login ventana1 = new Login();
        this.setVisible(false);
    }//GEN-LAST:event_btCerrarSesionActionPerformed

    private void btCleanVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCleanVentaActionPerformed
        // TODO add your handling code here:
        etCantidad1.setText("0");
        etCantidad2.setText("0");
        etCantidad3.setText("0");
        etCantidad4.setText("0");
        
    }//GEN-LAST:event_btCleanVentaActionPerformed

    private void etCantidad3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etCantidad3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etCantidad3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
    private int suma(int cantidad){
        cantidad = cantidad +1;        
        return cantidad;
    }
    private int resta(int cantidad){
        if(cantidad>0){
            cantidad = cantidad -1;
        }
        return cantidad;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MiTiendita;
    private javax.swing.JButton btCerrarSesion;
    private javax.swing.JButton btCleanVenta;
    private javax.swing.JButton btPagar;
    private javax.swing.JButton btResta1;
    private javax.swing.JButton btResta2;
    private javax.swing.JButton btResta3;
    private javax.swing.JButton btResta4;
    private javax.swing.JButton btSuma1;
    private javax.swing.JButton btSuma2;
    private javax.swing.JButton btSuma3;
    private javax.swing.JButton btSuma4;
    private javax.swing.JTextField etCantidad1;
    private javax.swing.JTextField etCantidad2;
    private javax.swing.JTextField etCantidad3;
    private javax.swing.JTextField etCantidad4;
    private javax.swing.JLabel fondo1;
    private javax.swing.JLabel ivProducto1;
    private javax.swing.JLabel ivProducto2;
    private javax.swing.JLabel ivProducto3;
    private javax.swing.JLabel ivProducto4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel precio1;
    private javax.swing.JLabel precio2;
    private javax.swing.JLabel precio3;
    private javax.swing.JLabel precio4;
    private javax.swing.JLabel tAceiteVegetal;
    private javax.swing.JLabel tAtun;
    private javax.swing.JLabel tCola;
    private javax.swing.JLabel tLeche;
    private javax.swing.JLabel txtCantidad;
    private javax.swing.JLabel txtCantidad1;
    private javax.swing.JLabel txtCantidad2;
    private javax.swing.JLabel txtCantidad3;
    // End of variables declaration//GEN-END:variables
}