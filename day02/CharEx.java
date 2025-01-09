package day02;

public class CharEx {
    public static void main(String[] args) {

        char c1 = 'A';
        char c2 = 65; // 유니코드 직접 저장

        char c3 = '가';
        char c4 = 44032;

        char c =' '; // char 타입 변수 초기화에는 공백을 포함해야함

        System.out.printf("%c %c %c %c",c1,c2,c3,c4);
    }
}
