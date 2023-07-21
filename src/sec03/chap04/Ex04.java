package sec03.chap04;

public class Ex04 {
    public static void main(String[] args) {
        // 삼항연산자
        int num1 = 3, num2 = 4;

        char num1OE = num1 % 2 == 1 ? '홀' : '짝';
        char num2OE = num2 % 2 == 1 ? '홀' : '짝';
        System.out.println(num1OE);
        System.out.println(num2OE);
    }
}
