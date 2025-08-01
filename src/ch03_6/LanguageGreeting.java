package ch03_6;

import textio.TextIO;

public class LanguageGreeting {
    public static void main(String[] args) {
        System.out.print("언어를 입력하세요 (한국어/영어/일본어/중국어): ");
        String language = TextIO.getln().toLowerCase();

        // TODO: switch 표현식으로 인사말 설정
        // 힌트: 여러 case 값 묶기
        String greeting = "";// 여기에 switch 표현식을 작성하세요

        switch(language){
            case "한국어" -> greeting = "안녕하세요";
            case "영어", "english" -> greeting = "Hello!";
            case "일본어" -> greeting = "곤니찌와";
            case "중국어" -> greeting = "니하오";
        }

        System.out.println("인사말: " + greeting);

        // TODO: 언어별 추가 정보 출력
        // 힌트: switch문 사용

        // 여기에 코드를 작성하세요
        switch(language){
            case "한국어" -> {
                System.out.println("한국은 동아시아의 반도 국가입니다.");
                System.out.println("한글은 세종대왕이 창제했습니다.");
            }
            case "영어", "english" -> {
                System.out.println("영어는 전 세계에서 가장 널리 사용되는 언어입니다.");
                System.out.println("국제 공용어 역할을 합니다.");
            }
            case "일본어" -> {
                System.out.println("가나 문자를 사용합니다.");
            }
            case "중국어" -> {
                System.out.println("간체자를 사용합니다.");
            }
        }

    }
}