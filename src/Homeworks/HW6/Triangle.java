package Homeworks.HW6;

public class Triangle extends Figure {
    private int aSideLength;
    private int bSideLength;
    private int cSideLength;
    private int hLength;
    private double angle;

    public Triangle(int aSideLength, int hLength) {
        this.aSideLength = aSideLength;
        this.hLength = hLength;
    }

    public Triangle(int aSideLength, int bSideLength, int cSideLength) {
        this.aSideLength = aSideLength;
        this.bSideLength = bSideLength;
        this.cSideLength = cSideLength;
    }

    public Triangle(int aSideLength, int bSideLength, double angle) {
        this.aSideLength = aSideLength;
        this.bSideLength = bSideLength;
        this.angle = angle;
    }

    private double area(int aSideLength, int bSideLength, int cSideLength){
        double semiP = (aSideLength + bSideLength + cSideLength) / 2;
        return Math.sqrt(semiP * (semiP - aSideLength) * (semiP - bSideLength) * (semiP - cSideLength));
    }

    private double area(int aSideLength, int hLength){
        return aSideLength * hLength * 0.5;
    }

    private double area (int aSideLength, int bSideLength, double angle){
        return 0.5 * aSideLength * bSideLength * Math.sin(angle);
    }


    @Override
    public double area() {
        if (hLength != 0) {
            return area(aSideLength,hLength);
        }
        else if (angle != 0) {
            return area(aSideLength, bSideLength, angle);
        }
        else {
            return area(aSideLength, bSideLength, cSideLength);
        }
    }

    public double perimeter(){
        return aSideLength + bSideLength + cSideLength;
    }

}
