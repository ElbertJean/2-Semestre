package com.entrega2;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ListView;
import javafx.scene.control.ListCell;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.scene.text.TextFlow;

public class TelaListaCarrosController {

    @FXML
    private ListView<Carro> listView;

    public void initialize() {}

    public void initListaCarros(ObservableList<Carro> carros) {
        listView.setItems(carros);

        listView.setCellFactory(param -> new ListCell<Carro>() {
            @Override
            protected void updateItem(Carro carro, boolean empty) {
                super.updateItem(carro, empty);
                if (empty || carro == null) {
                    setGraphic(null);
                } else {
                    TextFlow textFlow = new TextFlow();
                    
                    Text modelo = new Text("Modelo: ");
                    modelo.setStyle("-fx-font-weight: bold");

                    Text textoModelo = new Text(carro.modelo + " - ");

                    Text fabricante = new Text("Fabricante: ");
                    fabricante.setStyle("-fx-font-weight: bold");

                    Text textoFabricante = new Text(carro.fabricante + "\n");

                    Text placa = new Text("Placa: ");
                    placa.setStyle("-fx-font-weight: bold");

                    Text textoPlaca = new Text(carro.placa + " - ");

                    Text ano = new Text("Ano: ");
                    ano.setStyle("-fx-font-weight: bold");

                    Text textoAno = new Text(carro.ano);

                    textFlow.getChildren().addAll(modelo, textoModelo, fabricante, textoFabricante, placa, textoPlaca, ano, textoAno);
                    textFlow.setTextAlignment(TextAlignment.CENTER); // Centralizar texto
                    setGraphic(textFlow);
                }
            }
        });
    }

    @FXML
    void excluirCarro() {
        Carro carroSelecionado = listView.getSelectionModel().getSelectedItem();
        if (carroSelecionado != null) {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Confirmação");
            alert.setHeaderText("Tem certeza que deseja excluir este carro?");
            alert.setContentText("Esta ação não pode ser desfeita.");

            alert.showAndWait().ifPresent(response -> {
                if (response == ButtonType.OK) {
                    DatabaseConnection.deleterCarro(carroSelecionado);
                    listView.getItems().remove(carroSelecionado);
                }
            });
        }
    }
}
