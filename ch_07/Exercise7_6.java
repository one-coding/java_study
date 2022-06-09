package ch_07;

class Outer { // 외부 클래스
    static class Inner { // 내부 클래스(인스턴스 클래스)
        int iv=100; 
    }
}

class Exercise7_6{
    public static void main(String[] args) {
        Outer.Inner ii = new Outer.Inner();
        System.out.println(ii.iv);
        // Outer o = new Outer();
        // Outer.Inner22 ii = o.new Inner22();
        // System.out.println(ii.iv);
    }    
}

