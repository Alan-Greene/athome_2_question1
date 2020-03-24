package lab2_question1;

public class TestDeck {

    public static void main(String[] args) {
        Deck deck1 = new Deck(52);

        deck1.print_deck();

        Card card1, card2;

        card1 = deck1.deal_card();
        card2 = deck1.deal_card();

        if (deck1.compare_cards(card1, card2) == 1){
            card1.print_card();
            System.out.println("is higher than");
            card2.print_card();
        } else if (deck1.compare_cards(card1, card2) == -1){
            card2.print_card();
            System.out.println("is higher than");
            card1.print_card();
        } else {
            card1.print_card();
            System.out.println("is equal to");
            card2.print_card();
        }
    }
}
