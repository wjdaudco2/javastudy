package day02;

import java.util.Scanner;

// "Hello Java" 문자열을 출력하는 HelloJava 클래스를 작성하세요
public class HelloJava {
/*    public static void main(String[] args) {
        System.out.println("HelloJava");
    }
 */

// "Hello Java"를 출력한 후 사용자에게 이름을 입력받아 "Hello ㅇㅇ" 출력하세요
    public static void main(String[] args) {
        System.out.println("Hello Java\n");
        callName();

        Scanner in = new Scanner(System.in); //기
        System.out.println("이름을 입력하세요.");
        String name = in.nextLine();

        System.out.println("Hello " + name);
        callName();

        String eat = callStringName();
        System.out.println(eat);
        eat = eat + "맛있어";
        System.out.println(eat);

        callStringParam(eat);
    }

    public static void callName() {
        System.out.println("내 이름");
    }

    public static String callStringName(){
        String name = "라면";
        return name;
    }

    public static void callStringParam(String eat){
        System.out.println(eat + " callString Param 처리 완료");

    }

}
