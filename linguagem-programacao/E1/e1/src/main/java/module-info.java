module com.entrega1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.entrega1 to javafx.fxml;
    exports com.entrega1;
}
