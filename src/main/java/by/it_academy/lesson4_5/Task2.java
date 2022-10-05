package by.it_academy.lesson4_5;

public class Task2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 8};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            var stars = "*".repeat(array[i]);
            System.out.println(stars);
        }

    }
}