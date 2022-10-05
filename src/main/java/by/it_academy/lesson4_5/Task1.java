package by.it_academy.lesson4_5;

public class Task1 {
    public static void main(String[] args) {

        int[] array = {5, 1, 3, 4, 2};
        int sum = 0;

        for (int i : array) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}


