package Sistema_control;
import java.awt.Insets;
import java.sql.ResultSet;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
public class inicioSesion extends javax.swing.JFrame {
    Conexion conectaMysql;  String usu, psw;
    public inicioSesion() {
        initComponents();
        conectaMysql = new Conexion();
        conectaMysql.conectar();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        us_tx_user = new javax.swing.JTextField();
        us_tx_pdw = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        us_tx_user.setBackground(new java.awt.Color(255, 255, 255));
        us_tx_user.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        us_tx_user.setForeground(new java.awt.Color(0, 0, 0));
        us_tx_user.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        us_tx_user.setMargin(new java.awt.Insets(0, 10, 0, 0));
        jPanel1.add(us_tx_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 170, 40));

        us_tx_pdw.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(us_tx_pdw, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 180, 40));

        jButton1.setFont(new java.awt.Font("Adobe Heiti Std R", 1, 18)); // NOI18N
        jButton1.setText("Entrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 140, 40));

        jButton2.setFont(new java.awt.Font("Adobe Heiti Std R", 1, 18)); // NOI18N
        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 140, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/podoactiva-logotipo (1).png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 180, 180));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("USUARIO");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CONTRASEÑA");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, 30));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Adobe Heiti Std R", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(246, 246, 248));
        jLabel9.setText("PODOLOGIA");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Adobe Heiti Std R", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(246, 246, 248));
        jLabel10.setText("DE");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, 70));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Adobe Heiti Std R", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(246, 246, 248));
        jLabel11.setText("CLINICA ");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, 70));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/36566182-resumen-de-vectores-de-fondo-azul-metálico-con-la-onda.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 440));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // boton salir
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 //Boton de ingresar
       if (!us_tx_user.getText().isEmpty() && !us_tx_pdw.getText().isEmpty()) {
            validar(usu,psw);}
    }//GEN-LAST:event_jButton1ActionPerformed
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
            java.util.logging.Logger.getLogger(inicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicioSesion().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField us_tx_pdw;
    private javax.swing.JTextField us_tx_user;
    // End of variables declaration//GEN-END:variables

    private void validar(String usu, String psw) { 
      boolean resul=false;
      
     
        usu = us_tx_user.getText();
        psw = us_tx_pdw.getText();
        
        try { 
           String sql = "SELECT * FROM doctor where nom_doc='" + usu + "'AND contrasena='"+ psw+"'";
            //Estructurar sentencia 
            conectaMysql.miSentencia = conectaMysql.miConexion.createStatement();
            //Ejecutar la sentencia y recibir un result
            conectaMysql.miResultado = conectaMysql.miSentencia.executeQuery(sql);
            if (conectaMysql.miResultado.next()) {
                resul = true;
                if (resul == true) {
                    Consultas s = new Consultas();
                    s.setVisible(true);
                    this.dispose();
                }
            } else {
                JOptionPane.showMessageDialog(this, "Acceso denegado");
            }
        } catch (Exception ex) {}}}

