package sec03.chap01;

public class Ex01 {
    public static void main(String[] args) {
        byte    _1b_byte = 1;
        short   _2b_short = 2;
        int     _4b_int = 3; // ⭐️ 일반적으로 널리 사용
        long    _8b_long = 4;

        //  ⚠️ 자료형의 범주 외의 수를 담을 수 없음
        //  💡 묵시적(암시적) 형변환
        // byte     -   1바이트(8비트)   - -128 ~ 127
        // short    -  2바이트          - -32,768 ~ 32,767
        // int      -  4바이트          - -2,147,483,648 ~ 2,147,483,647
        // long     -  8바이트          - -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807

        //  ⭐ int의 범위를 벗어나는 수에는 리터럴에도 명시 필요
        //  끝에 l 또는 L을 붙여 볼 것
//        long _8b_long1 = 123456789123456789;

        //  💡 가독성을 위해 아래와 같이 표현 가능 (자바7부터)
        int _4b_int2 = 123_456_789;
        long _8b_long2 = 123_456_789_123_456_789L;

        System.out.println(_4b_int2);
        System.out.println(_8b_long2);
    }
}
