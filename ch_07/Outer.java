package ch_07;

public class Outer {
    private int outerIv = 0;
    private static int outerCv = 0;

    class InstanceInner {
        int iiv = outerIv; // 내부 클래스에서 private 멤버를 가져올 수 있다
        int iiv2 = outerCv;
    }

    static class StaticInner {
        static int scv = outerCv;
    }

    void myMethod() {
        final int lv = 0;
        final int LV = 0;

        class LocalInner { // 지역 내부 클래스
            int liv = outerIv;
            int liv2 = outerCv;

            // 외부 클래스의 지역변수는 final이 붙은 상수만 접근 가능하다
            int liv3 = lv;
            int liv4 = LV;
        }
    }

}
