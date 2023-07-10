import java.util.Random;

/*      @author Mehmet Akif Şahin
 *      Section 2 - 22203673
 *      Lab - 5 - Question 2
 *      @date 10 / 11 / 2022
 *      Old Maid Game
 */

public class Lab5_Q2{
    public static void main(String[] args) {
        String cardTypes = "123456789TJQK";
        String deck = "";
        
        String player1Hand = "";
        String player2Hand = "";

        Random rand = new Random();

        //creating deck
        for (int i = 0; i < cardTypes.length();i++)
        {
            for (int j = 0; j < 4; j++)
            {
                String card = Character.toString(cardTypes.charAt(i));
                deck = deck.concat(card);
            }
        }
        deck = deck.substring(0,deck.length() - 1); //removing the 4th king
        
        System.out.println("Starting the game with the following deck:\n" + deck + "\nInitial cards are dealing...\n");

        //randomly dealing hands for 2 players
        do{
            int randomChoice = rand.nextInt(deck.length());
            String card = Character.toString(deck.charAt(randomChoice));
            player1Hand = player1Hand.concat(card);
            deck = deck.substring(0, randomChoice) + deck.substring(randomChoice + 1, deck.length());
            
            randomChoice = rand.nextInt(deck.length());
            card = Character.toString(deck.charAt(randomChoice));
            player2Hand = player2Hand.concat(card);
            deck = deck.substring(0, randomChoice) + deck.substring(randomChoice + 1, deck.length());
        }
        while (deck.length() > 1);
        
        //dealing of 51th card and deciding who is gonna start because of one less card
        boolean player1HasMoreCards = false;
        if (rand.nextInt(2) == 1){
            player1Hand = player1Hand.concat(deck);
            player1HasMoreCards = true;
        }
        else
        {
            player2Hand = player2Hand.concat(deck);
        }
        deck = "";

        System.out.println("Player-1 Hand: " + player1Hand +
                         "\nPlayer-2 Hand: " + player2Hand);
        
        /* removing pairs by starting from last index then looking for if the rest of the string contains that card
         * then replaces 2 of that card with empty spaces
        */
        for (int i = player1Hand.length() - 1; i > 0;i--)
        {
            if (player1Hand.substring(0, i).contains(Character.toString(player1Hand.charAt(i))))
            {
                String removedCard = Character.toString(player1Hand.charAt(i));
                player1Hand = player1Hand.replaceFirst(removedCard, "");
                player1Hand = player1Hand.replaceFirst(removedCard, "");
                i -= 1;
            }
        }
        for (int i = player2Hand.length() - 1; i > 0;i--)
        {
            if (player2Hand.substring(0, i).contains(Character.toString(player2Hand.charAt(i))))
            {
                String removedCard = Character.toString(player2Hand.charAt(i));
                player2Hand = player2Hand.replaceFirst(removedCard, "");
                player2Hand = player2Hand.replaceFirst(removedCard, "");
                i -= 1;
            }
        }

        System.out.println("\nPairs are removed." +
                           "\nPlayer-1 Hand: " + player1Hand +
                           "\nPlayer-2 Hand: " + player2Hand);

        boolean gameOver = false;
        int turn = player1HasMoreCards ? 2 : 1;
        int winner = -1;

        //actual game
        do{
            // checks if game is over
            if (player1Hand.isEmpty())
            {
                winner = 1;
                gameOver = true;
            }
            if (player2Hand.isEmpty())
            {
                winner = 2;
                gameOver = true;
            }

            if(!gameOver)
            {
                // drawing from each other
                System.out.println("\nStart Drawing...");
                if (turn == 1)
                {
                    String drawedCard = Character.toString(player2Hand.charAt(rand.nextInt(player2Hand.length())));
                    player1Hand = player1Hand.concat(drawedCard);
                    player2Hand = player2Hand.replaceFirst(drawedCard, "");
                    System.out.printf("Player-1 is drawing the card: %s from Player-2...", drawedCard);
                    System.out.println("\n\tPlayer-1 Hand: " + player1Hand +
                                    "\n\tPlayer-2 Hand: " + player2Hand);
                    turn = 2;
                }
                else
                {
                    String drawedCard = Character.toString(player1Hand.charAt(rand.nextInt(player1Hand.length())));
                    player2Hand = player2Hand.concat(drawedCard);
                    player1Hand = player1Hand.replaceFirst(drawedCard, "");
                    System.out.printf("Player-2 is drawing the card: %s from Player-1...", drawedCard);
                    System.out.println("\n\tPlayer-1 Hand: " + player1Hand +
                                    "\n\tPlayer-2 Hand: " + player2Hand);
                    turn = 1;
                }


                // removing pairs (same as before)
                for (int i = player1Hand.length() - 1; i > 0;i--)
                {
                if (player1Hand.substring(0, i).contains(Character.toString(player1Hand.charAt(i))))
                {
                    String removedCard = Character.toString(player1Hand.charAt(i));
                    player1Hand = player1Hand.replaceFirst(removedCard, "");
                    player1Hand = player1Hand.replaceFirst(removedCard, "");
                    i -= 1;
                }
                }
                for (int i = player2Hand.length() - 1; i > 0;i--)
                {
                    if (player2Hand.substring(0, i).contains(Character.toString(player2Hand.charAt(i))))
                    {
                        String removedCard = Character.toString(player2Hand.charAt(i));
                        player2Hand = player2Hand.replaceFirst(removedCard, "");
                        player2Hand = player2Hand.replaceFirst(removedCard, "");
                        i -= 1;
                    }
                }

                System.out.println("\nPairs are removed." +
                            "\nPlayer-1 Hand: " + player1Hand +
                            "\nPlayer-2 Hand: " + player2Hand);
            }
            
        }
        while(!gameOver);

        // printing winner
        System.out.printf("\nGame Over!\nPlayer-%d Wins!\n\tPlayer-1 hand :%s\n\tPlayer-2 hand :%s\n\n", winner, player1Hand, player2Hand);
    }
}