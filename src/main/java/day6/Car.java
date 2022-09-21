package day6;

public class Car {
    private String model;
    private String color;
    private int year;
    private String name = "Автомобиль";

    public void setModel(String carModel) {
        model = carModel;
    }

    public String getModel() {
        return model;
    }

    public void setColor(String carColor) {
        color = carColor;
    }

    public String getColor() {
        return color;
    }

    public void setYear(int carYear) {
        year = carYear;
    }

    public int getYear() {
        return year;
    }

    void info() {
        System.out.println("Это " + name);
    }

    int yearDifference(int inputYear) {
        return Math.abs(inputYear - year);
    }
}
