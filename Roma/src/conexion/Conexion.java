package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexion {
     private final static String DB = "gimnasio";//nombre de la bas de datos
    private final static String URL = "jdbc:mysql://localhost/" + DB;//direccionamiento de la base de datos
    private final static String USER = "root";//usuario de la base de datos
    private final static String PWD = ""; //contraseña
        public static Connection conectar(){
        try {
            // Class.forName("com.mysql.jdbc.Driver"); versiones de java menores a 5
            return DriverManager.getConnection(URL, USER, PWD);//intenta conectarse a la base de datos
        } catch (SQLException ex) {
            //muestra un mensaje de error de conexion
           JOptionPane.showMessageDialog(null, "No se ha podido conectar a la base de datos","Error", JOptionPane.ERROR_MESSAGE);
           System.exit(1);
        }
        return null;
        }

}
