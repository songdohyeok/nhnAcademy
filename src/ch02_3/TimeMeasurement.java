package ch02_3;

public class TimeMeasurement {
    public static void main(String[] args) {
        // TODO: 프로그램 시작 시간을 기록하세요
        // 힌트:
        // 1. startTime = System.nanoTime() (나노초 정밀도)
        // 2. startMillis = System.currentTimeMillis() (밀리초 정밀도)

        // TODO: 프로그램 시작 메시지를 출력하세요
        // 힌트:
        // 1. "=== 시간 측정 프로그램 ===" 출력
        // 2. "시작 시간: " + new java.util.Date() 출력

        // TODO: 제곱근 합계 계산을 수행하세요
        // 힌트:
        // 1. sum = 0.0으로 초기화
        // 2. for (int i = 1; i <= 1000000; i++) 반복문
        // 3. sum += Math.sqrt(i) 누적
        // 4. "1부터 1,000,000까지 제곱근의 합: " + sum 출력

        // TODO: 파이 값을 라이프니츠 공식으로 계산하세요
        // 힌트:
        // 1. pi = 0.0으로 초기화
        // 2. for (int i = 0; i < 1000000; i++) 반복문
        // 3. pi += Math.pow(-1, i) / (2 * i + 1) 누적
        // 4. pi *= 4 (라이프니츠 공식 완성)
        // 5. "계산된 파이 값: " + pi 출력
        // 6. "실제 파이 값: " + Math.PI 출력
        // 7. "오차: " + Math.abs(pi - Math.PI) 출력

        // TODO: 실행 시간을 계산하고 출력하세요
        // 힌트:
        // 1. endTime = System.nanoTime()
        // 2. endMillis = System.currentTimeMillis()
        // 3. nanoSeconds = endTime - startTime
        // 4. milliSeconds = endMillis - startMillis
        // 5. "\n실행 시간:" 출력
        // 6. "나노초: " + nanoSeconds 출력
        // 7. "밀리초: " + milliSeconds 출력
        // 8. "초: " + (nanoSeconds / 1_000_000_000.0) 출력

        // 여기에 코드를 작성하세요
        String email = "user@example.com";
        System.out.println("이메일 검증: " + email);
        System.out.println("@ 포함: " + (email.indexOf('@') != -1));
        System.out.println(". 포함: " + (email.indexOf('.') != -1));

        String sentence = "Java is a powerful programming language!";
        System.out.println("\n문장 분석: \"" + sentence + "\"");
        System.out.println("길이: " + sentence.length());
        System.out.println("단어 수: " + countWords(sentence));
        System.out.println("대문자 수: " + countUpperCase(sentence));
        System.out.println("소문자 수: " + countLowerCase(sentence));

        String[] words = {"level", "hello", "radar", "java", "noon"};
        System.out.println("\n팰린드롬 검사:");
        for (String word : words)
            System.out.println(word + ": " + isPalindrome(word));
    }

    public static int countWords(String text) {
        int count = 0;
        boolean inWord = false;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                if (!inWord) {
                    count++;
                    inWord = true;
                }
            } else
                inWord = false;
        }
        return count;
    }

    public static int countUpperCase(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'A' && c <= 'Z')
                count++;
        }
        return count;
    }

    public static int countLowerCase(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'a' && c <= 'z')
                count++;
        }
        return count;
    }

    public static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;
        while (left < right) {
            if (word.charAt(left) != word.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
}