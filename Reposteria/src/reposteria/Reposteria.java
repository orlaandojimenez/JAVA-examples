package reposteria;

import models.Pastel;
import conections.ConexionMySQL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Reposteria {

    public static void main(String[] args) {
        //ConexionMySQL.conectar();
         Pastel p1 = new Pastel(1, "Diplomatico", "Flan", "Doble Capa", "Pastel de chocolate con capa de flan", "nada", 190);

   /* if(p1.guardar()){
        System.out.println("Se ha agregado a la base de datos");
    }
    else{
        System.err.println("No se ha podido agregar a la base de datos");
    }*/
        /* if(p1.eliminar()){
        System.out.println("Se ha eliminado de la base de datos");
    }
    else{
        System.err.println("No se ha podido eliminar de la base de datos");
    }*/
//         if(p1.actualizar()){
//        System.out.println("Se ha actualizado de la base de datos");
//    }
//    else{
//        System.err.println("No se ha podido actualizar de la base de datos");
//    }
         
             //crear conexion
            Connection conn = ConexionMySQL.conectar();
            //crear query
            String query = "SELECT * FROM pasteles ";
            System.out.println(query);
            try {
                Statement smt = conn.createStatement();//crear una instruccion para esta conexion 
               ResultSet rs = smt.executeQuery(query);//Contiene todo lo que traiga el select
                
                while (rs.next()) {
                    //metodo get recibe una columna segun el tipo
                    System.out.println(rs.getString("nombre") + " $" + rs.getDouble("precio"));
                }
               
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
                
            }
    }
   
}
