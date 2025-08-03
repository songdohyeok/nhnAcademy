package ch04_3;

public class ActualParameters {
    public static void main(String[] args) {
        System.out.println("=== 실제 매개변수 예제 ===\n");

        // TODO 11: 리터럴 값 전달하기
        calculate(10,20);

        // TODO 12: 변수 전달하기
        int x = 15;
        int y = 25;
        calculate(x,y);

        // TODO 13: 표현식 전달하기
        calculate(10+10, 10*5);

        // TODO 14: 메서드 반환값 전달하기
        calculate((getNumber()),2);

        // TODO 15: 복잡한 표현식 전달하기
        calculate(x * 2 + 12, y / 5 - 3);
    }

    // TODO 16: calculate 메서드 구현하기
    static void calculate(int first, int second){
        System.out.printf("%d + %d = %d\n",first, second, first+second);
        System.out.printf("%d - %d = %d\n",first, second, first-second);
        System.out.println();
    }

    // TODO 17: getNumber 메서드 구현하기
    static int getNumber() {
        return 20;
    }
}