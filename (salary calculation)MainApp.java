import java.util.Scanner;

    class Employee {
        String name;
        double salary;

        // Constructor
        public Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        // Method to display employee details
        public void displayDetails() {
            System.out.println("Employee Name: " + name);
            System.out.println("Employee Salary: " + salary);
        }
    }

    class SalaryCalculator {
        // Method to calculate bonus
        public double calculateBonus(double salary) {
            return salary * 0.1; // 10% bonus
        }
    }

    class MainApp {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Taking input from user
            System.out.print("Enter employee name: ");

            String name = scanner.nextLine();

            System.out.print("Enter employee salary: ");
            double salary = scanner.nextDouble();

            // Creating objects
            Employee employee = new Employee(name, salary);
            SalaryCalculator calculator = new SalaryCalculator();
            double bonus = calculator.calculateBonus(salary);

            // Displaying results
            employee.displayDetails();
            System.out.println("Bonus: " + bonus);

            // Closing scanner
            scanner.close();
        }
    }
