//program to output "sum of two numbers"
//Author: Ndibui Collins Machomba
//Reg no: CT101/G/20306/23
//Date: January 23,2024
//

// Import Scanner class
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create  Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the first number
        System.out.println("Enter the first number: ");
        // Read the first integer input
        int num1 = scanner.nextInt();

        // Prompt user to enter the second number
        System.out.println("Enter the second number: ");
        // Read the second integer input
        int num2 = scanner.nextInt();

        // Calculate the sum of the two numbers
        int sum = num1 + num2;

        // Display the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        // Close the scanner
        scanner.close();
    }
}
