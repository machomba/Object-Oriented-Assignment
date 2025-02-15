//program to output "vehivcle"
//Author: Ndibui Collins Machomba
//Reg no: CT101/G/20306/23
//Date: February 15,2024
//

// Import the Scanner class for user input
import java.util.Scanner;

// Base class Vehicle
class Vehicle {
    String brand;
    String model;
    int year;

    // Constructor to initialize vehicle details
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method to display vehicle details
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

// Subclass Car that inherits from Vehicle
class Car extends Vehicle {
    String fuelType;

    // Constructor to initialize car details, including fuel type
    public Car(String brand, String model, int year, String fuelType) {
        super(brand, model, year); // Call parent class constructor
        this.fuelType = fuelType;
    }

    // Overriding displayDetails method to include fuel type
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call parent method to display basic details
        System.out.println("Fuel Type: " + fuelType);
    }
}

// Showroom class to get user input and display car details
public class Showroom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for vehicle details
        System.out.print("Enter Brand: ");
        String brand = scanner.nextLine();

        System.out.print("Enter Model: ");
        String model = scanner.nextLine();

        System.out.print("Enter Year: ");
        int year = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter Fuel Type: ");
        String fuelType = scanner.nextLine();

        // Create Car object with user input
        Car car = new Car(brand, model, year, fuelType);

        // Display car details
        System.out.println("\nCar Details:");
        car.displayDetails();

        scanner.close();
    }
}
