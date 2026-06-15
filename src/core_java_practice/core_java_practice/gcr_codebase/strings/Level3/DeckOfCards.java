package core_java_practice.core_java_practice.gcr_codebase.strings.Level3;

import java.util.Scanner;

public class DeckOfCards {

    public static String[] initializeDeck() {

        String[] suits = {
                "Hearts",
                "Diamonds",
                "Clubs",
                "Spades"
        };

        String[] ranks = {
                "2","3","4","5","6","7",
                "8","9","10","Jack",
                "Queen","King","Ace"
        };

        String[] deck = new String[52];

        int index = 0;

        for (String suit : suits) {

            for (String rank : ranks) {

                deck[index++] =
                        rank + " of " + suit;
            }
        }

        return deck;
    }

    public static void shuffle(String[] deck) {

        int n = deck.length;

        for (int i = 0; i < n; i++) {

            int random =
                    i + (int)(Math.random()
                            * (n - i));

            String temp = deck[i];
            deck[i] = deck[random];
            deck[random] = temp;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Number of Players: ");
        int players = sc.nextInt();

        System.out.print("Cards Per Player: ");
        int cards = sc.nextInt();

        if (players * cards > 52) {

            System.out.println(
                    "Not enough cards!");

            return;
        }

        String[] deck = initializeDeck();

        shuffle(deck);

        String[][] playerCards =
                new String[players][cards];

        int cardIndex = 0;

        for (int i = 0; i < players; i++) {

            for (int j = 0; j < cards; j++) {

                playerCards[i][j] =
                        deck[cardIndex++];
            }
        }

        for (int i = 0; i < players; i++) {

            System.out.println(
                    "\nPlayer " + (i + 1));

            for (int j = 0; j < cards; j++) {

                System.out.println(
                        playerCards[i][j]);
            }
        }

        sc.close();
    }
}