//program to output "Employee bonus calculations"
//Author: Ndibui Collins Machomba
//Reg no: CT101/G/20306/23
//Date: January 23,2024
//

// Import the Scanner class for user input
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter their salary
        System.out.println("Enter your salary: ");
        double salary = scanner.nextDouble(); // Read the salary input

        // Ask the user to enter their years of service
        System.out.println("Enter your years of service: ");
        int yearsOfService = scanner.nextInt(); // Read the years of service input

        // Initialize bonus percentage
        double bonusPercentage;

        // Determine bonus percentage based on years of service
        if (yearsOfService > 10) {
            bonusPercentage = 12; // Bonus for more than 10 years
        } else if (yearsOfService >= 6) {
            bonusPercentage = 10; // Bonus for 6 to 10 years
        } else {
            bonusPercentage = 8; // Bonus for less than 6 years
        }

        // Calculate bonus amount
        double bonusAmount = (salary * bonusPercentage) / 100;

        // Print the net bonus amount
        System.out.println("Your bonus amount is: " + bonusAmount);

        // Close the scanner
        scanner.close();
    }
}
