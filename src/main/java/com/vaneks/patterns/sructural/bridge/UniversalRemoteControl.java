package main.java.com.vaneks.patterns.sructural.bridge;

public class UniversalRemoteControl extends RemoteControl {
    protected UniversalRemoteControl(Device device) {
        super(device);
    }

    @Override
    public void deviceRun() {
        System.out.println("The remote turns on this device");
        device.isEnabled();
        System.out.println("Volume is - " + device.getVolume());
    }
}
