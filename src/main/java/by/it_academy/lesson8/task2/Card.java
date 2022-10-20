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
        return switch (cost) {
            case 11 -> "J";
            case 12 -> "Q";
            case 13 -> "K";
            case 14 -> "A";
            default -> "";
        };
    }
}