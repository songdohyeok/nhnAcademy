package ch04_3;

public class ThreeNPlusOneStats {
    public static void main(String[] args) {
        System.out.println("=== 3N+1 통계 분석 ===\n");
        // 범위 분석하기
        analyzeRange(1, 10);

        // 가장 긴 시퀀스 찾기
        findLongestSequence(1, 20);
    }

    // TODO 25: 범위 내 모든 수의 시퀀스 분석 메서드 구현하기
    static void analyzeRange(int start, int end) {
        System.out.printf("%d부터 %d까지의 시퀀스 길이:\n",1, 10);
        System.out.println("시작값 길이 최대값");

        for(int i = start; i<=end; i++){
            System.out.printf("%d\t %d\t %d\n",i,getSequenceLength(i),getMaxValue(i));
        }
    }

    // TODO 26: 가장 긴 시퀀스 찾기 메서드 구현하기
    static void findLongestSequence(int start, int end) {
        int maxLengthNumber = 0;
        int maxStartNumber = 0;

        for(int i = start; i<=end; i++){
            if(getSequenceLength(i) > maxLengthNumber){
                maxLengthNumber = getSequenceLength(i);
                maxStartNumber = i;
            }
        }


        System.out.println("=== 가장 긴 시퀀스 ===");
        System.out.printf("범위: %d ~ %d\n",start, end);
        System.out.printf("시작값: %d\n", maxStartNumber);
        System.out.printf("길이: %d",maxLengthNumber);

    }

    // TODO 27: 시퀀스 길이 계산 메서드 재구현하기
    static int getSequenceLength(int startingValue) {
        int count = 1;
        while(startingValue>1){
            if(startingValue % 2 == 0){
                startingValue /= 2;
            }else{
                startingValue = (startingValue * 3) + 1;
            }
            count++;
        }
        return count;
    }

    // TODO 28: 최대값 계산 메서드 재구현하기
    static int getMaxValue(int startingValue) {
        int max = startingValue;
        while(startingValue>1){
            if(startingValue % 2 == 0){
                startingValue /= 2;
            }else{
                startingValue = (startingValue * 3) + 1;
            }
            if(startingValue>max){
                max = startingValue;
            }
        }
        return max;
    }
}

