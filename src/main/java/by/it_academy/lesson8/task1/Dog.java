package by.it_academy.lesson8.task1;

public class Dog extends Animal {
    public Dog(String nameDog) {
        super(nameDog);
    }

    public void drink() {
        System.out.println(name() + " drink");

    }
}
