package ch07_2;

public class ArrayComparison {
    // TODO: 배열에서 가장 큰 차이를 가진 인접 요소 찾기 메서드를 작성하세요
    // 메서드명: findMaxDifference, 매개변수: int[] numbers
    // 배열 길이가 2 미만이면 "비교할 요소가 부족합니다." 출력
    // 인접한 요소들의 절댓값 차이를 계산하여 최대 차이와 인덱스 출력
    static void findMaxDifference(int[] number){
        if(number.length<2){
            System.out.println("비교할 요소가 부족합니다.");
        }

        int max = number[1]-number[0];
        int maxNumber1 = 0;
        int maxNumber2 = 0;

        for(int i = 0; i<number.length-1; i++){
            if(Math.abs(number[i] - number[i+1])>max){
                max = Math.abs(number[i] - number[i+1]);
                maxNumber1 = i;
                maxNumber2 = i+1;
            }
        }
        System.out.println("최대 차이: "+max+" (인덱스 "+maxNumber1+"와 "+maxNumber2+"사이)");
        System.out.println("값: "+number[maxNumber1]+"와 "+number[maxNumber2]);
    }


    // TODO: 배열에서 패턴을 찾는 메서드를 작성하세요
    // 메서드명: findPattern, 매개변수: int[] array, int[] pattern
    // pattern이 array보다 길면 "패턴이 배열보다 깁니다." 출력
    // 패턴이 발견되면 위치를 출력, 없으면 "패턴을 찾을 수 없습니다." 출력

    static void findPattern(int[] array, int[] pattern){
        if(pattern.length>array.length){
            System.out.println("패턴이 배열보다 깁니다.");
            return;
        }

        for (int i = 0; i <= array.length - pattern.length; i++) {
            boolean match = true;

            for (int j = 0; j < pattern.length; j++) {
                if (array[i + j] != pattern[j]) {
                    match = false;
                    break;
                }
            }

            if (match) {
                System.out.println("패턴 발견 위치: " + i);
            }

        }
    }


    public static void main(String[] args) {
        int[] values = {10, 15, 8, 23, 19, 30, 12};
        findMaxDifference(values);

        System.out.println("\n=== 패턴 검색 ===");
        int[] data = {1, 2, 3, 4, 2, 3, 4, 5, 2, 3};
        int[] pattern = {2, 3, 4};
        findPattern(data, pattern);
    }
}
