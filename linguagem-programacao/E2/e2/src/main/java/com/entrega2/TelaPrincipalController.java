  package com.entrega2;

  import java.io.IOException;
  import java.util.List;

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
  import javafx.scene.control.Alert;
  import javafx.scene.control.Alert.AlertType;

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

    public static void exibirAlerta(String mensagem, @SuppressWarnings("exports") AlertType tipo) {
      Alert alerta = new Alert(tipo);
      alerta.setTitle("Aviso");
      alerta.setHeaderText(null);
      alerta.setContentText(mensagem);
      alerta.showAndWait();
    }

    @FXML
    void CadastrarCarro(ActionEvent event) {
      String modelo = modeloCarro.getText();
      String fabricante = fabricanteCarro.getText();
      String placa = placaCarro.getText();
      String ano = anoCarro.getText();

      if (modelo.isEmpty() || fabricante.isEmpty() || placa.isEmpty() || ano.isEmpty()) {
        exibirAlerta("Por favor, preencha todos os campos.", AlertType.WARNING);
      } else {
        try {
          Carro carro = new Carro(fabricante, placa, modelo, ano);
          DatabaseConnection.insertCarro(carro);
          listaCarros.add(carro);
          exibirAlerta("Carro cadastrado com sucesso!", AlertType.INFORMATION);
          modeloCarro.setText("");
          fabricanteCarro.setText("");
          placaCarro.setText("");
          anoCarro.setText("");
        } catch (Exception e) {
          exibirAlerta("Erro ao cadastrar o carro: " + e.getMessage(), AlertType.ERROR);
        }
      }
    }

    @FXML
    void verListaCarros(ActionEvent event) {
      List<Carro> carros = DatabaseConnection.getAllCarros();
      listaCarros.setAll(carros);
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
