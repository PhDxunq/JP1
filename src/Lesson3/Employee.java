package Lesson3;

public class Employee {
    private String name;
    private String employeeId;
    private String position;
    private double salary;

    public Employee(String name, String employeeId, String position, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.position = position;
        this.salary = salary;
    }

    public double calculateAnnualSalary() {
        return salary * 12;
    }
}

