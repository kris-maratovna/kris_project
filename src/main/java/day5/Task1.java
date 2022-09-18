package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setModel("Ауди");
        car1.setColor("Красный");
        car1.setYear(2022);

        System.out.println("Модель автомобиля " + car1.getModel());
        System.out.println("Цвет автомобиля " + car1.getColor());
        System.out.println("Год выпуска автомобиля " + car1.getYear());

    }
}
