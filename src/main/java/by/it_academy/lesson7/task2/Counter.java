package by.it_academy.lesson7.task2;

public class Counter {

    private int value;

    public Counter(int startValue) {

        value = startValue;
    }

    public Counter() {
       this(0);
    }


    public void increase() {
        increase(1);

    }

    public void decrease() {
        decrease(1);
    }

    public void increase(int increaseBy) {
        value = value + increaseBy;
    }

    public void decrease(int decreaseBy) {
        value = value - decreaseBy;
    }

    public int getValue() {
        return value;
    }

}