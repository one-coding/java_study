package ch_09;

import java.util.Objects;

/**
 * Exercise9_1
 */
public class Exercise9_4 {
   public static boolean contains (String src, String target) {
       return src.contains(target);
   }
    public static void main(String[] args) {
        System.out.println(contains("12345", "23"));
        System.out.println(contains("12345", "67"));

    }
}

