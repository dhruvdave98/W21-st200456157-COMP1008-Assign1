package controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import models.Student;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;


public class StudentViewController implements Initializable {
    @FXML
    private Label firstNameLabel;

    @FXML
    private Label lastNameLabel;

    @FXML
    private Label studentNumberLabel;

    @FXML
    private ListView<String> favouriteActivitiesList;
    ObservableList<String> activities = FXCollections.observableArrayList("Travelling","music","watching movies","Computer games");

    @FXML
    private ImageView studentImageView;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ArrayList<String> stuActivities = new ArrayList<>(activities);

        Student obj = new Student("Dhruv","Dave",200456157,stuActivities);

        firstNameLabel.setText(obj.getFirstName());
        lastNameLabel.setText(obj.getLastName());
        studentNumberLabel.setText(Integer.toString(obj.getStudentNumber()));
        favouriteActivitiesList.getItems().addAll(obj.getFavouriteActivities());
        studentImageView.setImage(obj.getStudentImage());
    }
}
