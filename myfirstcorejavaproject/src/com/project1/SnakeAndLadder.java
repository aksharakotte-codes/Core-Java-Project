package com.project1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class SnakeAndLadder {

    // Colors
    public static final String RESET = "\u001B[0m";

    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";

    public static final String RED_BOLD = "\033[1;31m";
    public static final String GREEN_BOLD = "\033[1;32m";
    public static final String YELLOW_BOLD = "\033[1;33m";

    public static void gameStart(List<Player> playerlist) {

        System.out.println(GREEN_BOLD);
        System.out.println("====================================================");
        System.out.println("          SNAKE AND LADDER GAME STARTED");
        System.out.println("====================================================");
        System.out.println(RESET);

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        
        // Ladders
        Map<Integer, Integer> ladder = new HashMap<>();
        ladder.put(6, 16);
        ladder.put(21, 36);
        ladder.put(18, 45);
        ladder.put(41, 65);
        ladder.put(10, 97);
        ladder.put(35, 85);

        // Snakes
        Map<Integer, Integer> snakes = new HashMap<>();
        snakes.put(99, 7);
        snakes.put(68, 30);
        snakes.put(42, 17);
        snakes.put(54, 32);
        snakes.put(86, 20);
        snakes.put(38, 5);

        int currentplayerIndex = 0;

        while (true) {

            Player player = playerlist.get(currentplayerIndex);

            System.out.println(CYAN);
            System.out.println("----------------------------------------------------");
            System.out.println("Player Turn : " + player.getName());
            System.out.println("Current Position : " + player.getPosition());
            System.out.println("Press ENTER To Roll Dice...");
            System.out.println("----------------------------------------------------");
            System.out.println(RESET);

            sc.nextLine();

            int dice = random.nextInt(6) + 1;

            System.out.println(YELLOW_BOLD +
                    "🎲 Dice Value : " + dice + RESET);

            int newPosition = player.getPosition() + dice;

            if (newPosition > 100) {

                System.out.println(PURPLE +
                        "❌ Move Skipped! Position exceeds 100."
                        + RESET);

            } else {

                if (ladder.containsKey(newPosition)) {

                    System.out.println(GREEN_BOLD);
                    System.out.println("🎉🎉 LADDER FOUND 🎉🎉");
                    System.out.println("Position : " + newPosition);
                    System.out.println("Jumping To : "
                            + ladder.get(newPosition));
                    System.out.println(RESET);

                    player.setPosition(ladder.get(newPosition));

                    System.out.println(GREEN +
                            player.getName()
                            + " reached position : "
                            + player.getPosition()
                            + RESET);

                } else if (snakes.containsKey(newPosition)) {

                    System.out.println(RED_BOLD);
                    System.out.println("🐍🐍 SNAKE BIT YOU 🐍🐍");
                    System.out.println("Position : " + newPosition);
                    System.out.println("Going Down To : "
                            + snakes.get(newPosition));
                    System.out.println(RESET);

                    player.setPosition(snakes.get(newPosition));

                    System.out.println(RED +
                            player.getName()
                            + " reached position : "
                            + player.getPosition()
                            + RESET);

                } else {

                    player.setPosition(newPosition);

                    System.out.println(BLUE +
                            player.getName()
                            + " moved to position : "
                            + player.getPosition()
                            + RESET);
                }

                if (player.getPosition() == 100) {

                    System.out.println(GREEN_BOLD);
                    System.out.println();
                    System.out.println("🏆🏆🏆🏆🏆🏆🏆🏆🏆🏆🏆🏆🏆");
                    System.out.println("      WINNER : "
                            + player.getName());
                    System.out.println("   CONGRATULATIONS !!!");
                    System.out.println("🏆🏆🏆🏆🏆🏆🏆🏆🏆🏆🏆🏆🏆");
                    System.out.println(RESET);

                    break;
                }
            }

            currentplayerIndex =
                    (currentplayerIndex + 1)
                            % playerlist.size();
        }

        sc.close();
    }

    public static void main(String[] args) {

        Player p1 = new Player("Akshara");
        Player p2 = new Player("Vyshnavi");

        List<Player> list = new ArrayList<>();

        list.add(p1);
        list.add(p2);

        gameStart(list);
    }
}
