package command;

public interface IElectronicDevice {

    public void on();
    public void off();
    public void volumeUp();
    public void volumeDown();

    public boolean isOn();
    public int getVolume();

}
