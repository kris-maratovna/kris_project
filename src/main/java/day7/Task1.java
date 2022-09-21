package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Boeing", 2020, 39.5, 41140);
        Airplane airplane2 = new Airplane("Airbus", 2018, 42.5, 45280);
        airplane1.compareAirplanes(airplane1, airplane2);
    }
}