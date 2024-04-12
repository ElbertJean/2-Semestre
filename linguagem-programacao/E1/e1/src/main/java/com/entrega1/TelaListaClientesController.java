package com.entrega1;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class TelaListaClientesController {

    @FXML
    private ListView<Cliente> listView;

    public void initialize() {
        
    }

    public void initListaCliente(ObservableList<Cliente> cliente) {
        listView.setItems(cliente);
    }
}