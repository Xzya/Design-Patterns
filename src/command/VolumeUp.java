package command;

public class VolumeUp implements ICommand {

    IElectronicDevice theDevice;

    public VolumeUp(IElectronicDevice _theDevice) {
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
