class Parent {
    void parentMethod() {

    }
}

class Child extends Parent {
    @Override
    @Deprecated
    void parentMethod() {
        System.out.println("hello-world");
    }
}

public class Ex12_7 {
    public static void main(String[] args) {

        Child c = new Child();
        c.parentMethod();
    }    
}
