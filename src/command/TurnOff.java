package command;

public class TurnOff implements ICommand{

    IElectronicDevice theDevice;

    public TurnOff(IElectronicDevice _theDevice) {
        theDevice = _theDevice;
    }

    @Override
    public void execute() {
        theDevice.off();
    }

    @Override
    public void undo() {
        theDevice.on();
    }

}
