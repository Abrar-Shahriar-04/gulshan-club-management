module com.example.gulshanclubmanagement {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gulshanclubmanagement to javafx.fxml;
    exports com.example.gulshanclubmanagement;
}