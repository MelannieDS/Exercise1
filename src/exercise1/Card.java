package exercise1;

import java.util.Random;

public class Card {

  // private String suit; //clubs, spades, diamonds, hearts
   //private int value;//1-13

   private static final String [] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};
   private static final String [] RANK ={"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};   
   private static final int Num_Cards=7;
   
   private String[][] cards;
   
   public Card(){
       generateCards();
   }
   
public void generateCards(){
        Random random = new Random();
        cards=new String[Num_Cards][2];
        for(int i=0; i<Num_Cards; i++){
            
        }
}
}
   