package ch03_7;

import textio.TextIO;

public class NumberParsingExample {
    public static void main(String[] args) {
        System.out.println("=== 숫자 변환 예제 ===");

        String[] testInputs = {"123", "45.67", "abc", "12x", "", "  ", "-789"};

        for (String input : testInputs) {
            System.out.println("\n입력: '" + input + "'");

            // TODO: Integer 변환 시도
            // 힌트: try-catch 구조 사용

            // 여기에 Integer 변환 코드를 작성하세요
            try{
                System.out.printf("✅Integer 성공: %d", Integer.parseInt(input));
            }catch(NumberFormatException e){
                System.out.printf("❌Integer 실패: For input string: %s",input);
            }

            // TODO: Double 변환 시도
            // 힌트: try-catch 구조 사용

            // 여기에 Double 변환 코드를 작성하세요
            System.out.println();
            try{
                System.out.printf("✅Double 성공: %.1f", Double.parseDouble(input));
            }catch(NumberFormatException e){
                System.out.printf("❌Double 실패: For input string: %s",input);
            }


        }
    }
}