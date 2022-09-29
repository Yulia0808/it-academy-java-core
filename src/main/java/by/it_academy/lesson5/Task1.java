package by.it_academy.lesson5;

public class Task1 {

    public static void main(String[] args) {
        Whistle whistleSound = new Whistle("aaaaaaaaaaaaaa");
        whistleSound.sound();
    }
}

class Whistle {
    private final String sound;

    Whistle(String whistleSound) {

        this.sound = whistleSound;
    }

    void sound() {

        System.out.println("Sound " + sound);
    }

}



