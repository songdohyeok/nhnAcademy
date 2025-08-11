
package ch09_2;

public class SortedStringList {

    private Node head;

    private static class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
        }
    }

    /**
     * 정렬된 순서로 삽입
     */
    public void insert(String data) {
        // TODO: 알파벳 순서로 정렬된 위치에 삽입
        // 힌트:
        // 1. 빈 리스트나 맨 앞에 삽입하는 경우
        // 2. 중간이나 끝에 삽입하는 경우
        // compareTo() 메서드 사용
        Node newNode = new Node(data); // 헤드가 없으면 새로운 노드가 헤드
        if(head == null){
            head = newNode;
            return;
        }

        if(head.data.compareTo(data) >= 0){ // 헤드의 데이터가 새로 들어올 데이터보다 알파벳이 크면 새로 들어올 노드를 맨 앞으로
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;

        //헤드의 다음 노드가 널이 아니고 헤드의 다음 노드의 데이터가 새로 들어올 데이터보다 작아서 새로들어올 노드가 헤드의 다음 노드의 뒤로
        while (current.next != null && current.next.data.compareTo(data) < 0) {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;


    }

    /**
     * 정렬된 리스트에서 효율적 검색
     */
    public boolean containsOptimized(String data) {
        // TODO: 정렬된 특성을 활용한 검색
        // 힌트: 찾는 값보다 큰 값이 나오면 조기 종료
        while(head.next != null) {
            if (head.data.contains(data)) {
                return true;
            }
            head = head.next;
        }
        return false; // 임시 반환값
    }

    @Override
    public String toString() {
        if (head == null) return "[]";

        StringBuilder sb = new StringBuilder("[");
        Node runner = head;

        while (runner != null) {
            sb.append(runner.data);
            if (runner.next != null) {
                sb.append(", ");
            }
            runner = runner.next;
        }

        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        SortedStringList list = new SortedStringList();

        // 무작위 순서로 삽입
        list.insert("Dog");
        list.insert("Cat");
        list.insert("Elephant");
        list.insert("Bird");
        list.insert("Ant");

        // 실행 결과:
        System.out.println(list);
        // 정렬된 리스트: [Ant, Bird, Cat, Dog, Elephant]
        System.out.println(list.containsOptimized("Cat"));
        // 'Cat' 검색: true
        System.out.println(list.containsOptimized("Fish"));
        // 'Fish' 검색: false
    }
}
