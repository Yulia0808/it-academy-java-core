package by.it_academy.lesson7.Task1;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String name() {
        return name;
    }

    void eat() {
        System.out.println(name + " eats");
    }

    void sleep() {
        System.out.println(name + " sleeps");
    }

}
