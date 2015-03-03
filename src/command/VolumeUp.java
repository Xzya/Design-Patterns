package command;

public class VolumeUp implements Command {

    ElectronicDevice theDevice;

    public VolumeUp(ElectronicDevice _theDevice) {
        theDevice = _theDevice;
    }

    @Override
    public void execute() {
        theDevice.volumeUp();
    }

    @Override
    public void undo() {
        theDevice.volumeDown();
    }

}
