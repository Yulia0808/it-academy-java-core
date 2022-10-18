package by.it_academy.lesson8.task1;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik");
        cat.eat();
        cat.sleep();
        Dog dog = new Dog("Bobik");
        dog.drink();
        dog.sleep();

        AnimalHouse<Cat> catHouse = new AnimalHouse<>();
        catHouse.setAnimal(cat);
        Cat cat1 = catHouse.getAnimal();

        AnimalHouse<Dog> dogHouse = new AnimalHouse<>();
        dogHouse.setAnimal(dog);

    }

}
