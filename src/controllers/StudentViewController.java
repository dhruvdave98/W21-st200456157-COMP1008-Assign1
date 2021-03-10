package controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import models.Student;

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
        Student obj = new Student("Dhruv","Dave",200456157);

        firstNameLabel.setText(obj.getFirstName());
        lastNameLabel.setText(obj.getLastName());
        studentNumberLabel.setText(Integer.toString(obj.getStudentNumber()));
        favouriteActivitiesList.getItems().addAll("Travelling","Music","Computer Gaming","Watching movies");
    }
}
