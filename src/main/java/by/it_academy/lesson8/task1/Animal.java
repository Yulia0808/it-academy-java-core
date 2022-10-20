package by.it_academy.lesson8.task1;

public abstract class Animal {

    private final String name;

    protected Animal(String name) {
        this.name = name;
    }

    public String name() {
        return name;
    }

    public void sleep() {
        System.out.println(name() + " sleep");
    }
}
