package OOPSIntro;
import java.util.*;

public class Employee {
    private int salary;
    public String employeeName;

    public void setName(String s){
        employeeName = s;
    }

    public void setSalary(int val){
        salary = val;
    }

    public int getSalary(){
        return salary;
    }

    public String getName(){
        return employeeName;
    }
}