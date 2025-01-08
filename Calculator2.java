import javax.net.ssl.SSLServerSocket;
import java.util.Scanner;

public class Calculator2 {
        // 1+1=?
    public static void main(String[] args) {
        //1. 데이터 자유 입력
        Scanner in = new Scanner(System.in);

            System.out.println("first number input: ");
            int in1 = in.nextInt();
            System.out.println("second number input: ");
            int in2 = in.nextInt();
            int sum = in1 + in2;
            System.out.println("sum = " + sum);
    }
}
