package day8;

public class Airplane {
    private String manufacturer;
    private int year;
    private double length;
    private int weight;
    private int fuel = 0;

    Airplane(String manufacturer, int year, double length, int weight) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }

    public void setManufacturer (String manufacturer){
        this.manufacturer = manufacturer;
    }
    public void setYear (int year){
        this.year = year;
    }
    public void setLength (double length){
        this.length = length;
    }
    public void setWeight (int weight){
        this.weight = weight;
    }
    public void setFuel (int fuel){
        this.fuel = fuel;
    }

    public int getFuel(){
        return fuel;
    }

    public void info(){
        System.out.println("Изготовитель: " + manufacturer + ", год выпуска: " + year + ", длина: " + length + ", вес: " + weight + ", количество топлива в баке: " + fuel);
    }

    public void fillUp(int n){
        fuel = fuel + n;
    }

    public String toString(){
        return "Изготовитель: " + manufacturer + ", год выпуска: " + year + ", длина: " + length + ", вес: " + weight + ", количество топлива в баке: " + fuel;
    }

}
