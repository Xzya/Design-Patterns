package command;

public class TurnOff implements Command{

    ElectronicDevice theDevice;

    public TurnOff(ElectronicDevice _theDevice) {
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
