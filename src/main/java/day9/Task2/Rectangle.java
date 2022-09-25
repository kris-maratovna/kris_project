package day9.Task2;

public class Rectangle extends Figure {
    private int a;
    private int b;

    public Rectangle (int a, int b, String color){
        super(color);
        this.a = a;
        this.b = b;
    }

    @Override
    public double area() {
        double areaRectangle = a*b;
        return areaRectangle;
    }

    @Override
    public double perimeter() {
        double perimeter = 2 * (a + b);
        return perimeter;
    }
}
