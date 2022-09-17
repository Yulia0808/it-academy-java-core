package by.it_academy.lesson3;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {

        int giftValue = 2510860;
        double greatGift = 100 + (giftValue - 5000) * 0.08;
        double veryGreatGift = 1700 + (giftValue - 25000) * 0.1;

        if (giftValue < 5000) {
            System.out.println("Tax amount = " + 0);

        } else if (giftValue >= 5000 && giftValue <= 25000) {
            System.out.println("Tax amount = " + greatGift);

        } else if (giftValue > 25000) {
            System.out.println("Tax amount = " + veryGreatGift);
        }
    }
}