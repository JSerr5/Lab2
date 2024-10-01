package main.test;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.io.File;
import java.net.URL;

public class Controller {

    @FXML
    private Button button_login;

    @FXML
    private Button button_register;

    @FXML
    private Button button_back;

    @FXML
    private Button button_enter;

    @FXML
    public void initialize() {
        System.out.println("Archivo FXML cargado correctamente y botón inicializado: " + button_login);

        button_login.setOnAction(event -> {
            try {
                // Verificación de la existencia del archivo FXML antes de cargarlo
                File fxmlFile = new File("C:/Users/juand/Documents/LP2/Lab2/src/main/resources/ventana/login.fxml");
                if (!fxmlFile.exists()) {
                    System.out.println("FXML file not found at: " + fxmlFile.getAbsolutePath());
                    return;
                } else {
                    System.out.println("FXML file found at: " + fxmlFile.getAbsolutePath());
                }

                // Convertir el archivo FXML a una URL y cargarlo
                URL fxmlLocation = fxmlFile.toURI().toURL();
                Parent loginRoot = FXMLLoader.load(fxmlLocation);
                Scene loginScene = new Scene(loginRoot);

                // Obtener el escenario actual y cambiar la escena
                Stage stage = (Stage) button_login.getScene().getWindow();
                stage.setScene(loginScene);
                stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}
