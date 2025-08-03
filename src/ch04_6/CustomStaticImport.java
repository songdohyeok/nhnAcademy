package ch04_6;

// TODO 23: MathUtils 클래스 만들기
class MathUtils {
    // TODO 24: 황금비 상수 정의하기
    public static final double GOLDEN_RATIO = 1.6180339887;

    // TODO 25: 평균 계산 메서드 구현하기
    public static double average(double... numbers) {
        if(numbers.length==0)
            return 0;
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum/numbers.length;
    }

    // TODO 26: 팩토리얼 계산 메서드 구현하기
    public static int factorial(int n) {
        if(n==0){
            return 1;
        }
        return n * factorial(n-1);

    }

    // TODO 27: 소수 판별 메서드 구현하기
    public static boolean isPrime(int n) {
        if(n<=1){
            return false;
        }
        if(n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i+=2){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
// TODO 28: MathUtils 정적 import하기
public class CustomStaticImport {
    public static void main(String[] args) {

        // TODO 29: MathUtils. 없이 사용하기
        System.out.println("황금비 = " + MathUtils.GOLDEN_RATIO);
        System.out.println("평균(1,2,3,4,5) = " + MathUtils.average(1,2,3,4,5));
        System.out.println("5! = " + MathUtils.factorial(5));
        System.out.println();

        // TODO 30: 1-20 사이의 소수 출력하기
        System.out.println("1-20 사이의 소수: ");
        for(int i=1;i<=20;i++){
            if(MathUtils.isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
}