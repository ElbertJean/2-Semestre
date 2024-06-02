package com.entrega2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import java.io.IOException;

public class App extends Application {

    private static Stage primaryStage;

    @Override
    public void start(@SuppressWarnings("exports") Stage stage) throws IOException {
        primaryStage = stage;
        stage.setTitle("EJ Multimarcas");
        primaryStage.getIcons().add(new Image(App.class.getResourceAsStream("carro.PNG")));
        showLoginScene();
        stage.show();
    }

    public static void showLoginScene() throws IOException {
        Scene scene = new Scene(loadFXML("TelaLogin"));
        primaryStage.setScene(scene);
    }

    public static void showMainScene() throws IOException {
        Scene scene = new Scene(loadFXML("TelaPrincipal"));
        primaryStage.setTitle("EJ Multimarcas");
        primaryStage.setScene(scene);
        primaryStage.setOnCloseRequest(event -> System.exit(0));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }
}
