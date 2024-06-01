package com.entrega2;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ListView;

public class TelaListaCarrosController {

    @FXML
    private ListView<Carro> listView;

    public void initialize() {}

    public void initListaCarros(ObservableList<Carro> carros) {
        listView.setItems(carros);
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
                } else {
                }
            });
        }
    }
}
