package day6;

public class Motorbike {
    private String model;
    private String color;
    private int year;
    String name = "Мотоцикл";

    Motorbike(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    void info() {
        System.out.println("Это " + name);
    }

    int yearDifference(int inputYear) {
        int years = inputYear - year;
        return Math.abs(years);
    }
}
