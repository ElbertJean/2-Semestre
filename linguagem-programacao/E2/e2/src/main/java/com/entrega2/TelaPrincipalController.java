package com.entrega2;

import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TelaPrincipalController {

  private ObservableList<Carro> listaCarros = FXCollections.observableArrayList();

  @FXML
  private ImageView imageView;

  @FXML
  private TextField modeloCarro;

  @FXML
  private TextField fabricanteCarro;

  @FXML
  private TextField placaCarro;

  @FXML
  private TextField anoCarro;

  @FXML
  private TextField modeloMoto;

  @FXML
  private TextField corMoto;

  @FXML
  private TextField anoMoto;

  @FXML
  private TextField combustivelMoto;

  @FXML
  private TextField nomeCompleto;

  @FXML
  private TextField idade;

  @FXML
  private TextField endereco;

  @FXML
  private TextField telefone;

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

  @FXML
  void CadastrarCarro (ActionEvent event) {
    Carro carro = new Carro(modeloCarro.getText(), fabricanteCarro.getText(), placaCarro.getText(), anoCarro.getText());
    listaCarros.add(carro);
    exibirCarroCadastrado(carro);
    modeloCarro.setText("");
    fabricanteCarro.setText("");
    placaCarro.setText("");
    anoCarro.setText("");
  }

  @FXML
  void verListaCarros(ActionEvent event) {
    try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("TelaListaCarros.fxml"));
        Parent root = loader.load();
        
        TelaListaCarrosController controller = loader.getController();
        
        controller.initListaCarros(listaCarros);

        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setTitle("Lista de Carros Cadastrados");
        stage.setScene(scene);
        stage.show();
    } catch (IOException e) {
        e.printStackTrace();
    }
  }
}
