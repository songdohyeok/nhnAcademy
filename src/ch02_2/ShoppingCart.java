package ch02_2;

public class ShoppingCart {
    public static void main(String[] args) {
        // TODO: 상품 정보를 저장할 변수들을 선언하세요
        // 힌트:
        // 상품 1: 노트북, 가격 1299.99, 수량 1
        // 상품 2: 마우스, 가격 29.99, 수량 2
        // 상품 3: 키보드, 가격 89.99, 수량 1
        // 각 상품마다 Name, Price, Quantity 변수 사용

        // TODO: 각 상품의 소계를 계산하세요
        // 힌트:
        // 1. subtotal1 = item1Price * item1Quantity
        // 2. subtotal2 = item2Price * item2Quantity
        // 3. subtotal3 = item3Price * item3Quantity
        // 4. subtotal = 모든 소계의 합

        // TODO: 할인과 세금을 계산하세요
        // 힌트:
        // 1. discountRate = 0.10 (10% 할인)
        // 2. taxRate = 0.08 (8% 세금)
        // 3. discount = subtotal * discountRate
        // 4. afterDiscount = subtotal - discount
        // 5. tax = afterDiscount * taxRate
        // 6. total = afterDiscount + tax

        // TODO: 영수증을 출력하세요
        // 힌트:
        // 1. "=== 쇼핑 카트 ===" 출력
        // 2. 헤더: "상품명\t\t단가\t수량\t소계" (탭 사용)
        // 3. 구분선: "----------------------------------------"
        // 4. 각 상품 정보를 탭으로 정렬하여 출력
        // 5. 구분선 출력
        // 6. 소계, 할인, 세금 출력
        // 7. "========================================" 출력
        // 8. 총액 출력

        // TODO: 결제 방법을 출력하세요
        // 힌트:
        // 1. useCredit = true (신용카드 사용 여부)
        // 2. 삼항 연산자로 "\n결제 방법: " + (useCredit ? "신용카드" : "현금") 출력

        // 여기에 코드를 작성하세요
        String item1Name = "노트북";
        double item1Price = 1299.99;
        int item1Quantity = 1;

        String item2Name = "마우스";
        double item2Price = 29.99;
        int item2Quantity = 2;

        String item3Name = "키보드";
        double item3Price = 89.99;
        int item3Quantity = 1;

        double subtotal1 = item1Price * item1Quantity;
        double subtotal2 = item2Price * item2Quantity;
        double subtotal3 = item3Price * item3Quantity;
        double subtotal = subtotal1 + subtotal2 + subtotal3;

        double discountRate = 0.10;
        double taxRate = 0.08;
        double discount = subtotal * discountRate;
        double afterDiscount = subtotal - discount;
        double tax = afterDiscount * taxRate;
        double total = afterDiscount + tax;

        System.out.println("=== 쇼핑 카트 ===");
        System.out.println("상품명\t단가\t\t수량\t소계");
        System.out.println("----------------------------------------");
        System.out.printf("%s\t%.2f\t%d\t%f%n", item1Name, item1Price, item1Quantity, subtotal1);
        System.out.printf("%s\t%.2f\t%d\t%f%n", item2Name, item2Price, item2Quantity, subtotal2);
        System.out.printf("%s\t%.2f\t%d\t%f%n", item3Name, item3Price, item3Quantity, subtotal3);
        System.out.println("----------------------------------------");
        System.out.printf("소계: %.2f 할인가: %.2f 세금: %.2f%n", subtotal, afterDiscount, tax);
        System.out.println("----------------------------------------");
        System.out.printf("총액: %.2f%n", total);

        boolean useCredit = true;
        System.out.print("\n결제 방법: " + (useCredit ? "신용카드" : "현금"));
    }
}