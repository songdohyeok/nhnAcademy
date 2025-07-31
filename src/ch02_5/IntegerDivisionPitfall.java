package ch02_5;

public class IntegerDivisionPitfall {
    public static void main(String[] args) {
        // TODO: 정수 나눗셈의 문제점과 해결 방법을 보여주세요
        // 힌트:
        // 1. total=17, count=5로 선언
        // 2. 잘못된 평균: total / count를 double에 저장
        // 3. 올바른 평균: (double)total / count, total / (double)count, 1.0 * total / count
        // 4. 백분율 계산: score=85, totalScore=100일 때 잘못된 방법과 올바른 방법 비교

        // 여기에 코드를 작성하세요
        int total = 17;
        int count = 5;

        double wrongAvg = total / count;
        System.out.println("잘못된 평균: " + wrongAvg);

        double avg1 = (double) total / count;
        double avg2 = total / (double) count;
        double avg3 = 1.0 * total / count;

        System.out.println("올바른 평균1: " + avg1);
        System.out.println("올바른 평균2: " + avg2);
        System.out.println("올바른 평균3: " + avg3);


        int score = 85;
        int totalScore = 100;

        double wrongPercentage = (score / totalScore) * 100;
        System.out.println("\n잘못된 백분율: " + wrongPercentage + "%");

        double percentage = (double) score / totalScore * 100;
        System.out.println("올바른 백분율: " + percentage + "%");
    }

}