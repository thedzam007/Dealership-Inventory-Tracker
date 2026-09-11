public class Car {

    private String make;
    private String model;
    private int year;
    private double price;

    /**
     * Constructor that initializes all four fields.
     */
    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    // ----- Getters -----

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    // ----- Setters -----

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Prints the car's details in a readable format.
     */
    public void displayCarInfo() {
        System.out.println("----- Car Info -----");
        System.out.println("Make:  " + make);
        System.out.println("Model: " + model);
        System.out.println("Year:  " + year);
        System.out.printf("Price: $%.2f%n", price);
        System.out.println("---------------------");
    }
}