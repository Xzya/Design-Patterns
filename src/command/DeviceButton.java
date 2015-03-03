package command;

public class DeviceButton {

    Command theCommand;

    public DeviceButton(Command _newCommand) {
        theCommand = _newCommand;
    }

    public void press() {
        theCommand.execute();
    }

    public void pressUndo() {
        theCommand.undo();
    }

}
