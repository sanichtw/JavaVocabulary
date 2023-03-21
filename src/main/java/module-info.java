module com.example.javavocabulary {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javavocabulary to javafx.fxml;
    exports com.example.javavocabulary;
}