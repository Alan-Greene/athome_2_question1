package lab2_question1;

public class Card {
    private int rank;
    private int suit;

    public Card(){
        this.rank = 0;
        this.suit = 0;
    }

    public Card(int rank, int suit){
        this.rank = rank;
        this.suit = suit;
    }

    public void print_card(){
        String[] suits = {"clubs", "diamonds", "hearts", "spades"};
        String[] ranks = {"null", "ace", "two", "three", "four", "five", "six",
                        "seven", "eight","nine", "ten", "jack", "queen", "king"};

        System.out.printf("The %s of %s%n", ranks[rank], suits[suit]);
    }

    public int getRank() {
        return rank;
    }

    public int getSuit() {
        return suit;
    }
}
