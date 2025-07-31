package ch02_1;

/**
 * 이 프로그램은 Java의 세 가지 주석 유형을 모두 보여줍니다.
 *
 * @author 홍길동
 * @version 1.0
 * @since 2024-01-01
 */
public class CommentDemo {

    public static void main(String[] args) {
        // TODO: 세 가지 주석을 사용하여 코드를 작성하세요
        // 힌트:
        // 1. 단일 행 주석: // 로 시작
        // 2. 다중 행 주석: /* 로 시작하고 */로 끝
        // 3. 문서화 주석: /** 로 시작하고 */로 끝 (클래스 위에 이미 사용)

        // 단일 행 주석: 프로그램 시작
        System.out.println("주석 예제 프로그램");

        /* 다중 행 주석:
           이 부분은 여러 줄에 걸쳐
           설명을 작성할 수 있습니다. */
        System.out.println("세 가지 주석 유형을 사용했습니다.");

        // int temp = 100;  // 이 코드는 임시로 비활성화됨

        /*
         * 보기 좋게 정렬된
         * 다중 행 주석
         */
        System.out.println("프로그램 종료");
        // "프로그램 종료" 출력

    }  // main 메소드 끝

}  // CommentDemo 클래스 끝