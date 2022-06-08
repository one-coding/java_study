package ch_06;


/**
 * InnerEx6_09
 */
class MyMath {
    long a, b;

    long add() {return a + b;}
    long substract() {return a - b;}
    long multiply() {return a * b;}
    double divide() {return a / (double)b;}

    static long add(long a, long b) {return a + b;}
    static long substract(long a, long b) {return a - b;}
    static long multiply(long a, long b) {return a * b;}
    static double divide(long a, long b) {return a / (double)b;}

    
}

/**
 * Ex6_09
 */

public class Ex6_09 {
public static void main(String[] args) {
    System.out.println(MyMath.add(200l, 100l));
    System.out.println(MyMath.substract(200L, 100l));
    System.out.println(MyMath.multiply(200L, 100L));
    System.out.println(MyMath.divide(200l, 50l));

    MyMath mm = new MyMath();

    mm.a = 500L;
    mm.b = 100L;

    System.out.println(mm.add());
    System.out.println(mm.substract());
    System.out.println(mm.multiply());
    System.out.println(mm.divide());
}
    
}


