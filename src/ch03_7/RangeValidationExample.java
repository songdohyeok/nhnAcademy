package ch03_7;

import textio.TextIO;

public class RangeValidationExample {
    public static void main(String[] args) {
        System.out.println("=== 범위 검증 입력 예제 ===");

        int age = getValidAge();
        int score = getValidScore();

        System.out.println("입력 완료!");
        System.out.println("나이: " + age + "세");
        System.out.println("점수: " + score + "점");

        // 등급 계산
        String grade = calculateGrade(score);
        System.out.println("등급: " + grade);
    }

    public static int getValidAge() {
        while (true) {
            System.out.print("나이를 입력하세요 (1-150): ");
            String input = TextIO.getln();

            // TODO: 나이 검증 로직
            // 힌트: 범위 검사 후 continue로 재시도

            // 여기에 코드를 작성하세요
            int inputAge = Integer.parseInt(input);

            try{
                if(inputAge<=150 && inputAge>=1){
                    System.out.println("✅ 유효한 나이입니다.");
                    return inputAge;
                }
                else{
                    System.out.println("유효하지 않은 나이입니다. 다시 입력해주세요.");
                    continue;
                }
            }catch (NumberFormatException e){
                System.out.println("숫자 형식이 아닙니다.");
                continue;
            }
        }
    }

    public static int getValidScore() {
        while (true) {
            System.out.print("점수를 입력하세요 (0-100): ");
            String input = TextIO.getln();

            // TODO: 점수 검증 로직
            // 힌트: 범위 검사 후 continue로 재시도

            // 여기에 코드를 작성하세요
            int inputScore = Integer.parseInt(input);

            try {
                if (inputScore <= 100 && inputScore >= 0) {
                    System.out.println("✅ 유효한 점수입니다.");
                    return inputScore;
                } else {
                    System.out.println("유효하지 않은 점수입니다. 다시 입력해주세요.");
                    continue;
                }
            }catch (NumberFormatException e){
                System.out.println("숫자 형식이 아닙니다.");
                continue;
            }
        }
    }

    public static String calculateGrade(int score) {
        // TODO: 점수에 따른 등급 계산
        // 힌트: if-else if 체인

        // 여기에 코드를 작성하세요
        if(score>=90){
            return "A";
        }else if(score>=80){
            return "B";
        }else if(score>=70){
            return "C";
        }else if(score>=60){
            return "D";
        }else
            return "F";

    }
}