package by.it_academy.lesson10.task2;

public class SomeSensor implements Sensor {
    private boolean isOn = false;

    @Override
    public boolean isOn() {
        return isOn;
    }

    @Override
    public void setOn() {
        isOn = true;
    }

    @Override
    public void setOff() {
        isOn = false;
    }

    @Override
    public int read() {
        if (!isOn) {
            throw new IllegalStateException();
        }
        return 42;
    }
}
