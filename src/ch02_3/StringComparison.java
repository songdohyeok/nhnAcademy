package ch02_3;

public class StringComparison {
    public static void main(String[] args) {
        // TODO: 비교를 위한 문자열 변수들을 선언하세요
        // 힌트:
        // s1 = "Hello", s2 = "Hello", s3 = "hello", s4 = "HELLO"
        // s5 = new String("Hello")
        // 모든 문자열 값 출력

        // TODO: equals 메소드로 비교하세요
        // 힌트:
        // 1. "\nequals 비교:" 출력
        // 2. s1.equals(s2), s1.equals(s3), s1.equals(s5) 결과 출력

        // TODO: equalsIgnoreCase 메소드로 비교하세요
        // 힌트:
        // 1. "\nequalsIgnoreCase 비교:" 출력
        // 2. s1.equalsIgnoreCase(s3), s1.equalsIgnoreCase(s4) 결과 출력

        // TODO: compareTo 메소드로 비교하세요
        // 힌트:
        // 1. "\ncompareTo 비교:" 출력
        // 2. s1.compareTo(s2), s1.compareTo(s3), s3.compareTo(s1) 결과 출력

        // TODO: 배열을 사전순으로 정렬하세요
        // 힌트:
        // 1. words 배열 = {"apple", "Banana", "cherry", "Apple", "banana"}
        // 2. 정렬 전 배열 출력
        // 3. 이중 for 루프로 버블 정렬 수행 (compareTo 사용)
        // 4. 정렬 후 배열 출력

        // 여기에 코드를 작성하세요
        String s1 = "Hello", s2 = "Hello", s3 = "hello", s4 = "HELLO";
        String s5 = new String("Hello");

        System.out.println(s1+" "+s2+" "+s3+" "+s4+" "+s5);
        System.out.println("\nequals 비교:");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s5));

        System.out.println("\nequalsIgnoreCase 비교:");
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println(s1.equalsIgnoreCase(s4));

        System.out.println("\ncompareTo 비교:");
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s3.compareTo(s1));

        String[] Words = {"apple", "Banana", "cherry", "Apple", "banana"};

        for(String word: Words){
            System.out.print(word + " ");
        }

        for(int i = 0; i< Words.length - 1; i++) {
            for (int j = 0; j < Words.length - 1 - i; j++) {
                if (Words[j].compareTo(Words[j+1])>0) { // 첫 글자를 비교하는 것이고 a = 97, B = 66으로  a>B이니 양수가 나와서 교환
                    String temp = Words[j];
                    Words[j] = Words[j + 1];
                    Words[j + 1] = temp;
                }
            }
        }
        System.out.println();
        for (String word : Words) {
            System.out.print(word + " ");
        }
    }
}