package resources;

class Vehicle {
  String brand;
  int year;

  Vehicle(String brand, int year) {
    this.brand = brand;
    this.year = year;
  }

  void start() {
    System.out.println("Starting the vehicle.");
  }

  void stop() {
    System.out.println("Stopping the vehicle.");
  }
}

class Car extends Vehicle {
  int numberOfDoors;

  Car(String brand, int year, int numberOfDoors) {
    super(brand, year);
    this.numberOfDoors = numberOfDoors;
  }

  @Override
  void start() {
    System.out.println("Starting the car.");
  }
}

class Motorcycle extends Vehicle {
  int engineSize;

  Motorcycle(String brand, int year, int engineSize) {
    super(brand, year);
    this.engineSize = engineSize;
  }

  @Override
  void start() {
    System.out.println("Starting the motorcycle.");
  }
}

public class adSc {
  public static void main(String[] args) {
    Car myCar = new Car("Toyota", 2022, 4);
    Motorcycle myMotorcycle = new Motorcycle("Harley-Davidson", 2022, 1600);

    myCar.start();       // Calls the overridden start method in the Car class
    myCar.stop();        // Calls the inherited stop method from the Vehicle class

    myMotorcycle.start(); // Calls the overridden start method in the Motorcycle class
    myMotorcycle.stop();  // Calls the inherited stop method from the Vehicle class
  }
}