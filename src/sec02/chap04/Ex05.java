package sec02.chap04;

public class Ex05 {
    public static void main(String[] args) {
        int a = 1;
        a = a + 2;

        a += 3; // 🔴

        // 값을 반환하기도 함
        int b = a += 4; // 🔴

    }
}
