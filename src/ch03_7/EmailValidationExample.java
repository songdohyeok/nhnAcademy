package ch03_7;

import textio.TextIO;

public class EmailValidationExample {
    public static void main(String[] args) {
        System.out.println("=== 이메일 검증 예제 ===");

        String email = getValidEmail();
        System.out.println("등록된 이메일: " + email);

        // 이메일 정보 분석
        analyzeEmail(email);
    }

    public static String getValidEmail() {
        while (true) {
            System.out.print("이메일 주소를 입력하세요: ");
            String input = TextIO.getln().trim();

            // TODO: 이메일 검증 시도
            // 힌트: validateEmail() 호출

            // 여기에 코드를 작성하세요
            try {
                validateEmail(input);
                return input;
            } catch (IllegalArgumentException e){
                System.out.println("유효하지 않은 이메일입니다.");
            }
        }
    }

    public static void validateEmail(String email) {
        // TODO: 이메일 유효성 검증
        // 힌트: IllegalArgumentException 사용

        // 여기에 코드를 작성하세요
        String[] validEmail = email.split("@");
        if (!email.contains("@")) {
            throw new IllegalArgumentException("@를 포함시키세요");
        }
        if (validEmail.length != 2 || !validEmail[1].contains(".")) {
            throw new IllegalArgumentException("이메일 형식이 틀립니다.");
        }
    }

    public static void analyzeEmail(String email) {
        // TODO: 이메일 분석
        // 힌트: split("@") 사용하여 사용자명과 도메인 분리

        // 여기에 코드를 작성하세요
        String[] validEmail = email.split("@");
        System.out.printf("사용자명: %s%n",validEmail[0]);
        System.out.printf("도메인: %s%n",validEmail[1]);
        System.out.print("종류: 상업적 도메인");
    }
}