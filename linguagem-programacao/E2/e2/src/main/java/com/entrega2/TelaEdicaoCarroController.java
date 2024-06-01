package com.entrega2;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class TelaEdicaoCarroController {

    @FXML
    private TextField fabricanteField;

    @FXML
    private TextField modeloField;

    @FXML
    private TextField anoField;

    @FXML
    private TextField placaField;

    @FXML
    private Button salvarButton;

    private Carro carroSelecionado;
    private Stage stage;
    private String placaOriginal; // Variável para armazenar a placa original

    public void initData(Carro carroSelecionado) {
        this.carroSelecionado = carroSelecionado;
        this.placaOriginal = carroSelecionado.placa; // Armazenando a placa original
        fabricanteField.setText(carroSelecionado.fabricante);
        modeloField.setText(carroSelecionado.modelo);
        anoField.setText(carroSelecionado.ano);
        placaField.setText(carroSelecionado.placa);
    }

    @FXML
    void salvarEdicao() {
        String fabricante = fabricanteField.getText();
        String modelo = modeloField.getText();
        String ano = anoField.getText();
        String placa = placaField.getText();

        if (fabricante.isEmpty() || modelo.isEmpty() || ano.isEmpty() || placa.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erro");
            alert.setHeaderText("Campos vazios");
            alert.setContentText("Por favor, preencha todos os campos.");
            alert.showAndWait();
            return;
        }

        carroSelecionado.fabricante = fabricante;
        carroSelecionado.modelo = modelo;
        carroSelecionado.ano = ano;
        carroSelecionado.placa = placa;

        DatabaseConnection.updateCarro(carroSelecionado, placaOriginal);

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Sucesso");
        alert.setHeaderText(null);
        alert.setContentText("Carro atualizado com sucesso.");
        alert.showAndWait();

        stage.close();
    }

    public void setStage(@SuppressWarnings("exports") Stage stage) {
        this.stage = stage;
    }
}
