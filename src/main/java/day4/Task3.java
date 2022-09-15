package day4;

import java.util.Random;


public class Task3 {
    public static void main(String[] args) {
        int m = 12;
        int n = 8;
        int[][] matrice = new int[m][n];
        Random rand = new Random();
        int sum = 0;
        int max = 0;
        int index = 0;
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                matrice[i][j] = rand.nextInt(50);
                sum = sum + matrice[i][j];

                if (sum >= max) {
                    max = sum;
                    index = i;
                }

            }
            sum = 0;

        }
        System.out.println(index);

    }
}
