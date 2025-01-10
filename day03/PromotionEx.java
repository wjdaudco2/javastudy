package day03;
//강제타입의 목적은 원래 값이 유지되면서 타입을 바꾸기 위해 사용한다.
// 작은 허용 범위 타입에 저장될 수 있는 값을 가지고 강제타입 변환을 해야만 원래 목적을 달성할 수 있다.

public class PromotionEx {
    public static void main(String[] args) {

        char charValue = '가';
        int intValue = charValue;
        char charValue1 = (char)intValue;
        //char 타입의 경우 int 타입으로 자동 변환되면 유키토드 값이 int타입에 대입된다.
        System.out.println("'가'의 유니코드 값 ="+intValue);
        System.out.println(charValue1);

        intValue = 100;
        long longValue = intValue;

        float floatValue = 100.5f;
        double doubleValue = floatValue;
        System.out.println(floatValue);
        System.out.println(doubleValue);

    }
}
