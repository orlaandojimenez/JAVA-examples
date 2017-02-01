package models;

import conections.ConexionMySQL;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Pastel {
        private long id;
        private String nombre;
        private String sabor;
        private String tipo;
        private String descripcion;
        private String extras;
        private double precio;

    public Pastel(long id, String nombre, String sabor, String tipo, String descripcion, String extras, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.sabor = sabor;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.extras = extras;
        this.precio = precio;
    }

    

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getExtras() {
        return extras;
    }

    public void setExtras(String extras) {
        this.extras = extras;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
        
        public boolean guardar(){
            //crear conexion
            Connection conn = ConexionMySQL.conectar();
            //crear query
            String query = "INSERT INTO pasteles VALUES (NULL, '" + this.nombre + "'," +  "'" + this.sabor + 
                    "','" + this.tipo + "','" + this.descripcion + "','" + this.extras + "'," + this.precio + ");";
            System.out.println(query);
            try {
                Statement smt = conn.createStatement();//crear una instruccion para esta conexion
                //ejecutamos el query
                smt.executeUpdate(query);
                return true;
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
                return false;
            }
        }
        
        public boolean eliminar(){
            //crear conexion
            Connection conn = ConexionMySQL.conectar();
            //crear query
            String query = "DELETE FROM pasteles WHERE id = " + this.id + ";";
            System.out.println(query);
            try {
                Statement smt = conn.createStatement();//crear una instruccion para esta conexion
                //ejecutamos el query
                smt.executeUpdate(query);
                return true;
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
                return false;
            }
        }
        
        public boolean actualizar(){
             //crear conexion
            Connection conn = ConexionMySQL.conectar();
            //crear query
            String query = "UPDATE pasteles SET nombre = '" + this.nombre + "'," + "sabor = '" + 
                    this.sabor + "', tipo = '" + this.tipo
                    + "', descripcion = '" + this.descripcion + "', extras = '" + this.extras + "', precio = " + 
                    this.precio +  " WHERE id = " + this.id + ";";
            System.out.println(query);
            try {
                Statement smt = conn.createStatement();//crear una instruccion para esta conexion
                //ejecutamos el query
                smt.executeUpdate(query);
                return true;
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
                return false;
            }
        }
       
        
}
