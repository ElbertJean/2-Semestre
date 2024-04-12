package com.entrega1;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class TelaListaCarrosController {

    @FXML
    private ListView<Carro> listView;

    public void initialize() {
        
    }

    public void initListaCarros(ObservableList<Carro> carros) {
        listView.setItems(carros);
    }
}