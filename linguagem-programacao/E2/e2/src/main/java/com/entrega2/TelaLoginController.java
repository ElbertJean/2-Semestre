package com.entrega2;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import java.io.IOException;

public class TelaLoginController {

    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;

    @FXML
    private void handleLoginButtonAction() {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (DatabaseConnection.connect(username, password)) {
            try {
                App.showMainScene();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Erro de Conexão");
            alert.setHeaderText("Falha ao conectar ao banco de dados");
            alert.setContentText("Verifique seu usuário e senha e tente novamente.");
            alert.showAndWait();
        }
    }
}
