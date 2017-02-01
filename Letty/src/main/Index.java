
package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Index extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        //carga la vista (.fxlm)
        Parent root = FXMLLoader.load(getClass().getResource("/views/MainWindow.fxml"));
        //Convierte la carga de la vista en una escena
        Scene scene = new Scene(root);
        //Asigna la escena al escenario
        stage.setScene(scene);
        //Muestra el escenario en pantalla
        stage.show();
    }

   
    public static void main(String[] args) {
        launch(args);
    }
    
}
