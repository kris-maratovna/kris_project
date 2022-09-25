package day9.Task2;

public class Circle extends Figure {
    private int r;

    public Circle(int r, String color){
        super(color);
        this.r = r;
    }

    @Override
    public double area() {
        double areaCircle = Math.PI * Math.pow(r,2);
        return areaCircle;
    }

    @Override
    public double perimeter() {
        double perimeter = 2*Math.PI*r;
        return perimeter;
    }
}
