package com.entrega1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class TelaPrincipalController {

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
    System.out.println(carro.toString());
  }
}
