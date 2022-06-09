package ch_07;

public class Ex7_13 {
    class InstanceInner {

    }
    static class StaticInner {}

    InstanceInner iv = new InstanceInner();
    static StaticInner cv = new StaticInner();

    static void staticMethod() {
        // InstanceInner obj1 = new InstanceInner(); - 접근 불가
        StaticInner obj2 = new StaticInner();   

        // 굳이굳이 접근하려면... 근데 굳이 이렇게는 안함
        Ex7_13 outer = new Ex7_13();
        InstanceInner obj1 = outer.new InstanceInner();
    }

    void instanceMethod() {
        InstanceInner obj1 = new InstanceInner();
        StaticInner obj2 = new StaticInner();
    }

    void myMethod() {
        class LocalInner {}
        LocalInner lv = new LocalInner();
    }
}
