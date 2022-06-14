package ch_10;

import java.util.Calendar;

public class EX10_1 {
    public static void main(String[] args) {
        Calendar today = Calendar.getInstance(); // Calendar 객체 생성
        System.out.println("이 해의 년도" + today.get(Calendar.YEAR));
        System.out.println("월:" + today.get(Calendar.MONTH));
    }

    
}
