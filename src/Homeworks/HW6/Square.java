package Homeworks.HW6;

public class Square extends Figure{
    private int aSideLength;

    public Square(int aSideLength) {
        this.aSideLength = aSideLength;
    }

    @Override
    public double area() {
        return aSideLength * aSideLength;
    }

    @Override
    public double perimeter() {
        return aSideLength * 4;
    }
}
