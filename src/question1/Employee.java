package question1;

import java.util.InputMismatchException;
import java.util.Scanner;

class Employee {
    protected String name;
    protected String address;
    protected double salary;
    protected String jobTitle;

    public Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public double calculateBonus() {
        // Default bonus calculation logic
        return 0.05 * salary; // 5% of salary
    }

    public String generatePerformanceReport() {
        // Implement performance report generation logic here
        return "Performance report for " + name + ": Excellent performance this quarter!";
    }
}

class Manager extends Employee {
    private int numberOfSubordinates;

    public Manager(String name, String address, double salary, String jobTitle, int numberOfSubordinates) {
        super(name, address, salary, jobTitle);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public double calculateBonus() {
        // Manager's bonus calculation logic
        return 0.08 * salary; // 8% of salary for managers
    }

    public void manageProjects() {
        // Implement project management logic here
        System.out.println("Manager " + name + " is managing projects efficiently with " + numberOfSubordinates + " subordinates.");
    }
}

class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, String address, double salary, String jobTitle, String programmingLanguage) {
        super(name, address, salary, jobTitle);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public double calculateBonus() {
        // Developer's bonus calculation logic
        return 0.07 * salary; // 7% of salary for developers
    }

    public void writeCode() {
        // Implement code writing logic here
        System.out.println(name + " is writing code in " + programmingLanguage + ".");
    }
}

class Programmer extends Developer {
    private String preferredIDE;

    public Programmer(String name, String address, double salary, String jobTitle, String programmingLanguage, String preferredIDE) {
        super(name, address, salary, jobTitle, programmingLanguage);
        this.preferredIDE = preferredIDE;
    }

    @Override
    public double calculateBonus() {
        // Programmer's bonus calculation logic
        return 0.1 * salary; // 10% of salary for programmers
    }

    public void debugCode() {
        // Implement debugging logic here
        System.out.println(name + " is debugging code using " + preferredIDE + ".");
    }
}
