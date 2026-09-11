import java.util.Scanner;

/**
 * Dealership.java
 * Main class that collects information for multiple cars from the
 * user, creates Car objects, and displays their details.
 */
public class Dealership {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int NUM_CARS = 3; // Number of cars to enter
        Car[] inventory = new Car[NUM_CARS];

        // Loop to collect details for multiple cars
        for (int i = 0; i < NUM_CARS; i++) {
            System.out.println("\nEnter details for car #" + (i + 1) + ":");

            System.out.print("Make: ");
            String make = scanner.nextLine();

            System.out.print("Model: ");
            String model = scanner.nextLine();

            System.out.print("Year: ");
            int year = Integer.parseInt(scanner.nextLine());

            System.out.print("Price: ");
            double price = Double.parseDouble(scanner.nextLine());

            // Create a new Car object using the constructor
            Car car = new Car(make, model, year, price);
            inventory[i] = car;
        }

        // Display all cars in the dealership inventory
        System.out.println("\n===== Dealership Inventory =====");
        for (Car car : inventory) {
            car.displayCarInfo();
        }

        scanner.close();
    }
}