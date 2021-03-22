package main.java.com.vaneks.patterns.sructural.bridge;

public class RadioDevice implements Device{
    private int volume;

    public RadioDevice(int volume) {
        this.volume = volume;
    }

    @Override
    public void isEnabled() {
        System.out.println("Radio is Enable");
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
    }
}
