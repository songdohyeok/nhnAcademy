package ch02_4;

import textio.TextIO;

public class ReadFromFile {
    public static void main(String[] args) {
        // TODO: TextIO를 사용하여 파일을 읽어오는 프로그램을 만드세요
        // 힌트:
        // 1. "=== 파일 읽기 프로그램 ===" 출력
        // 2. 파일 이름을 getln()으로 입력받기
        // 3. try-catch로 예외 처리
        // 4. TextIO.readFile()로 파일 입력 모드로 전환
        // 5. while(!TextIO.eof())로 파일 끝까지 읽기
        // 6. 줄 번호와 함께 내용 출력
        // 7. TextIO.readStandardInput()으로 표준 입력으로 복귀

        // 여기에 코드를 작성하세요
        System.out.println("=== 파일 읽기 프로그램 ===");

        System.out.print("읽을 파일 이름: ");
        String fileName = TextIO.getln();

        try {
            TextIO.readFile(fileName);
            System.out.println("\n=== 파일 내용 ===");
            int lineNumber = 1;
            while (!TextIO.eof()) {
                String line = TextIO.getln();
                System.out.printf("%3d: %s%n", lineNumber++, line);
            }
            TextIO.readStandardInput();
            System.out.println("\n파일 읽기 완료!");
        } catch (IllegalArgumentException e) {
            System.out.println("파일을 읽는 중 오류 발생: " + e.getMessage());
        }
    }
}