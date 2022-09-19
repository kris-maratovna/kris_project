package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Boeing", 2020, 39.5, 41140);
        airplane1.setYear(2018);
        airplane1.setLength(40.5);
        airplane1.fillUp(20000);
        airplane1.fillUp(6000);
        airplane1.info();
    }
}
