package com.entrega1;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TelaValoresCadastrados {

    public static void exibirCarroCadastrado(Carro carro) {
        Stage stage = new Stage();
        stage.setTitle("Carro cadastrado com sucesso!");

        Label labelModelo = new Label("Modelo: " + carro.modelo);
        Label labelFabricante = new Label("Fabricante: " + carro.fabricante);
        Label labelPlaca = new Label("Placa: " + carro.placa);
        Label labelAno = new Label("Ano: " + carro.ano);

        VBox vbox = new VBox(labelModelo, labelFabricante, labelPlaca, labelAno);
        Scene scene = new Scene(vbox, 300, 200);

        stage.setScene(scene);
        stage.show();
    }

    public static void exibirMotoCadastrado(Moto moto) {
        Stage stage = new Stage();
        stage.setTitle("Moto cadastrado com sucesso!");

        Label labelModelo = new Label("Modelo: " + moto.modelo);
        Label labelCor = new Label("Cor: " + moto.cor);
        Label labelAno= new Label("Ano: " + moto.ano);
        Label labelCombustivel = new Label("Combustível: " + moto.combustivel);

        VBox vbox = new VBox(labelModelo, labelCor, labelAno, labelCombustivel);
        Scene scene = new Scene(vbox, 300, 200);

        stage.setScene(scene);
        stage.show();
    }

    public static void exibirClienteCadastrado(Cliente cliente) {
        Stage stage = new Stage();
        stage.setTitle("Cliente cadastrado com sucesso!");

        Label labelNomeCompleto = new Label("Nome do cliente: " + cliente.nomeCompleto);
        Label labelIdade = new Label("Idade: " + cliente.idade);
        Label labelEndereco= new Label("Endereço: " + cliente.endereco);
        Label labelTelefone = new Label("Telefone: " + cliente.telefone);

        VBox vbox = new VBox(labelNomeCompleto, labelIdade, labelEndereco, labelTelefone);
        Scene scene = new Scene(vbox, 300, 200);

        stage.setScene(scene);
        stage.show();
    }
}