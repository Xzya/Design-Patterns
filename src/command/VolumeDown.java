package command;

public class VolumeDown implements Command{

    ElectronicDevice theDevice;

    public VolumeDown(ElectronicDevice _theDevice) {
        theDevice = _theDevice;
    }

    @Override
    public void execute() {
        theDevice.volumeDown();
    }

    @Override
    public void undo() {
        theDevice.volumeUp();
    }

}
