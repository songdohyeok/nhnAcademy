package ch04_6;

// TODO 44: 필요한 import문 추가하기

import java.util.*;

public class CollectionsAPIExample {
    public static void main(String[] args) {
        // TODO 45: List API 사용하기
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("사과");
        fruits.add(("바나나"));
        fruits.add("포도");
        System.out.println("=== List API ===");
        System.out.println("과일 목록: " + fruits);
        System.out.println("첫 번째 과일: " + fruits.getFirst());
        System.out.println("과일 개수: " + fruits.size());

        // TODO 46: Set API 사용하기
        Set<Integer> numbers = new HashSet<>(Arrays.asList(1, 1, 2, 3, 4));
        System.out.println("\n=== Set API ===");
        System.out.println("고유 숫자: " + numbers);
        System.out.println("3이 있나요? " + numbers.contains(3));

        // TODO 47: Map API 사용하기
        Map<String,Integer> scores = new HashMap<>();
        scores.put("김철수", 90);
        scores.put("이영희", 85);
        scores.put("박민수 ", 92);

        System.out.println("\n=== Map API ===");
        System.out.println("점수표: " + scores);
        System.out.println("김철수의 점수: " + scores.get("김철수"));

        // TODO 48: Collections 유틸리티 사용하기
        List<Integer> list = Arrays.asList(3, 1, 4, 1, 5);

        Collections.sort(list);
        System.out.println();
        System.out.println("정렬된 리스트: " + list);
        System.out.println("최대값: " + Collections.max(list));
        System.out.println("최소값: " + Collections.min(list));
    }
}
