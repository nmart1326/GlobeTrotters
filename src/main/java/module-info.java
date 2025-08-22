module org.example.globetrotters {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.gluonhq.maps;

    opens org.example.globetrotters to javafx.fxml;
    exports org.example.globetrotters;
}