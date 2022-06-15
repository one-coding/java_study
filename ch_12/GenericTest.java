import java.util.ArrayList;

// class Tv {}

// class Audio{}

public class GenericTest {
    public static void main(String[] args) {
        ArrayList<Tv> list = new ArrayList<Tv>();
        list.add(new Tv());
        // list.add(new Audio());

        Tv t = list.get(0);
        

        System.out.println(t);
    }


}
