package sample;

//package Thread;
//
//class Vehicle {
//  String brand;
//  int year;
//
//  Vehicle(String brand, int year) {
//    this.brand = brand;
//    this.year = year;
//  }
//
//  void start() {
//    System.out.println("Vehicle is starting.");
//  }
//}
//
//class Car extends Vehicle {
//  int numberOfDoors;
//
//  Car(String brand, int year, int numberOfDoors) {
//    super(brand, year); // Call the constructor of the superclass
//    this.numberOfDoors = numberOfDoors;
//  }
//
//  void accelerate() {
//    System.out.println("Car is accelerating.");
//  }
//}
//
//public class Main {
//  public static void main(String[] args) {
//    Car myCar = new Car("Toyota", 2022, 4);
//
//    System.out.println("Car brand: " + myCar.brand);
//    System.out.println("Car year: " + myCar.year);
//    System.out.println("Number of doors: " + myCar.numberOfDoors);
//
//    myCar.start();      // Calls the inherited start() method from the Vehicle class
//    myCar.accelerate();  // Calls the Car class's accelerate() method
//  }
//}
class Vehicle {
  void start() {
    System.out.println("Vehicle is starting.");
  }
}

class Car extends Vehicle {
  void accelerate() {
    System.out.println("Car is accelerating.");
  }
}

class SportsCar extends Car {
  void turboBoost() {
    System.out.println("Sports car is boosting with turbo.");
  }
}

public class Main {
  public static void main(String[] args) {
    SportsCar mySportsCar = new SportsCar();

    mySportsCar.start();       // Inherited from Vehicle
    mySportsCar.accelerate();   // Inherited from Car
    mySportsCar.turboBoost();  // Specific to SportsCar
  }
}
