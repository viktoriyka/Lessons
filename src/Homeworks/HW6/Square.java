package Homeworks.HW6;

public class Square extends Figure{
private int aSideLength;

    public Square(int aSideLength) {
        this.aSideLength = aSideLength;
    }

    public double area() {
        return aSideLength * aSideLength;
    }


    public double perimeter() {
        return aSideLength * 4;
    }
}
