package command;

public class Remote {

    private IElectronicDevice theDevice;

    public DeviceButton turnOn;
    public DeviceButton turnOff;
    public DeviceButton volumeUp;
    public DeviceButton volumeDown;

    public Remote(IElectronicDevice _theDevice) {
        theDevice = _theDevice;

        turnOn = new DeviceButton(new TurnOn(theDevice));
        turnOff = new DeviceButton(new TurnOff(theDevice));
        volumeUp = new DeviceButton(new VolumeUp(theDevice));
        volumeDown = new DeviceButton(new VolumeDown(theDevice));
    }
}
