import java.util.*;

// One to One Relationship

// Passport

class Passport {
    // Passport No
    private String passportNumber;

    Passport() {
        this.passportNumber = "12345uiop";
    }

    public String getPassportNumber() {
        return passportNumber;
    }
}

// Student

class Student {
    // Student Name Linked to a Passport No
    private String studentname;
    private Passport passport;

    Student(String name, Passport passport) {
        this.studentname = name;
        this.passport = passport;
    }

    public void getDetails() {
        System.out.println(
                "Student name is " + studentname + " and Passport Number is " + passport.getPassportNumber());
    }
}

public class Main {

    public static void main(String[] args) {
        Passport passport = new Passport();
        Student student = new Student("Sriram", passport);

        student.getDetails();
    }

}
