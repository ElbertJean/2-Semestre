module com.entrega2 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.entrega2 to javafx.fxml;
    exports com.entrega2;
}
