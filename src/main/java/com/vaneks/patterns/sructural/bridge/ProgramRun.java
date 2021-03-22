package main.java.com.vaneks.patterns.sructural.bridge;

public class ProgramRun {
    public static void main(String[] args) {
        RemoteControl[] remotes = {new TVRemoteControl(new TVDevice(4)),
                new RadioRemoteControl(new RadioDevice(9)),
        new UniversalRemoteControl(new TVDevice(20))};
        for(RemoteControl remote: remotes) {
            remote.deviceRun();
        }
    }
}
