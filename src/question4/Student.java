import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Student {
    private int studentId;
    private String studentName;
    private int age;
    private String province;
    private String district;
    private String sector;
    private double[] grades;
    private int gradesCount;

    // Constructor
    public Student(int studentId, String studentName, int age, String province, String district, String sector) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.province = province;
        this.district = district;
        this.sector = sector;
        this.grades = new double[10]; // Assuming a maximum of 10 grades
        this.gradesCount = 0;
    }

    // Getter and setter methods
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public double[] getGrades() {
        return Arrays.copyOf(grades, gradesCount);
    }

    // Method to add grade with validation
    public void addGrade(double grade) {
        if (gradesCount < grades.length) {
            grades[gradesCount] = grade;
            gradesCount++;
        } else {
            System.out.println("Cannot add more grades. Maximum grades limit reached.");
        }
    }

    // Method to display student information
    public void displayStudentInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Age: " + age);
        System.out.println("Province: " + province);
        System.out.println("District: " + district);
        System.out.println("Sector: " + sector);
        System.out.println("Grades: " + Arrays.toString(getGrades()));
    }
}

 class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter student ID:");
            int studentId = scanner.nextInt();

            scanner.nextLine(); // Consume newline

            System.out.println("Enter student name:");
            String studentName = scanner.nextLine();

            System.out.println("Enter age:");
            int age = scanner.nextInt();

            scanner.nextLine(); // Consume newline

            System.out.println("Enter province:");
            String province = scanner.nextLine();

            System.out.println("Enter district:");
            String district = scanner.nextLine();

            System.out.println("Enter sector:");
            String sector = scanner.nextLine();

            // Creating a new Student object
            Student student1 = new Student(studentId, studentName, age, province, district, sector);

            // Adding grades
            while (true) {
                System.out.println("Enter grade (or type 'done' to finish):");
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("done")) {
                    break;
                }
                try {
                    double grade = Double.parseDouble(input);
                    student1.addGrade(grade);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid grade input. Please enter a valid number.");
                }
            }

            // Displaying student information
            student1.displayStudentInfo();
        } catch (InputMismatchException e) {
            System.out.println("Input mismatch exception occurred. Please enter valid input.");
        } finally {
            scanner.close();
        }
    }
}
