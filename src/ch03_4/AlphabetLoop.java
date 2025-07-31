package ch03_4;

public class AlphabetLoop {
    public static void main(String[] args) {
        // TODO: 대문자 알파벳
        // 힌트:
        // 1. "대문자 알파벳:" 출력
        // 2. for 루프로 ch를 'A'부터 'Z'까지 반복
        // 3. ch와 공백 출력
        // 4. 줄바꿈

        // 여기에 코드를 작성하세요
        System.out.println("대문자 알파벳:");
        for(char ch = 'A'; ch<='Z'; ch++){
            System.out.print(ch + " ");
        }System.out.println();

        // TODO: 소문자 알파벳
        // 힌트:
        // 1. "\n소문자 알파벳:" 출력
        // 2. for 루프로 ch를 'a'부터 'z'까지 반복
        // 3. ch와 공백 출력
        // 4. 줄바꿈

        // 여기에 코드를 작성하세요
        System.out.println("\n소문자 알파벳:");
        for(char ch = 'a'; ch<='z'; ch++){
            System.out.print(ch + " ");
        }System.out.println();

        // TODO: 알파벳과 ASCII 코드
        // 힌트:
        // 1. "\n알파벳과 ASCII 코드:" 출력
        // 2. for 루프로 ch를 'A'부터 'F'까지 반복
        // 3. ch + " = " + (int)ch 출력

        // 여기에 코드를 작성하세요
        System.out.println("\n알파벳과 ASCII 코드:");
        for(char ch = 'A'; ch<='F'; ch++){
            System.out.println(ch + " = " + (int)ch);
        }
    }
}