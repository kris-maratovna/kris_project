package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setModel("Ауди");
        car1.setColor("Красный");
        car1.setYear(2022);
        car1.info();
        System.out.println(car1.yearDifference(2015));


        Motorbike motorbike1 = new Motorbike("Honda", "черный", 2022);
        motorbike1.info();
        System.out.println(motorbike1.yearDifference(2012));
    }
}
