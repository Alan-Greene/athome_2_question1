package lab2_question1;

import java.util.Random;

public class Deck {
    private Card[] cards;

    public Deck(int value){
        cards = new Card[value];

        int index = 0;

        for (int suit = 0; suit <= 3; suit++){
            for (int rank = 1; rank <= 13; rank++){
                cards[index] = new Card(rank, suit);
                index++;
            }
        }
    }

    public void print_deck(){
        for (Card card : cards) {
            card.print_card();
        }
        System.out.println();
    }

    public Card deal_card(){
        Random rand = new Random();
        int suit = rand.nextInt(4);
        int rank = rand.nextInt(14);
        while (rank == 0){
            rank = rand.nextInt(14);
        }

        return new Card(rank, suit);
    }

    public int compare_cards(Card card1, Card card2){
        if (card1.getSuit() > card2.getSuit()){
            return 1;
        } else if (card1.getSuit() < card2.getSuit()){
            return -1;
        } else if (card1.getRank() > card2.getRank()){
            return 1;
        } else if (card1.getRank() < card2.getRank()){
            return -1;
        } else {
            return 0;
        }
    }

}
