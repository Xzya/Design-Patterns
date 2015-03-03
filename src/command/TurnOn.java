package command;

public class TurnOn implements ICommand {

    IElectronicDevice theDevice;

    public TurnOn(IElectronicDevice _theDevice) {
        theDevice = _theDevice;
    }

    @Override
    public void execute() {
        theDevice.on();
    }

    @Override
    public void undo() {
        theDevice.off();
    }

}
