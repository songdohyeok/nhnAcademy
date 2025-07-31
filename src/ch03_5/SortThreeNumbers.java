package ch03_5;

import textio.TextIO;

public class SortThreeNumbers {
    public static void main(String[] args) {
        System.out.println("세 개의 숫자를 입력하면 오름차순으로 정렬합니다.");

        System.out.print("첫 번째 숫자: ");
        int x = TextIO.getlnInt();
        System.out.print("두 번째 숫자: ");
        int y = TextIO.getlnInt();
        System.out.print("세 번째 숫자: ");
        int z = TextIO.getlnInt();

        System.out.print("\n정렬 결과: ");

        // TODO: 세 수 정렬 로직
        // 힌트: x가 가장 작은/큰/중간인 경우로 나누어 처리

        // 여기에 코드를 작성하세요
        if(x<=y && y<=z){
            System.out.printf("%d %d %d%n",x,y,z);
        }else if(x<=z && z<=y){
            System.out.printf("%d %d %d%n",x,z,y);
        }else if(y<=x && x<=z){
            System.out.printf("%d %d %d%n",y,x,z);
        }else if(z<=x && x<=y){
            System.out.printf("%d %d %d%n",z,x,y);
        }else if(z<=y && y<=x){
            System.out.printf("%d %d %d%n",z,y,x);
        }else if(y<=z && z<=x){
            System.out.printf("%d %d %d%n",y,z,x);
        }

        // TODO: 추가 정보 계산
        // 힌트: min과 max 변수 사용
        int min = 0;
        int max = 0;


        // 여기에 코드를 작성하세요
        if(x<=y && y<=z){
            min = x;
            max = z;
        }else if(x<=z && z<=y){
            min = x;
            max = y;
        }else if(y<=x && x<=z){
            min = y;
            max = z;
        }else if(z<=x && x<=y){
            min = z;
            max = y;
        }else if(z<=y && y<=x){
            min = z;
            max = x;
        }else if(y<=z && z<=x){
            min = y;
            max = x;
        }

        System.out.printf("최솟값: %d\n최댓값: %d\n범위: %d",min,max,max-min);

    }
}