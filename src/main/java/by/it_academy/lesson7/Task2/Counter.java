package by.it_academy.lesson7.Task2;

public class Counter {

    private int value;

    public Counter(int startValue) {

        value = startValue;
    }

    public Counter() {
        this.value = 0;
    }

    public int value() {
        return value;
    }

    public void increase() {
        value = value + 1;

    }

    public void decrease() {
        value = value - 1;
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

    public void setValue(int value) {
        this.value = value;
    }
}