package controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

public class StudentViewController implements Initializable {
    @FXML
    private Label firstNameLabel;

    @FXML
    private Label lastNameLabel;

    @FXML
    private Label studentNumberLabel;

    @FXML
    private ListView favouriteActivitiesList;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        firstNameLabel.setText("Dhruv");
        lastNameLabel.setText("Dave");
        studentNumberLabel.setText("200456157");
        favouriteActivitiesList.getItems().addAll("Travelling","Music","Computer Gaming","Watching movies");
    }
}
