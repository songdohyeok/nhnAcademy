package ch03_5;

import textio.TextIO;

public class NumberClassification {
    public static void main(String[] args) {
        System.out.print("숫자를 입력하세요: ");
        double number = TextIO.getlnDouble();

        // 여기에 코드를 작성하세요
        if(number > 0) {
            System.out.println("양수입니다.");
        }else if(number < 0) {
            System.out.println("음수입니다.");
        }else if(number == 0) {
            System.out.println("0입니다.");
        }

        if(number>1000){
            System.out.println("매우 큰 양수입니다.");
        }else if(number > 1000) {
            System.out.println("매우 작은 음수입니다.");
        }else if(number > 0 && number < 1) {
            System.out.println("0과 1 사이의 양수입니다.");
        }

        if((int)number == number){
            System.out.println("정수입니다.");
        }else
            System.out.println("실수입니다.");
    }
}