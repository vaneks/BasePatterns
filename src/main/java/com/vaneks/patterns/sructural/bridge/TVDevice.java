package main.java.com.vaneks.patterns.sructural.bridge;

public class TVDevice implements Device{
    private int volume;

    public TVDevice(int volume) {
        this.volume = volume;
    }

    @Override
    public void isEnabled() {
        System.out.println("TV is Enabled");
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
