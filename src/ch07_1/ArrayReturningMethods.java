package ch07_1;

import java.util.ArrayList;
import java.util.List;

public class ArrayReturningMethods {
    // TODO: 범위 내의 정수 배열 생성 메서드를 작성하세요
    // 메서드명: range, 매개변수: int start, int end
    // start부터 end까지의 숫자 배열 반환, start > end면 빈 배열

    static int[] range(int start, int end){
        int[] arr = new int[end-start+1];
        if(start <= end) {
            for (int i = 0; i <= end-start; i++) {
                arr[i] = start+i;
            }
        }else{
            arr = new int[]{};
        }
        return arr;
    }


    // TODO: 배열 필터링 메서드를 작성하세요
    // 메서드명: filterPositive, 매개변수: int[] input
    // 양수만 포함하는 새 배열 반환
    static int[] filterPositive(int[] input){
        List<Integer> list = new ArrayList<>();
        for(int num : input){
            if(num>0){
                list.add(num);
            }
        }

        int[] result = new int[list.size()];

        for(int i = 0; i< list.size(); i++){
            result[i] = list.get(i);
        }
        return result;
    }


    // TODO: 두 배열 병합 메서드를 작성하세요
    // 메서드명: merge, 매개변수: int[] arr1, int[] arr2
    // 두 배열을 연결한 새 배열 반환
    static int[] merge (int[] arr1, int[] arr2){
        List<Integer> arr3 = new ArrayList<>();
        int[] arr4 = new int[arr1.length+arr2.length];

        for(int i = 0 ; i < arr1.length; i++){
            arr3.add(arr1[i]);
        }
        for(int i = 0 ; i < arr2.length; i++){
            arr3.add(arr2[i]);
        }

        for(int i = 0 ; i < arr1.length+arr2.length; i++){
            arr4[i] = arr3.get(i);
        }

        return arr4;
    }


    // TODO: 배열 뒤집기 메서드를 작성하세요
    // 메서드명: reverse, 매개변수: int[] input
    // 역순으로 된 새 배열 반환

    static  int[] reverse (int[] input){
        int[] arr = new int[input.length];
        for(int i = 0; i< input.length; i++){
            arr[input.length - 1 - i] = input[i];
        }
        return arr;
    }


    public static void main(String[] args) {
        // range 테스트
        int[] numbers = range(5, 10);
        System.out.print("range(5, 10): ");
        printArray(numbers);

        // filterPositive 테스트
        int[] mixed = {-3, 5, 0, -7, 12, -1, 8};
        int[] positive = filterPositive(mixed);
        System.out.print("\n양수만: ");
        printArray(positive);

        // merge 테스트
        int[] first = {1, 3, 5};
        int[] second = {2, 4, 6};
        int[] merged = merge(first, second);
        System.out.print("\n병합: ");
        printArray(merged);

        // reverse 테스트
        int[] original = {1, 2, 3, 4, 5};
        int[] reversed = reverse(original);
        System.out.print("\n뒤집기: ");
        printArray(reversed);
    }

    private static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
