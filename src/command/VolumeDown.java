package command;

public class VolumeDown implements ICommand{

    IElectronicDevice theDevice;

    public VolumeDown(IElectronicDevice _theDevice) {
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
