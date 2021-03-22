package main.java.com.vaneks.patterns.sructural.bridge;

public abstract class RemoteControl {
    protected Device device;

    protected RemoteControl(Device device) {
        this.device = device;
    }
    public abstract void deviceRun();
}
