package by.it_academy.lesson8.taskFirst;

public abstract class Animals {

    private final String animal;

    protected Animals(String animal) {
        this.animal = animal;
    }

    public String animal() {
        return animal;
    }

    public void sleep() {
        System.out.println(animal() + " sleep");
    }
}
