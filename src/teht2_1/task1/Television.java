package teht2_1.task1;

public class Television {
    private int channel = 1;
    private boolean on = false;

    public void setChannel(int channel) {
        this.channel = channel;
    }


    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }

    public int getChannel() {
        return channel;
    }

    public boolean isOn() {
        return on;
    }
}
