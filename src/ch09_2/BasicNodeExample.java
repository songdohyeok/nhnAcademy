package ch09_2;

public class BasicNodeExample {

    /**
     * 문자열을 저장하는 노드
     */
    static class Node {
        String data;
        Node next;

        public Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    /**
     * 노드 체인 출력하기
     */
    public static void printChain(Node head) {
        // TODO: 연결된 노드들을 순서대로 출력
        // 힌트: current가 null이 될 때까지 반복
        System.out.print("노드 체인: ");
        while(head != null) {
            System.out.print("Node["+head.data+"]");
            head = head.next;
            if(head != null) {
                System.out.print(" -> ");
            }
        }
    }

    /**
     * 체인의 길이 계산
     */
    public static int getChainLength(Node head) {
        // TODO: 연결된 노드의 개수 반환
        int count = 0;
        if(head != null){
            count = 1 + getChainLength(head.next);
        }

        return count;// 임시 반환값
    }

    public static void main(String[] args) {
        // 노드 체인 만들기
        Node first = new Node("첫번째");
        Node second = new Node("두번째");
        Node third = new Node("세번째");

        first.next = second;
        second.next = third;

        printChain(first);
        System.out.println("\n체인 길이: "+getChainLength(first));


        // 실행 결과:
        // 노드 체인: Node[첫번째] → Node[두번째] → Node[세번째]
        // 체인 길이: 3
    }
}