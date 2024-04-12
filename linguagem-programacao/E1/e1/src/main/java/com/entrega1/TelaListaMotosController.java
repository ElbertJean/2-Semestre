package com.entrega1;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class TelaListaMotosController {
    
    @FXML
    private ListView<Moto> listView;

    public void initialize() {
        
    }

    public void initListaMotos(ObservableList<Moto> moto) {
        listView.setItems(moto);
    }
}
