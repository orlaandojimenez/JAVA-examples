/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combobox;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

/**
 *
 * @author Orlando
 */
public class FXMLDocumentController implements Initializable {
    @FXML
    private ComboBox<String> cmbComidas;
    
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void btnText_click(ActionEvent event) {
        String kappa = cmbComidas.getSelectionModel().getSelectedItem();
        System.out.println(kappa);
    }
    
}
