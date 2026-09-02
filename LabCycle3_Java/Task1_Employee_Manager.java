// Parent class
class Employee {

    int employeeId;
    String employeeName;
    double salary;

    // Employee constructor
    Employee(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    // Display employee details
    void displayEmployee() {
        System.out.println("Employee Details");
        System.out.println("----------------");
        System.out.println("ID     : " + employeeId);
        System.out.println("Name   : " + employeeName);
        System.out.println("Salary : " + salary);
    }
}

// Manager inherits Employee
class Manager extends Employee {

    String department;
    double bonus;

    // Manager constructor
    Manager(int employeeId, String employeeName, double salary,
            String department, double bonus) {

        // Calling parent constructor
        super(employeeId, employeeName, salary);

        this.department = department;
        this.bonus = bonus;
    }

    // Display manager details
    void displayManager() {

        // Reusing inherited method
        displayEmployee();

        System.out.println("\nManager Details");
        System.out.println("----------------");
        System.out.println("Department : " + department);
        System.out.println("Bonus      : " + bonus);
    }
}

// Main class
public class Task1_Employee_Manager {

    public static void main(String[] args) {

        // Creating Manager object
        Manager m = new Manager(
            101,
            "Arun",
            50000,
            "Sales",
            15000
        );

        // Display details
        m.displayManager();
    }
}
