package ch07_1;

public class VarArgsBasics {
    // TODO: 가변 인수를 사용한 합계 계산 메서드를 작성하세요
    // 메서드명: sum, 매개변수: int... numbers
    // 모든 숫자의 합을 반환
    static int sum(int... numbers){
        int total = 0;
        for (int num : numbers){
            total += num;
        }
        return total;
    }


    // TODO: 가변 인수를 사용한 최댓값 찾기 메서드를 작성하세요
    // 메서드명: max, 매개변수: int... numbers
    // 숫자가 없으면 IllegalArgumentException 던지기
    static int max(int... numbers){
        int max2 = 0;
        for (int num : numbers){
            if(max2<num){
                max2 = num;
            }
        }
        return max2;
    }


    // TODO: 가변 인수를 사용한 평균 계산 메서드를 작성하세요
    // 메서드명: average, 매개변수: double... values
    // 값이 없으면 0.0 반환
    static double average(double... values){
        double sum = 0;
        for (double value : values){
            sum += value;
        }
        return sum/values.length;
    }


    public static void main(String[] args) {
        // 다양한 개수의 인수로 호출
        System.out.println("sum() = " + sum());  // 0
        System.out.println("sum(5) = " + sum(5));  // 5
        System.out.println("sum(1,2,3) = " + sum(1, 2, 3));  // 6
        System.out.println("sum(1,2,3,4,5) = " + sum(1, 2, 3, 4, 5));  // 15

        System.out.println("\nmax(10,5,8) = " + max(10, 5, 8));  // 10
        System.out.println("max(3,7,2,9,5) = " + max(3, 7, 2, 9, 5));  // 9

        System.out.printf("\naverage(85.5, 90.0, 78.5) = %.2f\n",
                average(85.5, 90.0, 78.5));

        // 배열을 가변 인수로 전달
        int[] array = {10, 20, 30, 40, 50};
        System.out.println("\n배열 전달: sum(array) = " + sum(array));
    }
}
