package by.it_academy.lesson6;

public class Whistle {

    private final String sound;

    Whistle(String whistleSound) {
        this.sound = whistleSound;
    }

    void sound() {
        System.out.println("Sound " + sound);
    }

    public static void main(String[] args) {
        Whistle whistleSound = new Whistle("aaaaaaaaaaaaaaa");
        whistleSound.sound();
    }
}



