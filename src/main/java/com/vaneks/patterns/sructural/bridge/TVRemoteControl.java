package main.java.com.vaneks.patterns.sructural.bridge;

public class TVRemoteControl extends RemoteControl {
    public TVRemoteControl(Device device) {
        super(device);
    }

    @Override
    public void deviceRun() {
        System.out.println("The remote turns on the TV");
        device.isEnabled();
        System.out.println("Volume is - " + device.getVolume());
    }
}
