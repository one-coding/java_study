
import java.util.ArrayList;

class Fruit implements Eatable {
    @Override
    public String toString() {
        return "Fruit";
    }
}

class Apple extends Fruit {
        @Override
    public String toString() {
        return "Apple";
    }
}
class Grape extends Fruit {
        @Override
    public String toString() {
        return "Grape";
    }
}

class Toy  {
    @Override
    public String toString() {
        return "Toy";
    }
}

interface Eatable {}




public class Ex12_3 {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
        FruitBox<Apple> appleBox = new FruitBox<Apple>();
        FruitBox<Grape> grapeBox = new FruitBox<Grape>();


        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());
        fruitBox.add(new Grape());

        appleBox.add(new Apple());
        grapeBox.add(new Grape());

        System.out.println(fruitBox);
        System.out.println(appleBox);
        System.out.println(grapeBox);
    }
}

class FruitBox<T extends Fruit & Eatable> extends Box<T> {

}


class Box<T> {
    ArrayList<T> list = new ArrayList<>();

    void add(T item) {list.add(item);}
    T get(int i) {return list.get(i);}
    int size() {return list.size();}
    @Override
    public String toString() {
        return list.toString();
    }
}
