package by.it_academy.lesson13.task1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class First {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Imput a number: ");
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            if (num == -1) {
                break;
            }
            list.add(num);

        }
        List<Integer> numbersList = list.stream()
                .filter(number -> number >= 1 && number <= 5)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(numbersList);

        scanner.close();
    }
}

