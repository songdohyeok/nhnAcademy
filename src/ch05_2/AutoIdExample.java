package ch05_2;

/**
 * 자동 ID 생성 기능이 있는 Product 클래스
 */
class Product {
    // TODO 64: static 변수 선언하기
    private static int nextProductId = 1000;
    private static int totalProducts = 0;

    // TODO 65: 인스턴스 변수 선언하기
    private final int productId;
    private String name, category;
    private double price;
    private boolean inStock;

    // TODO 66: 생성자 구현하기
    public Product(String name, double price, String category) {
        // name이 null이거나 비어있으면 "상품명은 필수입니다." 예외
        // price가 0보다 작으면 "가격은 0 이상이어야 합니다." 예외
        // productId = nextProductId++ (자동 ID 할당)
        // this.name = name, this.price = price
        // category가 null이면 "기타"로 설정
        // inStock = true
        // totalProducts 증가
        // "상품 생성: ID=[ID], 이름=[이름]" 출력
        if(name == null || name.isEmpty()){
            throw new IllegalArgumentException("상품명은 필수입니다.");
        }
        if(price <0){
            throw new IllegalArgumentException("가격은 0 이상이어야 합니다.");
        }
        productId = nextProductId++;;
        this.name = name;
        this.price = price;
        if(this.category == null){
            this.category = "기타";
        }
        inStock = true;
        totalProducts++;
        System.out.printf("상품 생성: ID=%s, 이름=%s\n",productId, name);
    }

    // TODO 67: static 메서드들 구현하기
    public static int getTotalProducts() { return totalProducts;}
    public static int getNextProductId() { return nextProductId; }
    public static void resetIdCounter(int startId) {
        nextProductId = startId;
    }

    // TODO 68: getter 메서드들 구현하기
    public int getProductId() { return productId; }
    public String getName() { return name;}
    public double getPrice() { return price; }
    public String getCategory() { return category; }
    public boolean isInStock() { return inStock; }

    // TODO 69: setter 메서드들 구현하기 (ID는 final이므로 setter 없음)
    public void setName(String name) {
        // name이 null이 아니고 비어있지 않으면 설정
        if(name == null || name.isEmpty()){
            this.name = name;
        }
    }

    public void setPrice(double price) {
        // price가 0 이상이면 설정
        if(price>0){
            this.price = price;
        }
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    // TODO 70: 정보 출력 메서드 구현하기
    public void displayInfo() {
        // "ID: [ID], 상품명: [이름], 가격: [가격]원, 카테고리: [카테고리], 재고: [있음/없음]" 출력
        System.out.printf("ID: %s, 상품명: %s, 가격: %.1f원, 카테고리: %s, 재고: %b\n",productId, name, price, category, inStock);
    }
}

// TODO 71: 사용 예제 완성하기
public class AutoIdExample {
    public static void main(String[] args) {
        System.out.println("=== 자동 ID 생성 시스템 ===");

        // TODO 72: 여러 상품 생성하기
        // product1: "노트북", 1500000, "전자제품"
        // product2: "마우스", 25000, "전자제품"
        // product3: "의자", 150000, "가구"
        // product4: "책", 15000, "도서"

        Product product1 = new Product("노트북", 1500000, "전자제품");
        Product product2 = new Product("마우스", 25000, "전자제품");
        Product product3 = new Product("의자", 150000, "가구");
        Product product4 = new Product("책", 15000, "도서");

        // TODO 73: 상품 정보 출력하기
        System.out.println("\n=== 상품 정보 ===");
        // 모든 상품의 displayInfo() 호출
        product1.displayInfo();
        product2.displayInfo();
        product3.displayInfo();
        product4.displayInfo();

        // TODO 74: 통계 정보 출력하기
        System.out.println("\n=== 통계 정보 ===");
        // "총 생성된 상품 수: [개수]", "다음 상품 ID: [ID]" 출력
        System.out.printf("총 생성된 상품 수: "+Product.getTotalProducts()+"\n다음 상품 ID: %s\n",Product.getNextProductId());

        // TODO 75: ID 카운터 재설정 테스트하기
        System.out.println("\n=== ID 카운터 재설정 ===");
        // resetIdCounter(5000) 호출
        Product.resetIdCounter(5000);
        // product5: "키보드", 80000, "전자제품" 생성
        Product product5 = new Product("키보드", 80000, "전자제품");
        // product5 정보 출력
        product5.displayInfo();
        // 총 상품 수 출력
        System.out.printf("총 상품 수: "+Product.getTotalProducts());

    }
}
