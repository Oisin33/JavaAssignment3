module com.example.registerproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.registration to javafx.fxml;
    exports com.example.registration;
}