package Sistema_control;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class Conexion {
    Connection miConexion;
    Statement miSentencia;
    ResultSet miResultado;
    public Connection conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String servidor = "jdbc:mysql://localhost:3309/podologo";
            String user = "root";
            String pwd = "sony";
            miConexion = DriverManager.getConnection(servidor, user, pwd);
            System.out.println("Base de datos conectada");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error en la base de datos");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el proceso de conexion");
        } finally {
            return miConexion;
        }
    }
}
