package day8;

public class Task1 {
    public static void main(String[] args) {
        long startTime1 = System.currentTimeMillis();
        String string = "";
        for (int i = 0; i<=20000; i++){
            string = string + i + " ";
        }
        System.out.println(string);
        long stopTime1 = System.currentTimeMillis();
        System.out.println("Длительность работы, в мс.: "+ (stopTime1 - startTime1));
        System.out.println();

        long startTime2 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j<=20000; j++){
            sb.append(j + " ");
        }
        System.out.println(sb);
        long stopTime2 = System.currentTimeMillis();
        System.out.println("Длительность работы, в мс.: "+ (stopTime2 - startTime2));
    }
}
