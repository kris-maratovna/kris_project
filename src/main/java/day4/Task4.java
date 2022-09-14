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

        for (int i = 0; i < numbers.length - 2; i++) {
            sum = numbers[i] + numbers[i + 1] + numbers[i + 2];
            if (sum >= max) {
                max = sum;
                index = i;
            }
        }

        System.out.println(sum);
        System.out.println(index);
    }
}

