package Homeworks.HW6;

public class Main {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(18,12);
        System.out.println("Perimeter of the Triangle: " + triangle1.perimeter());
        System.out.println("Area of the Triangle: " + triangle1.area());
        Square square = new Square(12);
        System.out.println("Perimeter of the Square: " + square.perimeter());
        System.out.println("Area of the Square: " + square.area());
        Circle circle = new Circle(13);
        System.out.println("Perimeter of the Circle: " + circle.perimeter());
        System.out.println("Area of the Circle: " + circle.area());
    }
}