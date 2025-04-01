package Opps2;

abstract class Shape {
 abstract void calculateArea();
 abstract void calculatePerimeter();
}


class Circle extends Shape {
 double radius;

 Circle(double radius) {
     this.radius = radius;
 }


 void calculateArea() {
     System.out.println("Circle Area: " + (3.14 * radius * radius));
 }


 void calculatePerimeter() {
     System.out.println("Circle Perimeter: " + (2 * 3.14 * radius));
 }
}


class Triangle extends Shape {
 double side1, side2, side3;

 Triangle(double side1, double side2, double side3) {
     this.side1 = side1;
     this.side2 = side2;
     this.side3 = side3;
 }

 
 void calculateArea() {
     double s = (side1 + side2 + side3) / 2;
     double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
     System.out.println("Triangle Area: " + area);
 }


 void calculatePerimeter() {
     System.out.println("Triangle Perimeter: " + (side1 + side2 + side3));
 }
}


public class Abstarct {
 public static void main(String[] args) {
     Circle circle = new Circle(5);
     circle.calculateArea();
     circle.calculatePerimeter();

     Triangle triangle = new Triangle(3, 4, 5);
     triangle.calculateArea();
     triangle.calculatePerimeter();
 }
}


