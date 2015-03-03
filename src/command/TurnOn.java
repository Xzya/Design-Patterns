package command;

public class TurnOn implements Command {

    ElectronicDevice theDevice;

    public TurnOn(ElectronicDevice _theDevice) {
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
