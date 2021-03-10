package models;

public class Student {
    String firstName;
    String lastName;
    int studentNumber;

    public Student(String firstName, String lastName, int studentNumber) {
        setFirstName(firstName);
        setLastName(lastName);
        setStudentNumber(studentNumber);
    }

    public String getFirstName() {
        return firstName;
    }

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

    public String getLastName() {
        return lastName;
    }

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

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        if(studentNumber>=100000000 && studentNumber<=999999999)
            this.studentNumber = studentNumber;
        else
            throw new IllegalArgumentException("Student number should be range between 100000000 to 999999999");
    }
}
