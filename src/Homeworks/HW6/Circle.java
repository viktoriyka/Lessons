package Homeworks.HW6;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Радіус повинен бути не менше 0.");
        }
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

