package by.it_academy.lesson3;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {

        int giftValue = 500087;

        if (giftValue < 5000) {
            System.out.println("Tax amount = " + 0);
        }

        else if (giftValue >= 5000 && giftValue <= 25000) {
            System.out.println("Tax amount = " + 100);
        }

        else if (giftValue > 25000) {
            double greatGiftValue = 100 + (giftValue - 5000) * 0.08;

            System.out.println("Tax amount = " + greatGiftValue);
        }
    }
}