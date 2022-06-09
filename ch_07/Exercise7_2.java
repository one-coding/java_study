package ch_07;

class Product44 {
    int price;
    int bounsPoint;
    
    Product44(){}

    Product44(int price) {
        this.price = price;
        this.bounsPoint = (int) (price / 10.0);
    }
}

class Tv extends Product44 {
    Tv() {
        
    }

    @Override
    public String toString() {
        return "Tv";
    }
}

public class Exercise7_2 {
    public static void main(String[] args) {
        Tv t = new Tv();
        System.out.println(t);
    }
}