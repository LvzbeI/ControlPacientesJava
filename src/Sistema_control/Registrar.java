package Sistema_control;

import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class Registrar extends javax.swing.JFrame {

    Conexion conectaMysql;
    String nom, ape, sex, fe_na, correo, fecha, observaciones;
    int clave, num;

    public Registrar() {
        initComponents();
        conectaMysql = new Conexion();
        conectaMysql.conectar();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Adobe Heiti Std R", 1, 24)); // NOI18N
        jButton1.setText("GUARDAR");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 640, 160, 40));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hombre", "Mujer" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 110, 30));

        jTextField1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 220, 30));

        jTextField2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 220, 30));

        jTextField3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 220, 30));

        jTextField4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Observaciones", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 650, 200));

        jTextField5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 220, 30));

        jTextField6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 120, 30));

        jTextField7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 220, 30));

        jTextField8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 210, 30));

        jLabel12.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        jLabel12.setText("Fecha_Consulta");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 190, -1));

        jLabel11.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        jLabel11.setText("Fecha_Nac.");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 140, -1));

        jLabel10.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        jLabel10.setText("Sexo");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jLabel9.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        jLabel9.setText("Correo");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        jLabel8.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        jLabel8.setText("Telefono");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, -1, -1));

        jLabel6.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        jLabel6.setText("Apellidos del paciente");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        jLabel5.setText("Nombre del paciente");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        jLabel4.setText("Clave del paciente");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Adobe Heiti Std R", 1, 24)); // NOI18N
        jLabel3.setText("ALTA PACIENTES");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pie.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 160, 180));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //boton registar
        if (!jTextField1.getText().isEmpty() && !jTextField2.getText().isEmpty() && !jTextField3.getText().isEmpty()
                && !jTextField7.getText().isEmpty() && !jTextField6.getText().isEmpty() && !jTextField5.getText().isEmpty()
                && !jTextField8.getText().isEmpty() && !jTextField4.getText().isEmpty()) {
            registrar(nom, ape, sex, fe_na, correo, fecha, observaciones, clave, num);
        } else {
            JOptionPane.showMessageDialog(this, "No debe haber campos vacios");
        }


    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
    

//Fucion para REGISTRAR pacientes
    private void registrar(String nom, String ape, String sex, String fe_na, String correo, String fecha, String observaciones, int clave, int num) {
        clave = Integer.parseInt(jTextField1.getText());
        nom = jTextField2.getText();
        ape = jTextField3.getText();
        sex = jComboBox1.getSelectedItem().toString();
        fe_na = jTextField7.getText();
        correo = jTextField6.getText();
        num = Integer.parseInt(jTextField5.getText());
        fecha = jTextField8.getText();
        observaciones = jTextField4.getText();
        try {
            String sql = "INSERT INTO pacientes VALUES (?,?,?,?,?,?,?,?,?)";
            PreparedStatement sentencia = conectaMysql.miConexion.prepareStatement(sql);
            sentencia.setInt(1, clave);
            sentencia.setString(2, nom);
            sentencia.setString(3, ape);
            sentencia.setString(4, sex);
            sentencia.setString(5, fe_na);
            sentencia.setString(6, correo);
            sentencia.setInt(7, num);
            sentencia.setString(8, fecha);
            sentencia.setString(9, observaciones);
            sentencia.execute();
            sentencia.close();
            JOptionPane.showMessageDialog(this, "Registro exitoso");
            vaciar();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro" + ex.getMessage() + "No se pudo registrar");
        }
    }

    private void vaciar() {
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField7.setText("");
        jTextField6.setText("");
        jTextField5.setText("");
        jTextField8.setText("");
        jTextField4.setText("");
    }
}
