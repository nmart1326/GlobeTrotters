package org.example.globetrotters;

import com.gluonhq.maps.MapPoint;
import com.gluonhq.maps.MapView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GluonMap extends Application {

    @Override
    public void start(Stage stage) {
        // Create a MapView using the no-argument constructor
        MapView mapView = new MapView();

        // Set the center and zoom level separately
        MapPoint Brisbane = new MapPoint(-27.4705, 153.0260); // Example: Los Angeles
        mapView.setCenter(Brisbane);
        mapView.setZoom(12);

        StackPane root = new StackPane();
        root.getChildren().add(mapView);

        Scene scene = new Scene(root, 800, 600);
        stage.setTitle("Gluon Maps");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}