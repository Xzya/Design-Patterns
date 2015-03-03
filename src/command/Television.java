package command;

public class Television implements ElectronicDevice {

    private boolean isOn = false;
    private int volume = 0;
    private final int minVolume = 0;
    private final int maxVolume = 10;

    @Override
    public String isOn() {
        return isOn ? "On" : "Off";
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void on() {
        if (!isOn) {
            isOn = true;
            System.out.println("TV is On");
        }
    }

    @Override
    public void off() {
        if (isOn) {
            isOn = false;
            System.out.println("TV is Off");
        }
    }

    @Override
    public void volumeUp() {
        if (volume < maxVolume) {
            volume++;
        }
        System.out.println("TV Volume is at: " + volume);
    }

    @Override
    public void volumeDown() {
        if (volume > minVolume) {
            volume--;
        }
        System.out.println("TV Volume is at: " + volume);
    }
}
