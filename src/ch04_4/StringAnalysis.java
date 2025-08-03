package ch04_4;

public class StringAnalysis {
    public static void main(String[] args) {
        System.out.println("=== 문자열 분석 함수 ===\n");

        String text = "Hello World 2024!";

        // TODO 42: 문자열 분석 테스트하기
         System.out.println("텍스트: \"" + text + "\"");
         System.out.println("길이: " + length(text));
         System.out.println("모음 개수: " + countVowels(text));
         System.out.println("자음 개수: " + countConsonants(text));
         System.out.println("숫자 개수: " + countDigits(text));
         System.out.println("공백 개수: " + countSpaces(text));
         System.out.println("단어 개수: " + countWords(text));

        // TODO 43: 회문 검사 테스트하기
         String[] palindromes = {"radar", "hello", "level", "noon"};
         System.out.println("\n=== 회문 검사 ===");
         for (String word : palindromes) {
             System.out.println(word + " → " +
                 (isPalindrome(word) ? "회문입니다" : "회문이 아닙니다"));
              }
    }

    // TODO 44: 문자열 길이 함수 구현하기
    static int length(String str) {
        // 길이 계산
        return str.length();
    }

    // TODO 45: 모음 개수 함수 구현하기
    static int countVowels(String str) {
        // 모음 개수 세기
        str = str.toLowerCase().trim();
        int count = 0;
        for(int i = 0;i<str.length();i++){
            char c = str.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                count++;
            }
        }
        return count;
    }

    // TODO 46: 자음 개수 함수 구현하기
    static int countConsonants(String str) {
        // 자음 개수 세기
        str = str.toLowerCase().trim();
        int count = 0;
        for(int i = 0;i<str.length();i++){
            char c = str.charAt(i);
            if(c >= 'a' && c<= 'z' && c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u'){
                count++;
            }
        }
        return count;
    }

    // TODO 47: 숫자 개수 함수 구현하기
    static int countDigits(String str) {
        // 숫자 개수 세기
        int count = 0;
        for(int i = 0;i<str.length();i++){
            char c = str.charAt(i);
            if(Character.isDigit(c)){
                count++;
            }
        }
        return count;
    }

    // TODO 48: 공백 개수 함수 구현하기
    static int countSpaces(String str) {
        // 공백 개수 세기
        int count = 0;
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) == ' ')
                count++;
        }
        return count;
    }

    // TODO 49: 단어 개수 함수 구현하기
    static int countWords(String str) {
        // 단어 개수 세기
        String[] words = str.trim().split("\\s+"); //\s+는 공백문자 1회이상 반복
        return words.length;
    }

    // TODO 50: 회문 검사 함수 구현하기
    static boolean isPalindrome(String word) {
        // 회문 여부 판단
        word = word.toLowerCase().replaceAll("[^a-z0-9]", "");
        int left = 0, right = word.length() - 1;
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // TODO 51: 문자열 뒤집기 함수 구현하기
    static String reverse(String str) {
        // 문자열 뒤집기
            return new StringBuilder(str).reverse().toString();
    }
}


