package org.example.globetrotters;

import com.gluonhq.maps.MapPoint;
import com.gluonhq.maps.MapView;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.HBox; // Using HBox to arrange map and side panel
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class GluonMap extends Application {

    @Override
    public void start(Stage stage) {
        // ---BOTTOM-MOST LAYER---(the map)
        // Create a MapView using the no-argument constructor
        MapView mapView = new MapView();

        // Set the center and zoom level separately
        MapPoint Brisbane = new MapPoint(-27.4705, 153.0260); // Brisbane coordinates
        mapView.setCenter(Brisbane);
        mapView.setZoom(12);

        // Load the SidePanel FXML
        Parent sidePanel = null;
        try {
            // Ensure the path matches where you placed your FXML file
            sidePanel = FXMLLoader.load(getClass().getResource("SidePanel.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Failed to load SidePanel.fxml. Please check the file path.");
            // Handle the error gracefully, e.g., by showing an alert or default content
        }

        // Create an HBox to hold the side panel and the map
        // The side panel will be on the left, and the map will take the remaining space
        HBox rootLayout = new HBox();
        if (sidePanel != null) {
            rootLayout.getChildren().add(sidePanel);
        }
        rootLayout.getChildren().add(mapView); // Add map to the HBox

        // Make the map grow to fill available space
        HBox.setHgrow(mapView, javafx.scene.layout.Priority.ALWAYS);


        Scene scene = new Scene(rootLayout, 1200, 700); // Adjust scene size as needed
        stage.setTitle("GlobeTrotter");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}