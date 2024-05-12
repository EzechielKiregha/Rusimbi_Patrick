package question1;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter Manager details:");
            System.out.print("Name: ");
            String managerName = scanner.nextLine();
            System.out.print("Address: ");
            String managerAddress = scanner.nextLine();
            System.out.print("Salary: ");
            double managerSalary = scanner.nextDouble();
            scanner.nextLine(); // Consume newline
            System.out.print("Job Title: ");
            String managerJobTitle = scanner.nextLine();
            System.out.print("Number of Subordinates: ");
            int numberOfSubordinates = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            Manager manager = new Manager(managerName, managerAddress, managerSalary, managerJobTitle, numberOfSubordinates);

            System.out.println("\nEnter Developer details:");
            System.out.print("Name: ");
            String developerName = scanner.nextLine();
            System.out.print("Address: ");
            String developerAddress = scanner.nextLine();
            System.out.print("Salary: ");
            double developerSalary = scanner.nextDouble();
            scanner.nextLine(); // Consume newline
            System.out.print("Job Title: ");
            String developerJobTitle = scanner.nextLine();
            System.out.print("Programming Language: ");
            String programmingLanguage = scanner.nextLine();

            Developer developer = new Developer(developerName, developerAddress, developerSalary, developerJobTitle, programmingLanguage);

            System.out.println("\nEnter Programmer details:");
            System.out.print("Name: ");
            String programmerName = scanner.nextLine();
            System.out.print("Address: ");
            String programmerAddress = scanner.nextLine();
            System.out.print("Salary: ");
            double programmerSalary = scanner.nextDouble();
            scanner.nextLine(); // Consume newline
            System.out.print("Job Title: ");
            String programmerJobTitle = scanner.nextLine();
            System.out.print("Programming Language: ");
            String programmerProgrammingLanguage = scanner.nextLine();
            System.out.print("Preferred IDE: ");
            String preferredIDE = scanner.nextLine();

            Programmer programmer = new Programmer(programmerName, programmerAddress, programmerSalary, programmerJobTitle, programmerProgrammingLanguage, preferredIDE);

            System.out.println("\nManager Performance Report:");
            System.out.println(manager.generatePerformanceReport());
            System.out.println("Bonus: $" + manager.calculateBonus());
            manager.manageProjects();

            System.out.println("\nDeveloper Performance Report:");
            System.out.println(developer.generatePerformanceReport());
            System.out.println("Bonus: $" + developer.calculateBonus());
            developer.writeCode();

            System.out.println("\nProgrammer Performance Report:");
            System.out.println(programmer.generatePerformanceReport());
            System.out.println("Bonus: $" + programmer.calculateBonus());
            programmer.writeCode();
            programmer.debugCode();

        } catch (InputMismatchException e) {
            System.out.println("Input mismatch exception occurred. Please enter valid input.");
        } finally {
            scanner.close();
        }
    }
}
