package exercise1;

import java.util.Random;
import java.util.Scanner;

public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];
        
        Random random = new Random();
        
        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            //card.setValue(insert call to random number generator here)
            card.setValue(random.nextInt(13) + 1);
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            card.setSuit(card.SUITS[random.nextInt(4)]);
            hand[i]=card;
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
        }

        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
           Scanner scanner = new Scanner(System.in);
          System.out.print("Pick a card value (1-13): ");
           int userValue = scanner.nextInt();
           System.out.print("Pick a card suit (Hearts, Diamonds, Clubs, Spades): ");
            String userSuit = scanner.next();
        
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
            Card userCard = new Card();
             userCard.setValue(userValue);
             userCard.setSuit(userSuit);
           
             boolean found = false;
             for (Card card : hand) {
            if (card.equals(userCard)) {
                found = true;
                break;
            }
        }
        
        
        // If the guess is successful, invoke the printInfo() method below.
             if (found) {
            //System.out.println("Your card is in the hand.");
            printInfo();
        } else {
            System.out.println("Your card is not in the hand.");
        }
    }

        
    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
        private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Melannie, but you can call me Melai");
        System.out.println();
        
        System.out.println("My career ambitions: To be a programmer");
        System.out.println("Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("Watching movies/series");
        System.out.println("Browsing in internet");
        System.out.println("I like eating);
      
        System.out.println();
          
    
    }

}
