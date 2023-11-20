package resources;

abstract class Shape {
  abstract double calculateArea();
}

// Concrete subclass that extends the abstract class
class Circle extends Shape {
  double radius;

  Circle(double radius) {
    this.radius = radius;
  }

  @Override
  double calculateArea() {
    return Math.PI * radius * radius;
  }
}

// Another concrete subclass
class Rectangle extends Shape {
  double length;
  double width;

  Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }

  @Override
  double calculateArea() {
    return length * width;
  }
}

public class Main {
  public static void main(String[] args) {
    Circle circle = new Circle(5.0);
    Rectangle rectangle = new Rectangle(4.0, 6.0);

    System.out.println("Circle Area: " + circle.calculateArea());
    System.out.println("Rectangle Area: " + rectangle.calculateArea());
  }
}
