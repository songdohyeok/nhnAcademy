package ch04_3;

public class PrintOverloading {
    public static void main(String[] args) {
        System.out.println("=== print 메서드 오버로딩 ===\n");

        // TODO 29: 다양한 타입 출력 테스트하기
        print(42);
        print(3.141592);
        print("Hello World");
        print('X');
        print(true);

        // TODO 30: 여러 개 출력 테스트하기
        print(10,20);
        print("Java", 17);
        print(1, 2, 3);

        // TODO 31: 배열 출력 테스트하기
        int[] numbers = {5, 10, 15, 20};
        String[] words = {"Hello", "Java", "World"};
        print(numbers);
        print(words);
    }

    // TODO 32: 단일 값 출력 메서드들 구현하기
    static void print(int value) {
        System.out.printf("[정수] %d\n", value);
    }

    static void print(double value) {
        System.out.printf("[실수] %f\n", value);
    }

    static void print(String value) {
        System.out.printf("[문자열] %s\n", value);
    }

    static void print(char value) {
        System.out.printf("[문자] %c\n", value);
    }

    static void print(boolean value) {
        System.out.printf("[불린] %b\n", value);
    }

    // TODO 33: 여러 값 출력 메서드들 구현하기
    static void print(int a, int b) {
        System.out.printf("[두 정수] %d, %d\n",a, b);
    }

    static void print(String text, int number) {
        System.out.printf("[문자열과 정수] %s, %d\n",text, number);
    }

    static void print(int a, int b, int c) {
        System.out.printf("[세 정수] %d, %d %d\n",a, b,c);
    }

    // TODO 34: 배열 출력 메서드들 구현하기
    static void print(int[] array) {
        System.out.print("[정수 배열] ");
        for(int i = 0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    static void print(String[] array) {
        System.out.print("[문자열 배열] ");
        for(int i = 0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}
