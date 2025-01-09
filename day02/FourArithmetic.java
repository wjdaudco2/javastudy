package day02;
// 두 개의 정수를 사칙연산 하여 출력하는 프로그램


public class FourArithmetic {
    public static void main(String[] args) {
        int a = 12;
        int b = 2;

        System.out.println("a+b ="+ p(a,b));
        System.out.println("a-b ="+ m(a,b));
        System.out.println("a*b ="+ x(a,b));
        System.out.println("a/b ="+ d(a,b));

    }
    public static int p(int a, int b){
        return a + b;
    }
    public static int m(int a, int b){
        return a - b;
    }
    public static int x(int a, int b){
        return a * b;
    }
    public static int d(int a, int b){
        return a / b;
    }

}
