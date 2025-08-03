package ch04_3;

public class ThreeNPlusOne {
    public static void main(String[] args) {
        System.out.println("=== 3N+1 시퀀스 프로그램 ===\n");

        // TODO 18: 예제 시퀀스 실행하기
        int start = 3;
        int start2 = 7;
        System.out.println("예제 시퀀스:");
        print3NSequence(start);
        System.out.println();
        print3NSequence(start2);
        System.out.println();

        // TODO 19: 추가 정보 출력하기
        System.out.println("\n추가 정보:");
        System.out.printf("시작값 %d의 시퀀스 길이: %d\n", start, getSequenceLength(start));
        System.out.printf("시작값 %d의 최대값: %d", start, getMaxValue(start));
    }

    // TODO 20: 3N+1 시퀀스 출력 메서드 구현하기
    static void print3NSequence(int startingValue) {
        System.out.print("\n시작값 "+startingValue+"의 3N+1 시퀀스:\n");
        System.out.print(startingValue);
        while(startingValue>1){
            if(startingValue % 2 == 0){
                startingValue /= 2;
            } else{
                startingValue = 3 * startingValue + 1;
            }
            System.out.print(" -> "+startingValue);
        }
    }

   // TODO 21: 시퀀스 길이 계산 메서드 구현하기
    static int getSequenceLength(int startingValue) {
        int count = 1;
        while(startingValue>1){
            if(startingValue % 2 == 0){
                startingValue /= 2;
            } else{
                startingValue = 3 * startingValue + 1;
            }
            count++;
        };

        return count;
    }

    // TODO 22: 시퀀스의 최대값 찾기 메서드 구현하기
    static int getMaxValue(int startingValue) {
        int max = startingValue;

        while(startingValue>1){
            if(startingValue % 2 == 0){
                startingValue /= 2;
            } else{
                startingValue = 3 * startingValue + 1;
            }
            if(startingValue > max){
                max = startingValue;
            }
        };
        return max;
    }
}