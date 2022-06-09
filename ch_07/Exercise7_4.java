package ch_07;
class MyTv2 {
   private boolean isPowerOn;
   private int channel;
   private int preChannel;
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
        preChannel = this.channel;
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

   public void gotoPrevCahnnel() {
        setChannel(preChannel);
    //    int tmp = this.channel;
    //    this.channel = preChannel;
    //    preChannel = tmp;
    
   }

}

public class Exercise7_4 {
    public static void main(String[] args) {
        MyTv2 tv = new MyTv2();

        tv.setChannel(10);
        System.out.println(tv.getChannel());
        tv.setChannel(20);
        System.out.println(tv.getChannel());
        tv.gotoPrevCahnnel();
        System.out.println(tv.getChannel());
        tv.gotoPrevCahnnel();
        System.out.println(tv.getChannel());
    }    
}
