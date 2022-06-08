package ch_06;

public class Exercise6_2 {
    public static void main(String[] args) {
        Student s = new Student("홍길동", 1, 1, 100, 60, 76);

        String str = s.info();
        System.out.println(str);
    }

    
}


class Student {
    String name;
    int ban;
    int no ;
    int kor;
    int eng;
    int math;

    Student(){

    }
    Student(String name, int ban, int no, int kor, int eng, int math){
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    String info(){
        int sum = kor + eng + math;
        float average =((int)sum / 3.0f * 10 + 0.5f) / 10f;

        String result = name + "," + ban + "," + no  + "," + kor  + "," + eng  + "," + math + "," + sum + "," +  average;
        return result;
    }

    int getTotal(){
        return kor + eng + math;
    }

    float getAverage() {
        return (int)(getTotal() / 3f * 10 + 0.5f) / 10f;
    }
}