package day02;

public class BooleanEx {
    public static void main(String[] args) {
        // 참과 거짓을 의미하는 논리 리터럴 true, false 이다
        // 두 가지 상태값을 저장할 필요가 있을 경우, 상태값에 따라 조건문과 제어문의 실행 흐름을변경하는데 사용
        // 연산식 중 비교, 논리 연산의 산출값을 판단할 때 사용

        boolean stop = false;
        boolean start = true;

        if(stop){
            System.out.println("STOP");
        }else {
            System.out.println("GO");
        }

        /*while(true){

        }*/

        int bool = 10;

        boolean result = (bool == 20);       // 변수 bool의 값이 20인가요?
        System.out.println(result);

        result = (bool != 20);                 // 변수 bool의 값이 20이 아닌가요?
        System.out.println(result);

        result = (bool < 20);                 // 변수 bool의 값이 20보다 큰가요?
        System.out.println(result);

        result = (bool > 20);                // 변수 bool의 값이 20이 아닌가요?
        System.out.println(result);

        result = (0 < bool && bool < 20);    // 변수 bool의 값이 0보다 크고 20보다 작은가요?
        System.out.println(result);

        result = (0 < bool || bool < 20);    // 0보다 크고 20보다 작은가요?
        System.out.println(result);
    }
}
