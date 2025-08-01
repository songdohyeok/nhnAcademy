package ch03_6;

import textio.TextIO;

public class GradeEvaluationSystem {
    public static void main(String[] args) {
        System.out.print("점수를 입력하세요 (0-100): ");
        int score = TextIO.getlnInt();

        // TODO: switch 표현식으로 등급 결정
        // 힌트: score / 10 사용
        char grade = switch(score/10){  // 여기에 switch 표현식을 작성하세요
           case 9, 10-> 'A';
           case 8->  'B';
           case 7-> 'C';
           case 6-> 'D';
           default -> 'F';
        };

        // TODO: switch 표현식으로 평가 메시지 생성
        // 힌트: yield 사용
        String evaluation = switch(grade) {// 여기에 switch 표현식을 작성하세요
            case 'A' -> "대단한 성과입니다";
            case 'B' -> "우수한 성과입니다!";
            case 'C' -> "적당한 성과입니다!";
            case 'D' -> "아쉬운 성과입니다!";
            default -> "성과가 아닙니다";
        };

        // TODO: switch 표현식으로 학점 계산
        // 힌트: -> 연산자
        double gpa = switch(grade) { // 여기에 switch 표현식을 작성하세요
            case 'A' -> 4.0;
            case 'B' -> 3.0;
            case 'C' -> 2.0;
            case 'D' -> 1.0;
            default -> 0.0;
        };
        // TODO: switch 표현식으로 조언 생성
        // 힌트: -> 연산자

        String advice = switch (grade) {// 여기에 switch 표현식을 작성하세요
            case 'A' -> "열심히 했네요";
            case 'B' -> "조금만 더 집중하면 A등급도 가능할 것 같습니다.";
            case 'C' -> "더 열심히 합시다";
            case 'D' -> "더더 열심히 합시다";
            default -> "더더더 열심히 합시다";

        };
        System.out.println("\n=== 성적 결과 ===");
        System.out.printf("점수: %d점%n", score);
        System.out.printf("등급: %c (%s)%n", grade, evaluation);
        System.out.printf("학점: %.1f%n", gpa);
        System.out.println("조언: " + advice);

        // TODO: 장학금 자격 여부 판단
        // 힌트: switch 표현식
        boolean scholarship = switch(grade) {// 여기에 switch 표현식을 작성하세요
            case 'A' -> true;
            default -> false;
        };
        if (scholarship) {
            System.out.println("🎉 장학금 대상자입니다!");
        }
    }
}