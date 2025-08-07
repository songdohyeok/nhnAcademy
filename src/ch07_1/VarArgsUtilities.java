package ch07_1;

import java.util.Arrays;

public class VarArgsUtilities {
    // TODO: 문자열 연결 메서드를 작성하세요
    // 메서드명: join
    // 매개변수: String delimiter, String... parts
    // 구분자로 문자열들을 연결하여 반환
    static String join(String delimiter, String... parts){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < parts.length; i++) {
            result.append(parts[i]);
            if (i < parts.length - 1) {
                result.append(delimiter);
            }
        }
        return result.toString();
    }


    // TODO: 조건을 만족하는 개수 세기 메서드를 작성하세요
    // 메서드명: countPositive
    // 매개변수: int... numbers
    // 양수의 개수를 반환

    static int countPositive(int... numbers){
        int count = 0;
        for(int number : numbers){
            if(number >= 0){
                count++;
            }
        }
        return count;
    }


    // TODO: 최소값과 최대값 동시에 찾기 메서드를 작성하세요
    // 메서드명: findMinMax
    // 매개변수: int... values
    // 반환값: int[] {최소값, 최대값}, 값이 없으면 null
    static int[] findMinMax(int... values){
        int max = values[0];
        int min = values[0];

        for(int value : values){
            if(max<value){
                max = value;
            }
            if(min>value){
                min = value;
            }
        }
        return new int[]{min, max};
    }


    // TODO: 가변 인수로 배열 생성 메서드를 작성하세요
    // 메서드명: createArray
    // 매개변수: int... elements
    // 가변 인수의 복사본 배열을 반환
    static int[] createArray(int... elements) {
        int[] intArray = new int[elements.length];

        for (int i= 0; i< elements.length;i++) {
            intArray[i] = elements[i];
        }

        return intArray;
    }


    public static void main(String[] args) {
        // join 사용
        System.out.println(join("-", "2024", "11", "15"));  // 2024-11-15
        System.out.println(join(" | ", "Home", "About", "Contact"));

        // countPositive 사용
        System.out.println("\n양수 개수: " +
                countPositive(-5, 3, 0, -2, 7, 1, -8));  // 3

        // findMinMax 사용
        int[] minMax = findMinMax(45, 12, 78, 34, 90, 23);
        if (minMax != null) {
            System.out.println("최소값: " + minMax[0]);  // 12
            System.out.println("최대값: " + minMax[1]);  // 90
        }

        // createArray 사용
        int[] myArray = createArray(10, 20, 30, 40);
        System.out.print("\n생성된 배열: ");
        for (int val : myArray) {
            System.out.print(val + " ");
        }
    }
}
