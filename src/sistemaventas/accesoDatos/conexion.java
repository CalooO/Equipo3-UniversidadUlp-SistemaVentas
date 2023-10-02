
package sistemaventas.accesoDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conexion {
    
    private static final String URL = "jdbc:mariadb://localhost:3306/", DB = "fravemax", USUARIO = "root", PASSWORD = "";
    private static Connection connection;

    public conexion() {
    }

    public static Connection getConexion() {
        if (connection == null) {
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                connection = DriverManager.getConnection(URL + DB, USUARIO, PASSWORD);

            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "No se pudo cargar el driver");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error de conexión");

            }
        }
        return connection;

    }
    
}
