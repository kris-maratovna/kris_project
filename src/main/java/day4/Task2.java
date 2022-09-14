package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] number = new int[100];
        Random rand = new Random();
        int a = 0;
        int b = 0;

        for (int i = 0; i < number.length; i++) {
            number[i] = rand.nextInt(10000);
        }
        int max = number[0];
        int min = number[0];
        for (int c : number) {

            if (c % 10 == 0) {
                a = a + 1;
                b = b + c;
            }
            if (c > max) {
                max = c;
            }
            if (c < min) {
                min = c;
            }
        }
            System.out.println(max);
            System.out.println(min);
            System.out.println(a);
            System.out.println(b);

    }
}
