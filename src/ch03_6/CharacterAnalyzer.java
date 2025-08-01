package ch03_6;

import textio.TextIO;

public class CharacterAnalyzer {
    public static void main(String[] args) {
        System.out.print("문자를 입력하세요: ");
        char ch = TextIO.getlnChar();

        // TODO: 문자 종류 판별 switch문
        // 힌트: 여러 case 묶기, Character.isLetter(), Character.isDigit()

        // 여기에 코드를 작성하세요
        switch (ch){
            case 'a','e','i','o','u' -> System.out.printf("%c는 소문자 모음입니다.",ch);
            case 'A','E','I','O','U' -> System.out.printf("%c는 대문자 모음입니다.",ch);
            default -> {
                if(Character.isLetter(ch)){
                    System.out.printf("%c는 문자입니다.",ch);
                }else if(Character.isDigit(ch)){
                    System.out.printf("%c는 숫자입니다.",ch);
                }else{
                    System.out.printf("%c는 특수문자입니다.",ch);
                }
            }
        }
    }
}