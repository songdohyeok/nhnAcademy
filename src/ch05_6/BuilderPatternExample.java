package ch05_6;

/**
 * 빌더 패턴을 사용한 복잡한 객체 생성
 */
class Pizza {
    private String size;
    private boolean cheese;
    private boolean pepperoni;
    private boolean mushrooms;
    private boolean onions;

    // private 생성자 - 빌더를 통해서만 생성 가능
    private Pizza(Builder builder) {
        this.size = builder.size;
        this.cheese = builder.cheese;
        this.pepperoni = builder.pepperoni;
        this.mushrooms = builder.mushrooms;
        this.onions = builder.onions;
    }

    // 정적 내부 빌더 클래스
    public static class Builder {
        private String size;
        private boolean cheese = true;  // 기본값
        private boolean pepperoni = false;
        private boolean mushrooms = false;
        private boolean onions = false;

        public Builder(String size) {
            this.size = size;
        }

        public Builder cheese(boolean value) {
            // TODO 58: cheese 설정하고 this 반환하기
            this.cheese = value;
            return this;
        }

        public Builder pepperoni(boolean value) {
            // TODO 59: pepperoni 설정하고 this 반환하기
            this.pepperoni = value;
            return this;
        }

        public Builder mushrooms(boolean value) {
            // TODO 60: mushrooms 설정하고 this 반환하기
            this.mushrooms = value;
            return this;
        }

        public Builder onions(boolean value) {
            // TODO 61: onions 설정하고 this 반환하기
            this.onions = value;
            return this;
        }


        public Pizza build() {
            // TODO 62: new Pizza(this)로 피자 객체 생성하여 반환하기
            return new Pizza(this);
        }
    }

    @Override
    public String toString() {
        // TODO 63: 피자 정보를 문자열로 반환하기
        // "[size] 피자" + 선택된 토핑들
        // 예: "Large 피자 + 치즈 + 페퍼로니"
        StringBuilder sb = new StringBuilder(size + " 피자");
        if (cheese) sb.append(" + 치즈");
        if (pepperoni) sb.append(" + 페퍼로니");
        if (mushrooms) sb.append(" + 버섯");
        if (onions) sb.append(" + 양파");
        return sb.toString();
    }
}

// 테스트
public class BuilderPatternExample {
    public static void main(String[] args) {
        // TODO 64: 빌더 패턴을 사용하여 피자 3개 만들기
        // pizza1: Large, 페퍼로니, 버섯
        // pizza2: Medium, 치즈 없음, 양파
        // pizza3: Small, 기본 설정(치즈만)
        Pizza pizza1 = new Pizza.Builder("Large").pepperoni(true).mushrooms(true).build();
        Pizza pizza2 = new Pizza.Builder("Medium").cheese(false).onions(true).build();
        Pizza pizza3 = new Pizza.Builder("Small").build();
        // TODO 65: 주문한 피자들 출력하기
        System.out.println(pizza1.toString());
        System.out.println(pizza2.toString());
        System.out.println(pizza3.toString());
    }
}