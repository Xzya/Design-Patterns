package command;

public class DeviceButton {

    ICommand theCommand;

    public DeviceButton(ICommand _newCommand) {
        theCommand = _newCommand;
    }

    public void press() {
        theCommand.execute();
    }

    public void pressUndo() {
        theCommand.undo();
    }

}
