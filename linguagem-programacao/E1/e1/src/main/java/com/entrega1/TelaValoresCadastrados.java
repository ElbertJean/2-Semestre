package com.entrega1;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TelaValoresCadastrados {

    public static void exibirValoresCadastrados(Carro carro) {
        Stage stage = new Stage();
        stage.setTitle("Valores Cadastrados");

        Label labelModelo = new Label("Modelo: " + carro.modelo);
        Label labelFabricante = new Label("Fabricante: " + carro.fabricante);
        Label labelPlaca = new Label("Placa: " + carro.placa);
        Label labelAno = new Label("Ano: " + carro.ano);

        VBox vbox = new VBox(labelModelo, labelFabricante, labelPlaca, labelAno);
        Scene scene = new Scene(vbox, 300, 200);

        stage.setScene(scene);
        stage.show();
    }
}