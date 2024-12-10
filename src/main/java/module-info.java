module com.example.slcontacts {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.slcontacts to javafx.fxml;
    exports com.example.slcontacts;
}