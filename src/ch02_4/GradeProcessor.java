package ch02_4;

import textio.TextIO;
public class GradeProcessor {
    public static void main(String[] args) {
        // TODO: 성적 처리 프로그램을 만드세요
        // 힌트:
        // 1. "=== 성적 처리 프로그램 ===" 출력
        // 2. 학생 이름(getln)과 학번(getlnInt) 입력
        // 3. 4과목 점수 입력 (국어, 영어, 수학, 과학)
        // 4. 평균 계산: (국어+영어+수학+과학) / 4.0
        // 5. 학점 계산: 90이상=A, 80이상=B, 70이상=C, 60이상=D, 그외=F
        // 6. 성적표를 printf로 서식에 맞게 출력
        // 7. 평균에 따른 평가 메시지 출력

        // 여기에 코드를 작성하세요
        System.out.println("=== 성적 처리 프로그램 ===");

        System.out.print("학생 이름: ");
        String name = TextIO.getln();

        System.out.print("학번: ");
        int studentId = TextIO.getlnInt();

        System.out.println("\n과목별 점수를 입력하세요 (0-100):");

        System.out.print("국어: ");
        double korean = TextIO.getlnDouble();

        System.out.print("영어: ");
        double english = TextIO.getlnDouble();

        System.out.print("수학: ");
        double math = TextIO.getlnDouble();

        System.out.print("과학: ");
        double science = TextIO.getlnDouble();

        double average = (korean + english + math + science) / 4.0;

        char grade;
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("\n=== 성적표 ===");
        System.out.printf("이름: %s (학번: %d)\n", name, studentId);
        System.out.println("──────────────────────────────");
        System.out.printf("국어:   %.1f점\n", korean);
        System.out.printf("영어:   %.1f점\n", english);
        System.out.printf("수학:   %.1f점\n", math);
        System.out.printf("과학:   %.1f점\n", science);
        System.out.println("──────────────────────────────");
        System.out.printf("평균:   %.1f점\n", average);
        System.out.printf("학점: %c\n", grade);

        System.out.println();

        if (average >= 90) {
            System.out.println("좋은 성적입니다.");
        } else if (average >= 80) {
            System.out.println("좋은 성적입니다. 계속 노력하세요!");
        } else if (average >= 70) {
            System.out.println("수고 하셨습니다.");
        } else if (average >= 60) {
            System.out.println("열심히 공부하세요.");
        } else {
            System.out.println("더 열심히 공부하세요.");
        }
    }
}