package by.it_academy.lesson13.task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Second {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Imput a number: ");
        int scan = scanner.nextInt();

        List<Integer> numbersList = new ArrayList<>();

        for (int i = 2; i <= scan; i++) {
            numbersList.add(i);
        }
        List<Integer> simpleNum = numbersList.stream()
                .filter(Second::primeNumber)
                .collect(Collectors.toList());

        System.out.println(simpleNum);
        scanner.close();
    }

    public static boolean primeNumber(int number) {
        return IntStream.rangeClosed(2, number / 2)
                .noneMatch(i -> number % i == 0);
    }
}


