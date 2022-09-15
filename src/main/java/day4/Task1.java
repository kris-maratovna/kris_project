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
        int moreEight = 0;
        int equalOne= 0;
        int evenNumber = 0;
        int oddNumber = 0;
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] > 8) {
                moreEight = moreEight + 1;
            }

            if (number[i] == 1) {
                equalOne = equalOne + 1;
            }

            if (number[i] % 2 == 0) {
                evenNumber = evenNumber + 1;
            } else {
                oddNumber = oddNumber + 1;
            }

            sum = sum + number[i];
        }
        System.out.println("Количество чисел больше 8: " + moreEight);
        System.out.println("Количество чисел равных 1: " + equalOne);
        System.out.println("Количество четных чисел: " + evenNumber);
        System.out.println("Количество нечетных чисел: " + oddNumber);
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}