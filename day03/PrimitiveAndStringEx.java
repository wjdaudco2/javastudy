package day03;

public class PrimitiveAndStringEx {
    public static void main(String[] args) {
        int value1 = Integer.parseInt("10");
        // 자바 Integer클래스에서 제공하는 래퍼클래스 parseInt로 문자열을 정수로 변환
        double value2 = Double.parseDouble("3.14");
        boolean value3 = Boolean.parseBoolean("true");

        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);

        // 정수 -> 문자열 로 변환
        String str1 = String.valueOf(10);
        String str2 = String.valueOf(3.14);
        String str3 = String.valueOf(true);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

    }
}
