
class School {
    private String name;

    School(){
        name = "DPS";
    }

    void printSchoolName(){
        System.out.println("School Name is " + name);
    }

}

class Student extends School {
    private String name;

    Student(String name){
        this.name = name;
    }

    void printStudentName(){
        System.out.println("Student Name is " + name);
    }
}


public class Main {

    public static void main(String[] args) {
        Student anon = new Student("anon");

        anon.printStudentName();
        anon.printSchoolName();



    }
}
