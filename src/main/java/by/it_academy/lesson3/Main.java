package by.it_academy.lesson3;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {

        int giftValue = 10000;
        double tax = 0;

        if (giftValue < 5000) {
            tax = 0;

        } else if (giftValue >= 5000 && giftValue <= 25000) {
            tax = (100 + (giftValue - 5000) * 0.08);

        } else if (giftValue > 25000) {
            tax = (1700 + (giftValue - 25000) * 0.1);
        }
        System.out.println("Tax anount is "+ tax);
    }
}