package sec03.chap06;

public class Ex03 {
    public static void main(String[] args) {
        // 문자 반환
        String str1 = "아야 슬슬 오함마 준비해야 쓰것다";

        //  💡 charAt : ~번째 문자 반환
        char ch1 = str1.charAt(0);
        char ch2 = str1.charAt(4);

        //  ⭐️ 마지막 문자 얻기
        char ch3 = str1.charAt(str1.length() - 1);

        // 문자열의 위치 반환
        String str2 = "얄리 얄리 얄라셩 얄라리 얄라";

        //  💡 indexOf/lastIndexOf : 일치하는 첫/마지막 문자열의 위치
        //  앞에서부터 카운트해서 int로 반환

        //  두 번째 인자 : ~번째 이후/이전부터 셈
        int int1 = str2.indexOf('얄'); // 처음 등장한 위치
        int int2 = str2.indexOf('얄', 4); // 4이후에 처음 나오는 위치

        int  int3 = str2.indexOf("얄라");
        int  int4 = str2.lastIndexOf("얄라"); // 마지막으로 등장하는 위치
        int  int5 = str2.lastIndexOf("얄라", 12); // 12 이전에서 마지막

        //  💡 포함되지 않은 문자는 -1 반환
        int int6 = str2.indexOf('욜');
    }
}
