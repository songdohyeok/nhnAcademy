package ch02_5;

public class GradeSystem {
    public static void main(String[] args) {
        // TODO: 종합적인 성적 처리 시스템을 만드세요
        // 힌트:
        // 1. "=== 성적 처리 시스템 ===" 출력
        // 2. 학생 정보: name="김학생", midterm=85, finalExam=92, homework=88, attendance=95
        // 3. 가중치: 중간30%, 기말40%, 과제20%, 출석10%
        // 4. 총점 계산: 각 점수 × 가중치의 합
        // 5. 조건 연산자로 학점 계산 (95이상=A+, 90이상=A, 85이상=B+, ...)
        // 6. 장학금 자격: 총점 90이상 && 출석 90이상

        // 여기에 코드를 작성하세요
        System.out.println("=== 성적 처리 시스템 ===\n");

        String name = "김학생";
        int midterm = 85;
        int finalExam = 92;
        int homework = 88;
        int attendance = 95;

        double totalScore = midterm * 0.3 + finalExam * 0.4 + homework * 0.2 + attendance * 0.1;

        String grade = totalScore >= 95 ? "A+" : totalScore >= 90 ? "A" : totalScore >= 85 ? "B+" :
                        totalScore >= 80 ? "B" : totalScore >= 75 ? "C+" : totalScore >= 70 ? "C" :
                        totalScore >= 65 ? "D+" : totalScore >= 60 ? "D" : "F";


        boolean scholarship = totalScore >= 90 && attendance >= 90;

        System.out.printf("학생: %s%n", name);
        System.out.printf("중간고사: %d (30%%)%n", midterm);
        System.out.printf("기말고사: %d (40%%)%n", finalExam);
        System.out.printf("과제: %d (20%%)%n", homework);
        System.out.printf("출석: %d (10%%)%n", attendance);
        System.out.printf("총점: %.1f%n", totalScore);
        System.out.printf("학점: %s%n", grade);
        System.out.printf("장학금 자격: %s%n", scholarship ? "있음" : "없음");
    }
}