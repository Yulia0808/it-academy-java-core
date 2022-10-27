package by.it_academy.lesson10.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        {
            list.add("string the first");
            list.add("2");
            list.add("string the third");
            list.add("4");
            list.add("string fifth");

            for (String item : list) {
                try {
                    System.out.println(Integer.parseInt(item));
                } catch (NumberFormatException e) {
                    System.out.println(item + " is not a number");
                }

            }
        }
    }
}
