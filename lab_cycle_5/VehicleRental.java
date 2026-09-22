class Vehicle {
    String regNo;
    double dailyRate;

    Vehicle(String regNo, double dailyRate) {
        this.regNo = regNo;
        this.dailyRate = dailyRate;
    }

    double computeRent(int days) {
        return dailyRate * days;
    }
}

class Car extends Vehicle {
    int numDoors;

    Car(String regNo, double dailyRate, int numDoors) {
        super(regNo, dailyRate);
        this.numDoors = numDoors;
    }

    @Override
    double computeRent(int days) {
        return super.computeRent(days) + 200;
    }
}

public class VehicleRental {
    public static void main(String[] args) {
        Car car = new Car("KL01AB1234", 1000, 4);

        System.out.println("Registration No: " + car.regNo);
        System.out.println("Daily Rate: " + car.dailyRate);
        System.out.println("Number of Doors: " + car.numDoors);
        System.out.println("Rent for 3 days: " + car.computeRent(3));
    }
}