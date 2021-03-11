package models;

import javafx.scene.image.Image;
import java.util.ArrayList;


public class Student {
    private String firstName;
    private String lastName;
    private int studentNumber;
    private ArrayList<String> favouriteActivities;
    private Image studentImage;

    /**
     * This constructor takes 3 arguments, one for the first name, one for
     * the last name and last for the student number.
     *
     * The constructor must be the same name as the class (including the upper case first letter)
     * The constructor does NOT have a return type
     */
    public Student(String firstName, String lastName, int studentNumber, ArrayList<String> favouriteActivities) {
        setFirstName(firstName);
        setLastName(lastName);
        setStudentNumber(studentNumber);
        setFavouriteActivities(favouriteActivities);
        setStudentImage();
    }

    /**
     * This method will
     * @return first Name of the student
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * This method validates the argument is greater than 2 char and
     * first letter of the argument is uppercase or not and set
     * instance variable
     * @param firstName - this is a String to represent the first name of the student
     */
    public void setFirstName(String firstName) {
        if(firstName.length()>=2)
        {
            if(Character.isUpperCase(firstName.charAt(0)))
                this.firstName = firstName;
            else
            {
                firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
                this.firstName = firstName;
            }
        }
        else
            throw new IllegalArgumentException("First Name should be at least 2 characters long");
    }

    /**
     * This method will
     * @return last Name of the student
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * This method validates the argument is greater than 2 char and
     * first letter of the argument is uppercase or not and set
     * instance variable
     * @param lastName - this is a String to represent the last name of the student
     */
    public void setLastName(String lastName) {
        if(lastName.length()>=2)
        {
            if(Character.isUpperCase(lastName.charAt(0)))
                this.lastName = lastName;
            else
            {
                lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);
                this.lastName = lastName;
            }
        }
        else
            throw new IllegalArgumentException("Last Name should be at least 2 characters long");
    }

    /**
     * This method will
     * @return student number of the student
     */
    public int getStudentNumber() {
        return studentNumber;
    }

    /**
     * This method validates the student number is between the range of 100000000 to 999999999
     * and set instance variable
     * @param studentNumber - this is a integer value to represent the student number of the student
     */
    public void setStudentNumber(int studentNumber) {
        if(studentNumber>=100000000 && studentNumber<=999999999)
            this.studentNumber = studentNumber;
        else
            throw new IllegalArgumentException("Student number should be range between 100000000 to 999999999");
    }

    /**
     * This method will
     * @return favourite activity of the student
     */
    public ArrayList<String> getFavouriteActivities() {
        return favouriteActivities;
    }

    /**
     * This method validates the favourite activity string is not empty
     * and set instance variable
     * @param favouriteActivities - this is a String value to represent the favourite activity of the student
     */
    public void setFavouriteActivities(ArrayList<String> favouriteActivities) {
        if(favouriteActivities.isEmpty())
            throw new IllegalArgumentException("Favourite Activities cannot be null");
        else
            this.favouriteActivities = favouriteActivities;
    }

    /**
     * This method will
     * @return image of the student
     */
    public Image getStudentImage() {
        return studentImage;
    }

    /**
     * This method set the image of the student
     * from the specific path
     */
    public void setStudentImage() {
        String filepath = String.format("image/1.jpg");
        studentImage = new Image(filepath);
    }
}
