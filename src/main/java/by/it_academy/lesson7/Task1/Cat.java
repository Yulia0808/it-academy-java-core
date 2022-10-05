package by.it_academy.lesson7.Task1;


public class Cat extends Animal implements NoiseCapable{

    public Cat(String name) {
        super(name);
    }

    public Cat() {
        super(" ");
    }

    void purr() {
        System.out.println(name() + " purrs");
    }

    public void makeNoise() {
        purr();
    }
}

