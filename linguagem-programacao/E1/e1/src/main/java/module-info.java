module com.e1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.e1 to javafx.fxml;
    exports com.e1;
}
