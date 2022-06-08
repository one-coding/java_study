package ch_07;

/**
 * Tv
 */
class Tv_7 {
    boolean power;
    int channel;

    void power() { power = !power; }
    void channelUp() {
        ++channel;
    }
    void channelDown() {
        --channel;
    }
    
}

/**
 * InnerEx7_1
 */
class SmartTv extends Tv_7 {
    boolean caption;
    void displayCaption(String text) {
        if(caption) {
            System.out.println(text);
        }
    }
    
}

public class Ex7_1 {
    public static void main(String[] args) {  
        SmartTv stv = new SmartTv();

        stv.channel = 10;
        stv.channelUp();    
        System.out.println(stv.channel);
    }
    
}
