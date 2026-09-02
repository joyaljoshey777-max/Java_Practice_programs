// Parent class
class Vehicle {

    // Public member
    // Can be accessed from anywhere
    public String company;

    // Protected member
    // Accessible in subclasses and same package
    protected String model;

    // Default member
    // Accessible within the same package
    String fuelType;

    // Vehicle constructor
    Vehicle(String company, String model, String fuelType) {
        this.company = company;
        this.model = model;
        this.fuelType = fuelType;
    }
}

// Car inherits Vehicle
class Car extends Vehicle {

    // Car constructor
    Car(String company, String model, String fuelType) {

        // Calling parent constructor
        super(company, model, fuelType);
    }

    // Display inherited members
    void displayCar() {

        System.out.println("Vehicle Information");
        System.out.println("-------------------");

        // Accessing public member
        System.out.println("Company   : " + company);

        // Accessing protected member
        System.out.println("Model     : " + model);

        // Accessing default member
        System.out.println("Fuel Type : " + fuelType);
    }
}

// Main class
public class Task4_Vehicle_Car {

    public static void main(String[] args) {

        // Creating Car object
        Car c = new Car(
            "Toyota",
            "Innova",
            "Diesel"
        );

        // Display vehicle information
        c.displayCar();

        System.out.println(
            "\nCar object created successfully."
        );
    }
}