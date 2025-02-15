//program to output "STUDENT RECORD"
//Author: Ndibui Collins Machomba
//Reg no: CT101/G/20306/23
//Date: February 15,2024
//

// Import the Scanner class for user input
import java.util.Scanner;

// Class to store student details
class StudentRecord {
    // Fields to store student details
    private String studentID;
    private String name;
    private String course;

    // Constructor to initialize fields
    public StudentRecord(String studentID, String name, String course) {
        this.studentID = studentID;
        this.name = name;
        this.course = course;
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
    }
}

// Main class to get user input and display student details
import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input student details
        System.out.print("Enter Student ID: ");
        String studentID = scanner.nextLine();

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Course: ");
        String course = scanner.nextLine();

        // Create a StudentRecord object using user input
        StudentRecord student = new StudentRecord(studentID, name, course);

        // Display the student details
        System.out.println("\nStudent Details:");
        student.displayInfo();

        // Close the scanner
        scanner.close();
    }
}

