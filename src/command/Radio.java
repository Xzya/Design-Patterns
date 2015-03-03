package command;

public class Radio implements IElectronicDevice {

    private boolean isOn = false;
    private int volume = 0;
    private final int minVolume = 0;
    private final int maxVolume = 10;

    public boolean isOn() {
        return isOn;
    }
    
    public int getVolume() {
        return volume;
    }
    
    @Override
    public void on() {
        if (!isOn) {
            isOn = true;
            System.out.println("Radio is On");
        }
    }

    @Override
    public void off() {
        if (isOn) {
            isOn = false;
            System.out.println("Radio is Off");
        }
    }

    @Override
    public void volumeUp() {
        if (volume < maxVolume) {
            volume++;
        }
        System.out.println("Radio Volume is at: " + volume);
    }

    @Override
    public void volumeDown() {
        if (volume > minVolume) {
            volume--;
        }
        System.out.println("Radio Volume is at: " + volume);
    }

}
