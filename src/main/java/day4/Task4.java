package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        Random rand = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(10000);
        }
        int sum = 0;
        int max = 0;
        int index = 0;
        int quantity = 2;


        for (int i = 0; i < numbers.length - quantity; i++) {
            for (int j = i; j <= i + quantity; j++) {
                sum = sum + numbers[j];
            }

            if (sum >= max) {
                max = sum;
                index = i;
            }
            sum = 0;
        }
        System.out.println(max);
        System.out.println(index);
    }
}

