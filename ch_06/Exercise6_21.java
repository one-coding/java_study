package ch_06;

import java.util.Arrays;



public class Exercise6_21 {
    public static int abs(int value) {
       return 0 <= value ? value : -value; 
    }
    
    public static void main(String[] args) {
        int value = 5;
        System.out.println(value + "의 절대값:" + abs(value));

        value = -10;
        System.out.println(value + "의 절대값:" + abs(value));
     

    }

    
}
