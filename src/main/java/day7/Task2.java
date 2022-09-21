package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rand = new Random();
        Player player1 = new Player(rand.nextInt(10) + 90);
        Player player2 = new Player(rand.nextInt(10) + 90);
        System.out.println(Player.countPlayers);
        Player.info();
        Player player3 = new Player(rand.nextInt(10) + 90);
        Player player4 = new Player(rand.nextInt(10) + 90);
        System.out.println(Player.countPlayers);
        Player.info();
        Player player5 = new Player(rand.nextInt(10) + 90);
        Player player6 = new Player(rand.nextInt(10) + 90);
        System.out.println(Player.countPlayers);
        Player.info();

        int playerStamina = player5.getStamina();
        for (int i = 0; i <= playerStamina; i++) {
            player5.run();
        }
        System.out.println(Player.countPlayers);

        Player player7 = new Player(rand.nextInt(10) + 90);
        Player player8 = new Player(rand.nextInt(10) + 90);
        System.out.println(Player.countPlayers);
    }
}
