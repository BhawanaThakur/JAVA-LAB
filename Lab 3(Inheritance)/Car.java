class Vehicle {
    int vehicleNo;
    String ownerName;
    Vehicle(int vehicleNo, String ownerName) {
        this.vehicleNo = vehicleNo;
        this.ownerName = ownerName;
    }
void displayVehicle() {
    System.out.println("Vehicle No: " + vehicleNo);
    System.out.println("Owner Name: " + ownerName);
}}
public class Car extends Vehicle {
    String model;
    String fuelType;
    Car(int vehicleNo, String ownerName, String model, String fuelType) {
        super(vehicleNo, ownerName);
        this.model = model;
        this.fuelType = fuelType;
    }
    void displayCar() {
        displayVehicle();
        System.out.println("Model: " + model);
        System.out.println("Fuel Type: " + fuelType);
    }
    public static void main(String[] args) {
        Car car = new Car(1234, "Bhawana", "Mercedes", "Diesel");
        car.displayCar();
    }
}
