package ch03_7;

import textio.TextIO;

public class NumberFileGeneratorExample {
    public static void main(String[] args) {
        System.out.println("=== 숫자 파일 생성기 ===");

        try {
            String fileName = createNumberFile();
            System.out.println("✅ 파일 생성 완료: " + fileName);

            // 생성된 파일 읽어보기
            readAndVerifyFile(fileName);

        } catch (Exception e) {
            System.out.println("❌ 프로그램 실행 중 오류: " + e.getMessage());
        }
    }

    public static String createNumberFile() {
        System.out.print("생성할 파일 이름: ");
        String fileName = TextIO.getln();

        System.out.print("숫자 개수: ");
        int count = getValidInteger("숫자 개수는 1-1000 사이여야 합니다", 1, 1000);

        System.out.print("최소값: ");
        double min = getValidDouble("최소값을 입력하세요");

        System.out.print("최대값: ");
        double max = getValidDouble("최대값을 입력하세요");

        if (min > max) {
            System.out.println("최소값과 최대값을 교환합니다.");
            double temp = min;
            min = max;
            max = temp;
        }

        // 파일 생성 (시뮬레이션)
        System.out.println("\n📝 파일 생성 중...");
        for (int i = 1; i <= count; i++) {
            double randomNumber = min + Math.random() * (max - min);
            System.out.printf("숫자 %d: %.2f (파일에 저장됨)%n", i, randomNumber);

            if (i % 10 == 0) {
                System.out.println("   ... " + i + "개 저장됨");
            }
        }

        return fileName;
    }

    public static int getValidInteger(String errorMessage, int min, int max) {
        while (true) {
            // TODO: 범위 내 정수 입력 받기
            // 힌트: parseInt() 사용

            // 여기에 코드를 작성하세요
            try {
                int num = Integer.parseInt(TextIO.getln().trim());
                if (num < min || num > max) {
                    System.out.println(errorMessage);
                    System.out.println("다시입력: ");
                    continue;
                } return num;

            }catch(NumberFormatException e){
                System.out.println("숫자를 입력하세요%n다시입력:");
            }

        }
    }

    public static double getValidDouble(String prompt) {
        while (true) {
            // TODO: 실수 입력 받기
            // 힌트: parseDouble() 사용

            // 여기에 코드를 작성하세요
            try{
                return Double.parseDouble(TextIO.getln().trim());
            } catch (NumberFormatException e) {
                System.out.println("유효한 실수를 입력하세요");
            }

        }
    }

    public static void readAndVerifyFile(String fileName) {
        System.out.println("\n🔍 생성된 파일 검증 중...");

        try {
            // 실제로는 TextIO.readFile(fileName)을 호출
            System.out.println("✅ 파일 읽기 성공");

            // 시뮬레이션된 검증
            System.out.println("📊 검증 결과:");
            System.out.println("• 파일 형식: 올바름");
            System.out.println("• 데이터 무결성: 통과");
            System.out.println("• 접근 권한: 정상");

        } catch (IllegalArgumentException e) {
            System.out.println("❌ 생성된 파일을 읽을 수 없습니다: " + e.getMessage());
        }
    }
}