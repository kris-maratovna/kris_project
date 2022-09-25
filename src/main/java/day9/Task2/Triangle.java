package day9.Task2;

public class Triangle extends Figure{
    private int c1;
    private int c2;
    private int c3;

    public Triangle (int c1, int c2, int c3, String color){
        super(color);
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
    }

    @Override
    public double area() {
        int p = (c1 + c2 + c3) / 2;
        double areaTriangle = Math. sqrt(p * (p - c1) * (p - c2) * (p - c3));
        return areaTriangle;
    }

    @Override
    public double perimeter() {
        double perimeter = c1 + c2 + c3;
        return perimeter;
    }
}
