package ch04_3;

public class ArrayParameters {
    public static void main(String[] args) {
        System.out.println("=== 배열 매개변수 예제 ===\n");

        int[] numbers = {15, 7, 23, 4, 18, 12, 9};

        // TODO 41: 배열 정보 출력하기
        System.out.print("원본 배열: ");
        printArray(numbers);

        // TODO 42: 통계 정보 출력하기
        System.out.println("\n=== 배열 통계 ===");
        sum(numbers);
        average(numbers);
        max(numbers);
        min(numbers);
        range(numbers);

        // TODO 43: 배열 조작하기
        System.out.println("\n=== 배열 조작 ===");

        System.out.print("2배 값: ");
        doubleValues(numbers);

        System.out.print("10보다 큰 값: ");
        filterGreaterThan(numbers,10);

        // 원본 배열 정렬
        System.out.print("정렬된 배열: ");
        copyArray(numbers);

        // 원본은 변경되지 않음
        System.out.print("원본 배열: ");
        sortArray(numbers);

    }

    // TODO 44: 배열 출력 메서드 구현하기
    static void printArray(int[] arr) {
        System.out.print("[");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]);
            if(i!=arr.length-1){
                System.out.print(", ");
            }
        }
        System.out.print("]\n");
    }

    // TODO 45: 통계 메서드들 구현하기
    static int sum(int[] arr) {
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
        }
        System.out.println("합계: "+sum);
        return sum;
    }

    static double average(int[] arr) {
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
        }
        System.out.println("평균: "+(double)sum/arr.length);
        return (double)sum/arr.length;
    }

    static int max(int[] arr) {
        int max = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("최대값: "+max);
        return max;

    }

    static int min(int[] arr) {
        int min = 100;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("최소값: "+min);
        return min;
    }

    static int range(int[] arr) {
        int max = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }

        int min = 100;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }

        System.out.println("범위: "+(max-min));
        return max - min;
    }

    // TODO 46: 배열 조작 메서드들 구현하기
    static int[] doubleValues(int[] arr) {
        System.out.print("[");
        int [] doubleArr = new int[arr.length];
        for(int i = 0; i<arr.length; i++){
            doubleArr[i] = arr[i] * 2;
            System.out.print(doubleArr[i]);
            if(i!=arr.length-1){
                System.out.print(", ");
            }
            }
        System.out.print("]");
        System.out.println();
        return doubleArr;
    }

    static int[] filterGreaterThan(int[] arr, int threshold) {
        int[] filterArr = new int[arr.length];
        System.out.print("[");
        for(int i = 0; i<arr.length;i++){
            if(arr[i]>threshold){
                filterArr[i] = arr[i];
                System.out.print(filterArr[i]);
                if(i!=arr.length-2){
                    System.out.print(", ");
                }
            }
        }
        System.out.print("]");
        System.out.println();
        return filterArr;
    }

    static int[] copyArray(int[] arr) {
        int[] copyArr = new int[arr.length];
        System.out.print("[");
        for(int i = 0; i<arr.length; i++){
            copyArr[i] = arr[i];
        }

        for(int i = 0; i<copyArr.length-1; i++){
            for(int j = 0; j<copyArr.length-1-i; j++){
                if(copyArr[j]>copyArr[j+1]) {
                    int temp = copyArr[j];
                    copyArr[j] = copyArr[j + 1];
                    copyArr[j + 1] = temp;
                }
            }
        }

        for(int i = 0; i<arr.length; i++){
            System.out.print(copyArr[i]);
            if(i!=arr.length-1){
                System.out.print(", ");
            }
        }
        System.out.print("]");
        System.out.println();
        return copyArr;
    }

    static void sortArray(int[] arr) {
        System.out.print("[");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]);
            if(i!=arr.length-1){
                System.out.print(", ");
            }
        }
        System.out.print("]\n");
    }
}

