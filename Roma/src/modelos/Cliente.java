package modelos;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Cliente {

    private long id;
    private String nombre;
    private String apellido;
    private int edad;
    private long telefono;
    private String direccion;
    private String email;
    private String fecha_registro;
    private int adeudo;

    public Cliente(long id, String nombre, String apellido, int edad, long telefono, String direccion, String email, String fecha_registro, int adeudo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
        this.fecha_registro = fecha_registro;
        this.adeudo = adeudo;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(String fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public int getAdeudo() {
        return adeudo;
    }

    public void setAdeudo(int adeudo) {
        this.adeudo = adeudo;
    }
    
    public boolean guardar(){
            //crear conexion
            Connection conn = Conexion.conectar();
            //crear query
           
           
            String query = "INSERT INTO cliente VALUES (NULL, '" + this.nombre + "'," +  "'" + this.apellido + 
                    "'," + this.edad + "," + this.telefono + ",'" + this.direccion + "','" + this.email + "','" +  this.fecha_registro + "'," +  this.adeudo + ");";
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
            Connection conn = Conexion.conectar();
            //crear query
            String query = "DELETE FROM cliente WHERE id = " + this.id + ";";
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
            Connection conn = Conexion.conectar();
            //crear query
            String query = "UPDATE cliente SET nombre = '" + this.nombre + "'," + "apellido = '" + 
                    this.apellido + "', edad = " + this.edad
                    + ", telefono = " + this.telefono + ", direccion = '" + this.direccion + "', email = '" + 
                    this.email +  "', fecha_registro = '" + this.fecha_registro + "', adeudo = " + this.adeudo + " WHERE id = " + this.id + ";";
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
