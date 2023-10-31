package Homeworks.HW6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введіть радіус кола: ");
            int radius = scanner.nextInt();
            Circle circle = new Circle(radius);

            if (circle.area() > 0) {
                System.out.println("Площа кола: " + circle.area());
                System.out.println("Периметр кола: " + circle.perimeter());
            } else {
                System.out.println("Радіус кола менше або дорівнює 0.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (java.util.InputMismatchException e) {
            System.out.println("Невірний формат введених даних. Введіть ціле число.");
        }

        try {
            System.out.print("Введіть сторону квадрата: ");
            int sideLength = scanner.nextInt();
            Square square = new Square(sideLength);

            if (square.area() > 0) {
                System.out.println("Площа квадрата: " + square.area());
                System.out.println("Периметр квадрата: " + square.perimeter());
            } else {
                System.out.println("Сторона квадрата менше або дорівнює 0.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (java.util.InputMismatchException e) {
            System.out.println("Невірний формат введених даних. Введіть ціле число.");
        }

        try {
            System.out.print("Введіть сторону трикутника: ");
            int aSideLength = scanner.nextInt();
            System.out.print("Введіть висоту трикутника: ");
            int hLength = scanner.nextInt();
            Triangle triangle1 = new Triangle(aSideLength, hLength);

            if (triangle1.area() > 0) {
                System.out.println("Площа трикутника: " + triangle1.area());
                System.out.println("Периметр трикутника: " + triangle1.perimeter());
            } else {
                System.out.println("Сторона або висота трикутника менше або дорівнює 0.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Невірний формат введених даних. Введіть ціле число.");
        }

        try {
            System.out.print("Введіть першу сторону трикутника: ");
            int a = scanner.nextInt();
            System.out.print("Введіть другу сторону трикутника: ");
            int b = scanner.nextInt();
            System.out.print("Введіть кут між ними: ");
            double angle = scanner.nextDouble();
            Triangle triangle2 = new Triangle(a, b, angle);

            if (triangle2.area() > 0) {
                System.out.println("Площа трикутника: " + triangle2.area());
                System.out.println("Периметр трикутника: " + triangle2.perimeter());
            } else {
                System.out.println("Сторони трикутника або кут менше або дорівнюють 0.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Невірний формат введених даних. Введіть ціле число для сторін і число для кута.");
        }

        try {
            System.out.print("Введіть першу сторону трикутника: ");
            int aSide = scanner.nextInt();
            System.out.print("Введіть другу сторону трикутника: ");
            int bSide = scanner.nextInt();
            System.out.print("Введіть третю сторону трикутника: ");
            int cSide = scanner.nextInt();
            Triangle triangle3 = new Triangle(aSide, bSide, cSide);

            if (triangle3.area() > 0) {
                System.out.println("Площа трикутника: " + triangle3.area());
                System.out.println("Периметр трикутника: " + triangle3.perimeter());
            } else {
                System.out.println("Сторони трикутника менше або дорівнюють 0.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Невірний формат введених даних. Введіть цілі числа для сторін трикутника.");
        }

        scanner.close();
    }
}