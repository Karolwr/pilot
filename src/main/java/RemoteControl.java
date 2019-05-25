import java.util.List;

public class RemoteControl {
    private static final int DLUGOSC = 15;
    private static final int SZEROKOSC = 6;
    private static final double GRUBOSC = 2.5;

    private static final List<String> BUTTONS = List.of("1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "Power", "VolumeUp", "VolumeDown", "NextChannel", "PreviousChannel");
    private final String color;

    private int currentVolume;
    private int currentChannel;

    public RemoteControl(String color) {

        this.color = color;
    }

    public void volumeUp() {
        currentVolume++;
    }

    public void volumeDown() {
        currentVolume--;
    }

    public void nextChannel() {
        currentChannel++;
    }

    public void previousChannel() {
        currentChannel--;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public String getColor() {
        return color;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void setCurrentChannel(int currentChannel) {
        this.currentChannel = currentChannel;
    }
}
