package main.test;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.net.URL;

public class Main extends Application {
    private static Stage primaryStage;

    @Override
    public void start(Stage stage) throws Exception {
        primaryStage = stage;

        // Verificación de la existencia del archivo FXML antes de cargarlo
        File fxmlFile = new File("C:/Users/juand/Documents/LP2/Lab2/src/main/resources/ventana/prueba.fxml");
        if (!fxmlFile.exists()) {
            System.out.println("FXML file not found at: " + fxmlFile.getAbsolutePath());
            return;
        } else {
            System.out.println("FXML file found at: " + fxmlFile.getAbsolutePath());
        }

        // Convertir el archivo FXML a una URL y cargarlo
        URL fxmlLocation = fxmlFile.toURI().toURL();
        Parent root = FXMLLoader.load(fxmlLocation);

        // Crear la escena y configurar el escenario
        Scene scene = new Scene(root, 800, 600);
        primaryStage.setTitle("RFID");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void changeScene(String fxml) throws Exception {
        Parent pane = FXMLLoader.load(Main.class.getResource(fxml));
        primaryStage.getScene().setRoot(pane);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
