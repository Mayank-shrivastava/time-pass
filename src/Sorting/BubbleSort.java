package Sorting;

import java.util.Arrays;
import java.util.Comparator;

public class BubbleSort {
    public static void main(String[] args) {
        Employee[] employeeArray = new Employee[3];

        employeeArray[0] = new Employee("xbi", 1);
        employeeArray[1] = new Employee("John", 3);
        employeeArray[2] = new Employee("Anna", 2);

        BubbleSort.comparatorSort(employeeArray);
        for (Employee employee : employeeArray) {
            System.out.println(String.format("name is %s id is %s", employee.name, employee.employeeId));
        }
    }

    public static void comparatorSort(Employee[] employee) {
        // Sort employee based on employee id in increasing order
        // Starting syntax of anonymous methods
        Arrays.sort(employee, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e2.employeeId - e1.employeeId;
            }
        });

        // lambda based
        // Arrays.sort(employee, (a, b) -> a.employeeId - b.employeeId);

    }
}

class Employee {
    String name;
    int employeeId;

    public Employee(String name, int employeeId) {
        this.employeeId = employeeId;
        this.name = name;
    }

}
