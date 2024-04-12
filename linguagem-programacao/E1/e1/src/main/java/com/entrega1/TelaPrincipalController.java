package com.entrega1;

import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class TelaPrincipalController {

  private ObservableList<Carro> listaCarros = FXCollections.observableArrayList();
  private ObservableList<Moto> listaMotos = FXCollections.observableArrayList();
  private ObservableList<Cliente> listaClientes = FXCollections.observableArrayList();

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

  @FXML
  void CadastrarCarro (ActionEvent event) {
    Carro carro = new Carro(modeloCarro.getText(), fabricanteCarro.getText(), placaCarro.getText(), anoCarro.getText());
    listaCarros.add(carro);
    TelaValoresCadastrados.exibirCarroCadastrado(carro);
    modeloCarro.setText("");
    fabricanteCarro.setText("");
    placaCarro.setText("");
    anoCarro.setText("");
  }

  @FXML
  void CadastrarMoto (ActionEvent event) {
    Moto moto = new Moto(modeloMoto.getText(), corMoto.getText(), anoMoto.getText(), combustivelMoto.getText());
    listaMotos.add(moto);
    TelaValoresCadastrados.exibirMotoCadastrado(moto);
    modeloMoto.setText("");
    corMoto.setText("");
    anoMoto.setText("");
    combustivelMoto.setText("");
  }

  @FXML
  void CadastrarCliente (ActionEvent event) {
    Cliente cliente = new Cliente(nomeCompleto.getText(), idade.getText(), endereco.getText(), telefone.getText());
    listaClientes.add(cliente);
    TelaValoresCadastrados.exibirClienteCadastrado(cliente);
    modeloMoto.setText("");
    corMoto.setText("");
    anoMoto.setText("");
    combustivelMoto.setText("");
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

  @FXML
  void verListaMotos(ActionEvent event) {
    try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("TelaListaMotos.fxml"));
        Parent root = loader.load();
        
        TelaListaMotosController controller = loader.getController();
        
        controller.initListaMotos(listaMotos);

        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setTitle("Lista de motos cadastrados");
        stage.setScene(scene);
        stage.show();
    } catch (IOException e) {
        e.printStackTrace();
    }
  }

  @FXML
  void verListaClientes(ActionEvent event) {
    try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("TelaListaClientes.fxml"));
        Parent root = loader.load();
        
        TelaListaClientesController controller = loader.getController();
        
        controller.initListaCliente(listaClientes);

        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setTitle("Lista de clientes cadastrados");
        stage.setScene(scene);
        stage.show();
    } catch (IOException e) {
        e.printStackTrace();
    }
  }
}
