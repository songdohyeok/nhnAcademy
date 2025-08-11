package ch09_2;

import java.sql.Array;
import java.util.ArrayList;

public class IntegerListOperations {

    static class IntNode {
        int value;
        IntNode next;

        IntNode(int value) {
            this.value = value;
        }
    }

    /**
     * 리스트의 합계 계산
     */
    public static int sum(IntNode head) {
        // TODO: 리스트의 모든 값을 합산
        int sum = 0;
        while (head != null){
            sum += head.value;
            head = head.next;
        }

        return sum; // 임시 반환값
    }

    /**
     * 최대값 찾기
     */
    public static int findMax(IntNode head) {
        // TODO: 리스트에서 최대값 찾기
        // 힌트: 빈 리스트 처리 주의
        int max = 0;
        while (head != null){
            if(head.value>max){
                max = head.value;
            }
            head = head.next;
        }

        return max; // 임시 반환값
    }

    /**
     * 짝수만 카운트
     */
    public static int countEvens(IntNode head) {
        // TODO: 짝수인 노드의 개수 카운트
        int count = 0;
        while (head != null){
            if(head.value % 2 == 0){
                count++;
            }
            head = head.next;
        }

        return count; // 임시 반환값
    }

    public static void main(String[] args) {
        // 정수 리스트 생성: 3 → 7 → 2 → 9 → 4 → 6
        IntNode head = new IntNode(3);
        head.next = new IntNode(7);
        head.next.next = new IntNode(2);
        head.next.next.next = new IntNode(9);
        head.next.next.next.next = new IntNode(4);
        head.next.next.next.next.next = new IntNode(6);

        int sum = sum(head);
        int findMax = findMax(head);
        int countEvens = countEvens(head);

        ArrayList<Integer> nodeList = new ArrayList<>();

        while (head != null) {
            nodeList.add(head.value);
            head = head.next;
        }
        System.out.print("리스트: ");

        for(int i = 0; i<nodeList.size();i++){
            System.out.print(nodeList.get(i));
            if(i != nodeList.size() -1){
                System.out.print(" -> ");
            }
        }
        System.out.println();

        System.out.println("합계: "+sum);
        System.out.println("최대값: "+findMax);
        System.out.println("짝수 개수: "+countEvens);

        // 실행 결과:
        // 리스트: 3 → 7 → 2 → 9 → 4 → 6
        // 합계: 31
        // 최대값: 9
        // 짝수 개수: 3
    }
}