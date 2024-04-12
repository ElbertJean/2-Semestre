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

  @FXML
  private ImageView imageView;

  @FXML
  private TextField modelo;

  @FXML
  private TextField fabricante;

  @FXML
  private TextField placa;

  @FXML
  private TextField ano;

  @FXML
  void CadastrarCarro (ActionEvent event) {
    Carro carro = new Carro(modelo.getText(), fabricante.getText(), placa.getText(), ano.getText());
    listaCarros.add(carro);
    TelaValoresCadastrados.exibirValoresCadastrados(carro);
    modelo.setText("");
    fabricante.setText("");
    placa.setText("");
    ano.setText("");
  }

  @FXML
  void verListaCarros(ActionEvent event) {
    try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("TelaListaCarros.fxml"));
        Parent root = loader.load();
        
        // Obtém o controlador do FXML
        TelaListaCarrosController controller = loader.getController();
        
        // Chama o método para inicializar a lista de carros no controlador
        controller.initListaCarros(listaCarros);
        
        // Cria e exibe a cena
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
