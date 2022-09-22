package day8;

public class Task1 {
    public static void main(String[] args) {
        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i<=20000; i++){
            String string = i + " ";
            System.out.print(string);
        }
        long stopTime1 = System.currentTimeMillis();
        System.out.println();
        System.out.println("Длительность работы, в мс.: "+ (stopTime1 - startTime1));
        System.out.println();

        long startTime2 = System.currentTimeMillis();
        for (int j = 0; j<=20000; j++){
            StringBuilder sb = new StringBuilder();
            System.out.print(sb.append(j + " "));
        }
        long stopTime2 = System.currentTimeMillis();
        System.out.println();
        System.out.println("Длительность работы, в мс.: "+ (stopTime2 - startTime2));
    }
}
