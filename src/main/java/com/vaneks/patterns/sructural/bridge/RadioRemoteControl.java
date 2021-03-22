package main.java.com.vaneks.patterns.sructural.bridge;

public class RadioRemoteControl extends RemoteControl {
    public RadioRemoteControl(Device device) {
        super(device);
    }

    @Override
    public void deviceRun() {
        System.out.println("The remote turns on the Radio");
        device.isEnabled();
        System.out.println("Volume is - " + device.getVolume());
    }
}
