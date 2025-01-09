package day02;

public class FloatDoubleEx {

    public static void main(String[] args) {

        double d1 = 0.25;
        double d2 = -3.14;   //10진수 리터럴
        double d3 = 5e2;     //5.0 x 10^2 =500.0
        double d4 = 0.12E-2; //0.12 x 10^-2 = 0.0012

        //컴파일러는 실수 리터럴을 기본적으로 double타입으로 해석하기 때문에
        //double타입 변수에 대입하는 것이 기본

        float f1 = 3.14f;
        float f2 = 3E6F;

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);

        System.out.println(f1);
        System.out.println(f2);
    }
}
