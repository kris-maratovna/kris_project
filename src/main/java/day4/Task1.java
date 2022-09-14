package day4;

import java.util.Scanner;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[] number = new int[a];
        Random rand = new Random();
        for (int i = 0; i < number.length; i++) {
            number[i] = rand.nextInt(11);
        }
        for (int b : number) {
            System.out.print(b + " ");
        }
        System.out.println();
        System.out.println("Длина массива: " + a);
        int j = 0;
        int k = 0;
        int r = 0;
        int w = 0;
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] > 8) {
                j = j + 1;
            }

            if (number[i] == 1) {
                k = k + 1;
            }

            if (number[i] % 2 == 0) {
                r = r + 1;
            }

            if (number[i] % 2 != 0) {
                w = w + 1;
            }

            sum = sum + number[i];
        }
        System.out.println("Количество чисел больше 8: " + j);
        System.out.println("Количество чисел равных 1: " + k);
        System.out.println("Количество четных чисел: " + r);
        System.out.println("Количество нечетных чисел: " + w);
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}