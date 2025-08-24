package org.example.globetrotters;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SidePanelController {

    @FXML
    private TextField searchField; // If you need to access the search field later

    @FXML
    private Label askMeAnythingLabel; // If you need to access this label later

    public void initialize() {
        // This method is called after all @FXML annotated members are injected.
        // You can add initialization logic here.
        System.out.println("SidePanelController initialized.");
    }

    // You can add methods here to handle events, e.g.,
    // @FXML
    // private void handleSearchAction() {
    //     System.out.println("Search query: " + searchField.getText());
    // }
}