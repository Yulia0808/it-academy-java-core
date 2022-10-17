package by.it_academy.lesson8.taskFirst;

public class AnimalHouse<T extends Animals> {

    private T someAnimal;

    public T getSomeAnimal() {
        return someAnimal; //получает животное //возвращает т
    }


    public void setSomeAnimal(T someAnimal) {
        this.someAnimal = someAnimal;  //сохраняет животное // принимает т
    }
}
