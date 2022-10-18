package by.it_academy.lesson8.task1;

public abstract class Animal {

    private final String animal;

    protected Animal(String animal) {
        this.animal = animal;
    }

    public String animal() {
        return animal;
    }

    public void sleep() {
        System.out.println(animal() + " sleep");
    }
}
