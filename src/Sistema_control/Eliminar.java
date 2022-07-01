package Sistema_control;

import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Eliminar extends javax.swing.JFrame {

    Conexion conectaMysql;
    String clave;

    public Eliminar() {
        initComponents();
        conectaMysql = new Conexion();
        conectaMysql.conectar();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        cla = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setFont(new java.awt.Font("Adobe Heiti Std R", 1, 24)); // NOI18N
        jButton3.setText("Eliminar");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 140, 40));

        cla.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(cla, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 220, 30));

        jLabel4.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        jLabel4.setText("Clave del paciente");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jLabel3.setFont(new java.awt.Font("Adobe Heiti Std R", 1, 24)); // NOI18N
        jLabel3.setText("ELIMINAR PACIENTE");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pie.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 160, 180));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         clave = cla.getText();
        if (!cla.getText().isEmpty()) {
            validar(clave);
        }else{
            JOptionPane.showMessageDialog(this, "no debe haber campos vacios");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Eliminar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cla;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables

    private void validar(String clave) {
        try {
            String sql = "DELETE FROM pacientes WHERE id_paciente =?" ;
            //crear una sentencia preparada
            PreparedStatement sentencia = conectaMysql.miConexion.prepareStatement(sql);
            
            sentencia.setString(1, clave);
            sentencia.execute();
            sentencia.close();
            JOptionPane.showMessageDialog(this, "paciente eliminado");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error" + ex.getMessage() + "No se elimino el paciente");
        }
    }
}
