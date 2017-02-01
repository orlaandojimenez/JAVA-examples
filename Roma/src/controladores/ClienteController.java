/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import conexion.Conexion;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javax.swing.JOptionPane;
import modelos.Cliente;

/**
 *
 * @author Orlando
 */
public class ClienteController implements Initializable {
    
    private Label label;
    @FXML
    private GridPane gridFormulario;
    @FXML
    private TextField txtId;
    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtApellido;
    @FXML
    private TextField txtEdad;
    @FXML
    private TextField txtTelefono;
    @FXML
    private TextField txtDireccion;
    @FXML
    private TextField txtEmail;
    @FXML
    private TextField txtAdeudo;
     @FXML
    private TextField txtFechaRegistro;
    @FXML
    private Button btnNuevo;
    @FXML
    private Button btnGuardar;
    @FXML
    private Button btnModificar;
    @FXML
    private Button btnEliminar;
    @FXML
    private Button btnCancelar;
    @FXML
    private TableView<Cliente> tbvClientes;
    @FXML
    private TableColumn<Cliente, Long> colId;
    @FXML
    private TableColumn<Cliente, String> colNombre;
    @FXML
    private TableColumn<Cliente, String> colApellido;
    @FXML
    private TableColumn<Cliente, Integer> colEdad;
    @FXML
    private TableColumn<Cliente, Long> colTelefono;
    @FXML
    private TableColumn<Cliente, String> colDireccion;
    @FXML
    private TableColumn<Cliente, String> colEmail;
    @FXML
    private TableColumn<Cliente, String> colAdeudo;
     @FXML
    private TableColumn<Cliente, Long> colFechaRegistro;
   
    ObservableList <Cliente> datos = FXCollections.observableArrayList();
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        setColumns();
        fillTable();
    }    

    @FXML
    private void btnNuevo_click(ActionEvent event) {
         gridFormulario.setDisable(false);
        btnNuevo.setDisable(true);
        btnGuardar.setDisable(false);
        btnCancelar.setDisable(false);
        txtFechaRegistro.setText(fechaActual());
    }

    @FXML
    private void btnGuardar_click(ActionEvent event) {
        long id;
        int edad;
        long telefono;
        int adeudo;
        try {
            id = Long.parseLong(txtId.getText());
        } catch (Exception e) {
            id = 0;
        }
        
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
         try {
            edad = Integer.parseInt(txtEdad.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Introduce una edad");
            return;
        }
          try {
            telefono = Long.parseLong(txtTelefono.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Introduce un telefono");
            return;
        }
        String direccion = txtDireccion.getText();
        String email = txtEmail.getText();
        String fecha_registro = txtFechaRegistro.getText();
        
        try {
            adeudo = Integer.parseInt(txtAdeudo.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Introduce un adeudo");
            return;
        }
            
        
        //validaciones
        //trim() quita los espacios al inicio y al final
        if (nombre.trim().equals("") || apellido.trim().equals("")|| direccion.trim().equals("") 
                || email.trim().equals("") || fecha_registro.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Faltan datos a ingresar","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Cliente c1 = new Cliente(id, nombre, apellido, edad, telefono, direccion, email, fecha_registro, adeudo);
        
        if (id == 0) {
            if(c1.guardar()){
            fillTable();
            JOptionPane.showMessageDialog(null, "Se ha guardado el cliente");
        }
            else{
                JOptionPane.showMessageDialog(null, "No se pudo guardar el cliente", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        else{
            if (c1.actualizar()) {
                 fillTable();
            JOptionPane.showMessageDialog(null, "Se ha actualizado el cliente");
            }
            else{
                 JOptionPane.showMessageDialog(null, "No se pudo actualizar el cliente", "Error", JOptionPane.ERROR_MESSAGE);
            }

        }
       
    }

    @FXML
    private void btnModificar_click(ActionEvent event) {
        Cliente c1 = tbvClientes.getSelectionModel().getSelectedItem();
        if (c1 == null) {
            JOptionPane.showMessageDialog(null, "Selecciona un cliente");
            return;
        }
        btnNuevo.setDisable(true);
        btnGuardar.setDisable(false);
        btnCancelar.setDisable(false);
        gridFormulario.setDisable(false);
        
        txtId.setText(String.valueOf(c1.getId()));
        txtNombre.setText(c1.getNombre());
        txtApellido.setText(c1.getApellido());
        txtEdad.setText(String.valueOf(c1.getEdad()));
        txtTelefono.setText(String.valueOf(c1.getTelefono()));
        txtDireccion.setText(c1.getDireccion());
        txtEmail.setText(c1.getEmail());
        txtFechaRegistro.setText(c1.getFecha_registro());
        txtAdeudo.setText(String.valueOf(c1.getAdeudo()));
        
        
    }
    

    @FXML
    private void btnEliminar_click(ActionEvent event) {
         //getSelectionModel nos dice que tipo de seleccion usa la tabla
        //getSelectionItem obtiene el registro seleccionado
        Cliente c1 = tbvClientes.getSelectionModel().getSelectedItem();
        if (c1 == null) {
            JOptionPane.showMessageDialog(null, "No has seleccionado ningun cliente");
            return;
        }
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el cliente?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (respuesta == JOptionPane.YES_OPTION) {
            if (c1.eliminar()) {
                fillTable();
                JOptionPane.showMessageDialog(null, "Se ha borrado el cliente");
                
            }
            else{
                JOptionPane.showMessageDialog(null, "No se pudo eliminar el cliente");
            }
        }
    }

    @FXML
    private void btnCancelar_click(ActionEvent event) {
         vaciarDatos();
        gridFormulario.setDisable(true);
        btnCancelar.setDisable(true);
        btnNuevo.setDisable(false);
        btnGuardar.setDisable(true);
    }
    
    private void setColumns(){
        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        colApellido.setCellValueFactory(new PropertyValueFactory<>("apellido"));
        colEdad.setCellValueFactory(new PropertyValueFactory<>("edad"));
        colTelefono.setCellValueFactory(new PropertyValueFactory<>("telefono"));
        colDireccion.setCellValueFactory(new PropertyValueFactory<>("direccion"));
        colEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        colFechaRegistro.setCellValueFactory(new PropertyValueFactory<>("fecha_registro"));
        colAdeudo.setCellValueFactory(new PropertyValueFactory<>("adeudo"));
    }
    
     private void fillTable(){
        datos.clear(); //nos vacia la coleccion
        Connection conn =  Conexion.conectar();
        String query = "SELECT * FROM cliente";
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                long id = rs.getLong("id");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                int edad = rs.getInt("edad");
                long telefono = rs.getLong("telefono");
                String direccion = rs.getString("direccion");
                String email = rs.getString("email");
                String fecha_registro = rs.getString("fecha_registro");
                int adeudo = rs.getInt("adeudo");
                
                Cliente c1 = new Cliente(id, nombre, apellido, edad, telefono, direccion, email, fecha_registro,adeudo);
                datos.add(c1);
            }
            tbvClientes.setItems(datos);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    private void vaciarDatos(){
        //setText remplaza el texto del textfield
        txtId.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtEdad.setText("");
        txtTelefono.setText("");
        txtDireccion.setText("");
        txtEmail.setText("");
        txtFechaRegistro.setText(fechaActual());
        txtAdeudo.setText("");
    }
    
    public static String fechaActual(){
        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/YYYY");
        return formatoFecha.format(fecha);
    }
    
}
