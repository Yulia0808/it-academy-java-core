package by.it_academy.lesson8.task2;


public class Card {
    private final Suit suit;
    private final int cost;

    public Card(Suit suit, int cost) {
        this.suit = suit;
        this.cost = cost;
    }

    @Override
    public String toString() {

        return suit.toString() + " " + getValue();

    }

    private String getValue() {
        if (cost < 11) {
            return String.valueOf(cost);
        }
        switch (cost) {
            case 11:
                return "J";
            case 12:
                return "Q";
            case 13:
                return "K";
            case 14:
                return "A";
            default:
                return "";
        }
    }
}