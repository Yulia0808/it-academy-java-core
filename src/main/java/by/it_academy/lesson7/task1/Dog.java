package by.it_academy.lesson7.task1;



public class Dog extends Animal implements NoiseCapable {
    public Dog(String name) {
        super(name);
    }

    public Dog() {
        super("Dog");
    }

    void bark() {
        System.out.println(name() + " barks");
    }

    public void makeNoise() {
        bark();
    }

}