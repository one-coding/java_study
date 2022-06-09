package ch_07;

class OuterIns {
    int value = 10;

    class InnerIns {
        int value = 20;
        void method1() {
            int value = 30; 

            System.out.println(value);
            System.out.println(this.value);
            System.out.println(OuterIns.this.value);
        }
    }
}

public class Exercise7_8 {
    public static void main(String[] args) {
            OuterIns o = new OuterIns();
            OuterIns.InnerIns inner = o.new InnerIns();
            inner.method1();
    }
}