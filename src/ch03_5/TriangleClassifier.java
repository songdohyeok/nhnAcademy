package ch03_5;

import textio.TextIO;

public class TriangleClassifier {
    public static void main(String[] args) {
        System.out.println("=== 삼각형 판별기 ===");
        System.out.println("세 변의 길이를 입력하세요.");

        System.out.print("변 a: ");
        double a = TextIO.getlnDouble();
        System.out.print("변 b: ");
        double b = TextIO.getlnDouble();
        System.out.print("변 c: ");
        double c = TextIO.getlnDouble();

        // 삼각형 성립 조건 확인
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("변의 길이는 양수여야 합니다!");
        } else if (a + b <= c || b + c <= a || a + c <= b) {
            System.out.println("삼각형을 만들 수 없습니다!");
            System.out.println("(두 변의 합이 나머지 한 변보다 커야 합니다)");
        } else {
            System.out.println("삼각형을 만들 수 있습니다!");

            // TODO: 삼각형 종류 판별
            // 힌트: == 와 || 연산자

            // 여기에 코드를 작성하세요
            if(a == b && b == c){
                System.out.println("종류: 정삼각형");
            } else if(a == b && b != c ){
                System.out.println("종류: a변과 b변이 같은 이등변삼각형");
            }else if(a != b && b == c ){
                System.out.println("종류: b변과 c변이 같은 이등변삼각형");
            } else if(a != b && b != c){
                System.out.println("종류: 일반 삼각형");
            }

            // TODO: 직각삼각형 확인
            // 힌트: a² + b² = c² 등 세 가지 경우

            // 여기에 코드를 작성하세요
            if(Math.abs(a*a + b*b) == Math.abs(c*c)){
                System.out.println("추가: 직각삼각형입니다!");
            }else if(Math.abs(c*c + b*b) == Math.abs(a*a)){
                System.out.println("추가: 직각삼각형입니다!");
            }else if(Math.abs(a*a + c*c) == Math.abs(b*b)){
                System.out.println("추가: 직각삼각형입니다!");
            }
        }
    }
}