package by.it_academy.lesson7.Task2;

public class Counter {

    private int value;

    Counter(int startValue) {
        this.value = startValue;  //устанавливает начальное значение value на starValue
    }

    int value() {
        return value;
    }           //текущее значение счетчика currentValue

    void increase() {
        value++;
        System.out.println(value);
    }         //увеличивает значение на 1

    void decrease() {
        value--;
        System.out.println(value);
    }        // уменьшает значение на 1

    void increase(int increaseBy) {
        value += increaseBy;
        System.out.println(value);
    }          // увеличивает на указанное значение

    void decrease(int decreaseBy) {
        value -= decreaseBy;
        System.out.println(value);
    }          // уменьшвет на указанное значение
}
//нужно переиспользовать методы для уменьшения дублирования кода