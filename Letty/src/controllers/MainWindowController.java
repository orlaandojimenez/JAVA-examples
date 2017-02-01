
package controllers;

import conections.ConexionMySQL;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javax.swing.JOptionPane;
import models.Pastel;

//Por standar los controladores terminan con la palabra Controller
public class MainWindowController implements Initializable {
  
   //anotacion, significa que el objeto o metodo fue llamado desde la vista 
    @FXML
    private TextField txtId;
    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtSabor;
    @FXML
    private TextField txtTipo;
    @FXML
    private TextField txtDescripcion;
    @FXML
    private TextField txtExtras;
    @FXML
    private TextField txtPrecio;
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
    private TableView<Pastel> tbvPasteles;
    @FXML
    private TableColumn<Pastel, Long> colId;//<clase, tipo de dato wrapper>
    @FXML
    private TableColumn<Pastel, String> colNombre;
    @FXML
    private TableColumn<Pastel, String> colSabor;
    @FXML
    private TableColumn<Pastel, String> colTipo;
    @FXML
    private TableColumn<Pastel, String> colDescripcion;
    @FXML
    private TableColumn<Pastel, String> colExtras;
    @FXML
    private TableColumn<Pastel, Double> colPrecio;
    @FXML
    private GridPane gridFormulario;
   ObservableList <Pastel> datos = FXCollections.observableArrayList(); //observableArrayList nos va a ayudar a contener todos los atos de la tabla Pasteles
    
   
    
    @Override
    //como el main
    public void initialize(URL url, ResourceBundle rb) {
        setColumns();
        fillTable();
    }    


    @FXML
    private void btnEjemplo_click(ActionEvent event) {
         System.out.println("un sout: diste click");
        //devuelve un string del textfield
        System.out.println(txtId.getText());
    }

    @FXML
    private void btnNuevo_click(ActionEvent event) {
        // setDisable deshabilita si es true, habilita si es false
        gridFormulario.setDisable(false);
        btnNuevo.setDisable(true);
        btnGuardar.setDisable(false);
        btnCancelar.setDisable(false);
    }

    @FXML
    private void btnGuadar_click(ActionEvent event) {
        long id;
        double precio;
        try {
            id = Long.parseLong(txtId.getText());
        } catch (Exception e) {
            id = 0;
        }
        
        String nombre = txtNombre.getText();
        String sabor = txtSabor.getText();
        String tipo = txtTipo.getText();
        String descripcion = txtDescripcion.getText();
        String extras = txtExtras.getText();
        try {
             precio = Double.parseDouble(txtPrecio.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Introduce un precio");
            return;
        }
        //validaciones
        //trim() quita los espacios al inicio y al final
        if (nombre.trim().equals("") || sabor.trim().equals("")|| tipo.trim().equals("") 
                || descripcion.trim().equals("") || extras.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Faltan datos a ingresar","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Pastel p1 = new Pastel(id, nombre, sabor, tipo, descripcion, extras, precio);
        
        if (id == 0) {
            if(p1.guardar()){
            fillTable();
            JOptionPane.showMessageDialog(null, "Se ha guardado el pastel");
        }
            else{
                JOptionPane.showMessageDialog(null, "No se pudo guardar el pastel", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        else{
            if (p1.actualizar()) {
                 fillTable();
            JOptionPane.showMessageDialog(null, "Se ha actualizado el pastel");
            }
            else{
                 JOptionPane.showMessageDialog(null, "No se pudo actualizar el pastel", "Error", JOptionPane.ERROR_MESSAGE);
            }

        }
       
    }

    @FXML
    private void btnModificar_click(ActionEvent event) {
        Pastel p1 = tbvPasteles.getSelectionModel().getSelectedItem();
        if (p1 == null) {
            JOptionPane.showMessageDialog(null, "Selecciona un pastel");
            return;
        }
        btnNuevo.setDisable(true);
        btnGuardar.setDisable(false);
        btnCancelar.setDisable(false);
        gridFormulario.setDisable(false);
        
        txtId.setText(String.valueOf(p1.getId()));
        txtNombre.setText(p1.getNombre());
        txtSabor.setText(p1.getSabor());
        txtTipo.setText(p1.getTipo());
        txtDescripcion.setText(p1.getDescripcion());
        txtExtras.setText(p1.getExtras());
        txtPrecio.setText(String.valueOf(p1.getPrecio()));
    }

    @FXML
    private void btnEliminar_click(ActionEvent event) {
        //getSelectionModel nos dice que tipo de seleccion usa la tabla
        //getSelectionItem obtiene el registro seleccionado
        Pastel p1 = tbvPasteles.getSelectionModel().getSelectedItem();
        if (p1 == null) {
            JOptionPane.showMessageDialog(null, "No has seleccionado ningun pastel");
            return;
        }
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el pastel?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (respuesta == JOptionPane.YES_OPTION) {
            if (p1.eliminar()) {
                fillTable();
                JOptionPane.showMessageDialog(null, "Se ha borrado el pastel");
                
            }
            else{
                JOptionPane.showMessageDialog(null, "No se pudo eliminar el pastel");
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
        //SetCellValueFactory controla lo que ira en cada columna
        //PropertyValueFactory dice que atributo mostrara la columna, el generico no es oblogatorio
        colNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        colSabor.setCellValueFactory(new PropertyValueFactory<>("sabor")); 
        colTipo.setCellValueFactory(new PropertyValueFactory<>("tipo"));
        colDescripcion.setCellValueFactory(new PropertyValueFactory<>("descripcion")); 
        colExtras.setCellValueFactory(new PropertyValueFactory<>("extras")); 
        colPrecio.setCellValueFactory(new PropertyValueFactory<>("precio")); 
    }
    
    private void fillTable(){
        datos.clear(); //nos vacia la coleccion
        Connection conn =  ConexionMySQL.conectar();
        String query = "SELECT * FROM pasteles";
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                long id = rs.getLong("id");
                String nombre = rs.getString("nombre");
                String sabor = rs.getString("sabor");
                String tipo = rs.getString("tipo");
                String descripcion = rs.getString("descripcion");
                String extras = rs.getString("extras");
                double precio = rs.getDouble("precio");
                
                Pastel p1 = new Pastel(id, nombre, sabor, tipo, descripcion, extras, precio);
                datos.add(p1);
            }
            tbvPasteles.setItems(datos);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    private void vaciarDatos(){
        //setText remplaza el texto del textfield
        txtId.setText("");
        txtNombre.setText("");
        txtSabor.setText("");
        txtTipo.setText("");
        txtDescripcion.setText("");
        txtExtras.setText("");
        txtPrecio.setText("");
    }
            
}
