package by.it_academy.lesson4;

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


//version2

/*public class Task2 {
    public static void main(String[] args) {

int[] array = {5, 1, 3, 4, 2};

int sum = 0;

for (int i = 0; i < array.length; i++) {
sum += array[i];

}
System.out.println(sum);
}
}*/