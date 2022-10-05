package by.it_academy.lesson7.Task2;

public class Main {
    public static void main(String[] args) {
        Counter firstCounter = new Counter();
        Counter secondCounter = new Counter(5);

        System.out.println("counter: " + firstCounter.getValue());
        firstCounter.increase();
        System.out.println("counter increase: value = " + firstCounter.getValue());
        firstCounter.decrease();
        System.out.println("counter decrease : value = " + firstCounter.getValue());
        firstCounter.increase(10);
        System.out.println("counter increase by value: value = " + firstCounter.getValue());
        firstCounter.decrease(2);
        System.out.println("counter decrease : value = " + firstCounter.getValue());

        System.out.println("second counter: " + secondCounter.getValue());
        secondCounter.increase();
        System.out.println("second counter increase: value = " + secondCounter.getValue());
        secondCounter.decrease();
        System.out.println("second counter decrease : value = " + secondCounter.getValue());
        secondCounter.increase(10);
        System.out.println("second counter increase by value: value = " + secondCounter.getValue());
        secondCounter.decrease(2);
        System.out.println("second counter decrease : value = " + secondCounter.getValue());
    }
}
