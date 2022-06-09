package ch_08;

import java.util.Scanner;

public class Excise8_7 {
    public static void main(String[] args) {
        int answer = (int) (Math.random() * 100) + 1;
        int input = 0;
        int count = 0;

        do {
            
            count++;
            System.out.println("1과 100사이의 값을 입력하세요");

            try {
                input = new Scanner(System.in).nextInt();
            } 
            catch(Exception e) { 
                System.out.println("유효하지 않은 값입니다. "+"다시 값을 입력해주세요.");
                continue; 
            }

            // try {
            //     input = new Scanner(System.in).nextInt();    
            //     System.out.println(input);
            //     if (!(0 <= input && input >= 100)){
            //         throw new Exception("숫자만 입력이 가능합니다");
            //     }
            // } catch (Exception e) {
            //     System.out.println(e.getMessage());
            // }
            

            if(answer > input) {
                System.out.println("더 큰 수를 입력하세요");;
            }else if(answer < input) {
                System.out.println("더 작은 수를 입력하세요");;
            }else {
                System.out.println("정답입니다");
                System.out.println("시도횟수 : " + count + "번");
            }
        }while(true);
    }
}
