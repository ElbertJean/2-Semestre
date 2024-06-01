package com.entrega2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    
   @Override
    public void start(@SuppressWarnings("exports") Stage stage) throws IOException {

        Image icon = new Image(getClass().getResourceAsStream("teste.PNG"));

        stage.getIcons().add(icon);

        Scene scene = new Scene(loadFXML("TelaPrincipal"), 550, 500);
        stage.setTitle("EJ Multimarcas");
        stage.setScene(scene);
        stage.show();

        stage.setOnCloseRequest(event -> System.exit(0));
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}