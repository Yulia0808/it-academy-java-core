package by.it_academy.lesson6;

public class Task2 {
    public static void main(String[] args) {

        String[] list = new String[]{"Sebastian,2015", "Lucas,2017"};
        String longestName = " ";
        double sum = 0;
        for (final String item : list) {
            String[] nameAndYear = item.split(",");
            String name = nameAndYear[0];
            int year = Integer.parseInt(nameAndYear[1]);
            if (longestName.length() < name.length()) {
                longestName = name;

            }
            sum += year;
        }
        System.out.println(longestName);
        System.out.println(sum / list.length);
    }
}


