package ch_07;

abstract class Player { // 추상 클래스 (미완성 클래스)
    abstract void play(int pos); // 추상 메서드 (미완성 메서드)
    abstract void stop(); // 선언부만 있고 구현부 {}가 없는 메서드
}

class AudioPlayer extends Player {
    void play(int pos) {
        System.out.println(pos + "위치부터 play합니다");
    }
    void stop() {
        System.out.println("재생을 멈춥니다");
    } 
}

public class PlayerTest2 {
    public static void main(String[] args) {
        AudioPlayer ap = new AudioPlayer();

        ap.play(100);
        ap.stop();
    }
}
