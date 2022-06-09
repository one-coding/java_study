package ch_07;
class MyTv {
   private boolean isPowerOn;
   private int channel;
   private int volume;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        if (MIN_CHANNEL > channel || channel > MAX_CHANNEL) {
            return;
        }
        this.channel = channel;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (MIN_VOLUME > volume || volume > MAX_VOLUME) {
        return;
        }
        this.volume = volume;
    }

}

public class Exercise7_3 {
    public static void main(String[] args) {
        MyTv tv = new MyTv();

        tv.setChannel(10);
        System.out.println(tv.getChannel());
        tv.setVolume(20);
        System.out.println(tv.getVolume());
    }    
}
