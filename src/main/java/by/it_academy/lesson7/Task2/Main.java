package by.it_academy.lesson7.Task2;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter(7);
        System.out.println(counter.value());
        counter.increase();
        counter.decrease();
        counter.increase(1);
        counter.decrease(2);


        Counter2 counter2 = new Counter2(0);
        System.out.println(counter2.value());
        counter2.increase();
        counter2.decrease();
        counter2.increase(4);
        counter2.decrease(3);
    }
}
