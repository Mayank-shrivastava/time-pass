import java.util.*;

class Employee {
    // variables 
    private String name;
    private int age;

    // methods
    // constructor -> special class->object
    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //getter

    //setter
}

public class Main {
    public static void main(String[] args) {
        Employee mayank = new Employee("mayank", 22); // parameterized constructor
    }
}