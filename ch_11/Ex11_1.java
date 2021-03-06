import java.util.ArrayList;
import java.util.Collections;

public class Ex11_1 {
    public static void main(String[] args) {
        // 기본 길이 (용량, capacity)가 10인 ArrayList를 생성
        ArrayList list1 = new ArrayList(10);
        list1.add(new Integer(5));
        list1.add(new Integer(4));
        list1.add(new Integer(2));
        list1.add(new Integer(0));
        list1.add(new Integer(1));
        list1.add(new Integer(3));


        ArrayList list2 = new ArrayList(list1.subList(1, 4));
        print(list1, list2);

        //  Collections라는 유틸 클래스가 있음
        Collections.sort(list1);
        Collections.sort(list2);

        print(list1, list2);
        
        System.out.println("list1.containsAll(list2):" + list1.containsAll(list2));
        
        
        list2.add("B");
        list2.add("C");
        //추가할 위치 지정
        list2.add(3, "A");
        print(list1, list2);
        
        //변경
        list2.set(3, "AA");
        print(list1, list2);
        
        list1.add(0, "1");
        //indexOf()는 지정된 객체의 위치를 알려준다
        System.out.println("index=" + list1.indexOf("1"));
        // list1.remove(5);
        
        print(list1, list2);

        System.out.println(list1.retainAll(list2));


        for (int i =  list2.size() -1; i >= 0; i--) {
            if(list1.contains(list2.get(i))){
                list2.remove(i);
            }
            
        }

        print(list1, list2);

    }

    static void print(ArrayList list1, ArrayList list2) {
        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);

    }
}
