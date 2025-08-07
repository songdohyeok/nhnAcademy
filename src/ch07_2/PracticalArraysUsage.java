package ch07_2;

import java.util.Arrays;

public class PracticalArraysUsage {
    // TODO: 배열 통계 계산 메서드를 작성하세요
    // 메서드명: arrayStatistics, 매개변수: int[] data
    // 원본을 복사하여 정렬하고 최소값, 최대값, 중앙값을 출력
    // 중앙값: 짝수 길이면 중간 두 값의 평균, 홀수 길이면 중간값
    static void arrayStatistics(int[] data){
        int[] copyData = Arrays.copyOf(data, data.length);
        System.out.println("원본 데이터: "+ Arrays.toString(data));
        Arrays.sort(copyData);
        System.out.println("정렬된 데이터: "+ Arrays.toString(copyData));

        int max = copyData[0];
        int min = copyData[0];
        for(int i : copyData){
            if(i>max){
                max = i;
            }
            if(i<min){
                min = i;
            }
        }
        System.out.println("최소값: "+min);
        System.out.println("최대값: "+max);
        double result = (double) (copyData[copyData.length / 2] + copyData[(copyData.length / 2) - 1]) / 2;
        double result2 = (double) (copyData[(copyData.length-1)/2]);
        if(copyData.length % 2 == 0) {
            System.out.println("중앙값: " + result);
        }else {
            System.out.println("중앙값: " + result2);
        }

    }


    // TODO: 배열에서 중복 제거 메서드를 작성하세요
    // 메서드명: removeDuplicates, 매개변수: int[] array
    // 정렬된 복사본을 만들고 중복이 아닌 요소만 세어서 새 배열 생성
    // 중복 제거된 배열을 반환
    static int[] removeDuplicates(int[] array) {
        int[] copyArray = Arrays.copyOf(array, array.length);
        Arrays.sort(copyArray);

        int count = 1;

        for (int i = 1; i < copyArray.length; i++) {
            if (copyArray[i] != copyArray[i - 1]) {
                count++;
            }
        }

        int[] copycopyArray = new int[count];
        copycopyArray[0] = copyArray[0];
        int index = 1;

        for(int i = 1; i < copyArray.length; i++){
            if( copyArray[i] != copyArray[i-1]){
                copycopyArray[index++] = copyArray[i];
            }
        }
        return copycopyArray;
    }


    // TODO: 두 배열 병합 메서드를 작성하세요
    // 메서드명: mergeArrays, 매개변수: int[] arr1, int[] arr2
    // System.arraycopy를 사용하여 두 배열을 병합한 새 배열 반환
    static int[] mergeArrays(int[] arr1, int[] arr2){
        int[] mergeArr = new int[arr1.length+arr2.length];
        System.arraycopy(arr1, 0, mergeArr, 0, arr1.length);
        System.arraycopy(arr2, 0, mergeArr, arr1.length, arr2.length);
        return mergeArr;
    }


    static public void main(String[] args) {
        // 통계 테스트
        int[] testData = {45, 23, 67, 89, 12, 34, 56, 78, 90, 23};
        arrayStatistics(testData);

        // 중복 제거 테스트
        System.out.println("\n=== 중복 제거 ===");
        int[] withDuplicates = {5, 2, 8, 2, 9, 5, 1, 8, 3};
        int[] unique = removeDuplicates(withDuplicates);
        System.out.println("원본: " + Arrays.toString(withDuplicates));
        System.out.println("중복 제거: " + Arrays.toString(unique));

        // 배열 병합 테스트
        System.out.println("\n=== 배열 병합 ===");
        int[] first = {1, 3, 5, 7};
        int[] second = {2, 4, 6, 8};
        int[] merged = mergeArrays(first, second);
        System.out.println("병합 결과: " + Arrays.toString(merged));
        Arrays.sort(merged);
        System.out.println("정렬된 병합: " + Arrays.toString(merged));
    }
}
