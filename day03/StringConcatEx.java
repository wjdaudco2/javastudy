package day03;

public class StringConcatEx {
    public static void main(String[] args) {

        int result = 10 + 2 + 8;
        System.out.println("result : " + result);

        //결합연산
        String result1 = 10 + 2 + "8"; // 10+2 12, "8"은 8 그대로 출력
        String result2 = 10 + "2" + 8; // 연산하지 않음
        String result3 = "10" + 2 + 8; // 연산은 왼쪽부터 실행되어야하지만 "10"이 있어서 뒤 2+8도 연산하지 않음

        System.out.println("result : " + result1);
        System.out.println("result : " + result2);
        System.out.println("result : " + result3);
    }
}
