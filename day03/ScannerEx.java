package day03;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("x의 값 입력: ");
        String strX = sc.nextLine();
        // strX 변수 값을 숫자 값으로 변경하여 int x에 저장하려면?
        int x = Integer.parseInt(strX); // strX값을 int x에 저장한다
        System.out.println(x);

        System.out.println("y의 값 입력: ");
        String strY = sc.nextLine();
        int y =Integer.parseInt(strY);
        System.out.println(y);
        // 문자열은 연산이 되지 않기 때문에 알맞은 타입으로 캐스팅기능을 제공하는 각 래퍼클래스를 활용하여 변경


    }
}
