package by.it_academy.lesson6;

public class Task1 {
    public static void main(String[] args) {
        String str = "some string";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            stringBuilder.append(str.charAt(i));
        }
        System.out.println(stringBuilder);

    }
}
