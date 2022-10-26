package by.it_academy.lesson9.task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        {
            numbers.add(6);
            numbers.add(3);
            numbers.add(5);
            numbers.add(1);
            numbers.add(2);
            numbers.add(8);
            System.out.println(average(numbers));
            average(numbers);
            printInRange(numbers, 1, 3);
        }
    }

    private static double average(List<Integer> numbers) {
        double sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        return sum / numbers.size();
    }

    private static void printInRange(List<Integer> numbers, int lowerLimit, int upperLimit) {
        for (int i = 0; i < numbers.size(); i++) {
            if (i >= lowerLimit && i <= upperLimit)
                System.out.print(numbers.get(i) + " ");

        }
    }
}










