package ch04_5;

import java.util.*;

interface BinaryOperation {
    double calculate(double a, double b);
}

interface UnaryOperation {
    double calculate(double x);
}

class Calculator2 {
    private Map<String, BinaryOperation> binaryOps = new HashMap<>();
    private Map<String, UnaryOperation> unaryOps = new HashMap<>();

    Calculator2() {
        // TODO 59: 이항 연산들 등록하기
         binaryOps.put("+", (a, b) -> a + b);
         binaryOps.put("-", (a, b) -> a - b);
         binaryOps.put("*", (a, b) -> a * b);
         binaryOps.put("/", (a, b) -> a / b);

        // TODO 60: 단항 연산들 등록하기
         unaryOps.put("sqrt", a -> Math.sqrt(a));
         unaryOps.put("abs", a -> Math.abs(a));
         unaryOps.put("square", a -> a * a);
    }

    // TODO 61: calculateBinary 메서드 구현하기
    double calculateBinary(double a, String op, double b) {
        BinaryOperation binaryOp = binaryOps.get(op);
        return binaryOp.calculate(a, b);
    }

    // TODO 62: calculateUnary 메서드 구현하기
    double calculateUnary(String op, double x) {
        UnaryOperation unaryOp = unaryOps.get(op);
        return unaryOp.calculate(x);
    }

    // TODO 63: addBinaryOperation 메서드 구현하기
    void addBinaryOperation(String name, BinaryOperation op) {
        binaryOps.put(name, op);
    }
}

public class CalculatorApp {
    public static void main(String[] args) {
        System.out.println("=== 계산기 애플리케이션 ===\n");

        Calculator2 calc = new Calculator2();

        // TODO 64: 기본 이항 연산 테스트하기
        System.out.println("10 + 5 = " + calc.calculateBinary(10, "+", 5));
        System.out.println("10 * 5 = " + calc.calculateBinary(10, "*", 5));

        // TODO 65: 단항 연산 테스트하기
        System.out.println("sqrt(16) = " + calc.calculateUnary("sqrt", 16));
        System.out.println("square(5) = " + calc.calculateUnary("square", 5));

        // TODO 66: 사용자 정의 연산 추가하고 테스트하기
        calc.addBinaryOperation("avg", (a, b) -> (a + b)/2);
        System.out.println("avg(10, 20) = " + calc.calculateBinary(10, "avg", 20));
    }
}