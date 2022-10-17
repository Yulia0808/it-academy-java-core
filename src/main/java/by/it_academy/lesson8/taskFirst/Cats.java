package by.it_academy.lesson8.taskFirst;

import javax.xml.namespace.QName;

public class Cats extends Animals {

    public Cats(String nameCat) {
        super(nameCat);
    }

    public void eat() {
        System.out.println(animal() + " cat eat");

    }

}
