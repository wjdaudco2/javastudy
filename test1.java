import java.util.Scanner;

public class test1 {
    // 문제 : for문을 이용하여 1-100까지의 합을 구하는 결과 출력

    public static void main(String[] args) {
        System.out.println("1부터 입력된 숫자의 합\n");

        Scanner in = new Scanner(System.in);
           System.out.println("end number input: ");
            int in1 = in.nextInt();

            int sum = 0;
            for (int i =1; i <=in1; i++){
                sum += i;
            }

            System.out.println("sum = " +sum);
    }
}
