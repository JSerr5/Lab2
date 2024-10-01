package main.test;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class Controller {

    @FXML
    private Button button_login;

    @FXML
    private Button button_register;

    @FXML
    private Button button_back;

    @FXML
    private Button button_enter;

    // Cosas
    @FXML
    public void initialize() {
        // Evento para cambiar a la nueva ventana "login.fxml"
        button_login.setOnAction(event -> {
            try {
                // Cargar la nueva escena desde login.fxml
                Parent loginRoot = FXMLLoader.load(getClass().getResource("/ventana/login.fxml"));
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
