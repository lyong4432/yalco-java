package sec02.chap04;

public class Ex04 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = a + b;
        long d = a + b;
//        short e = a + b; // ⚠️ 묵시적으로는 불가
        short f = (short) (a + b);

        byte b1 = 1;
        byte b2 = 2;
        short s1 = 1;
        short s2 = 2;

        //  ⚠️ 아래는 모두 불가
//        byte b3 = b1 + b2;
//        short s3 = b1 + b2;
//        short s4 = b1 + s2;
//        short s5 = s1 + s2;

        //  ⭐ byte와 short의 연산들은 int 반환
        //  그냥 int를 많이 쓰는 이유 중 하나
        int i1 = b1 + b2;
        int i2 = s1 + s2;
        int i3 = b1 + s1;

        // 💡 홀수와 짝수 구분에 널리 사용
        int aa = 1 % 2;
        int bb = 2 % 2;
        int cc = 3 % 2;
        int dd = 4 % 2;
        int ee = 5 % 2;
        int ff = 6 % 2;
        int gg = 7 % 2;
    }
}
