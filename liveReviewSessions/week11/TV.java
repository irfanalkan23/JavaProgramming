package week11;

public class TV {
    // data fields + attributes
    public int channel = 1;  // default channel is 1
    public int volumeLevel = 1;
    public boolean on = false;     // TV is off by default

    public TV() {
        // default constructor. constructor w no parameters
    }

    public TV(int channel, int volumeLevel, boolean on) {
        this.channel = channel;
        this.volumeLevel = volumeLevel;
        this.on = on;
    }

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }

    public void setChannel(int newChannel) {
        if(on && newChannel >= 1 && newChannel <=120) {
            channel = newChannel;
        }
    }

    public void setVolume(int newVolume) {
        if(on && newVolume >= 1 && newVolume <= 7) {
            volumeLevel = newVolume;
        }
    }

    public void channelUp() {
        if(on && channel < 120) {
            channel++;
        }
    }

    public void channelDown() {
        if(on && channel < 120) {
            channel--;
        }
    }

    public void volumeUp() {
        if(on && volumeLevel < 7) {
            volumeLevel++;
        }
    }

    public void volumeDown() {
        if(on && volumeLevel > 1) {
            volumeLevel--;
        }
    }

    public String toString() {
        return "TV{" +
                "channel=" + channel +
                ", volumeLevel=" + volumeLevel +
                ", on=" + on +
                '}';
    }
}
