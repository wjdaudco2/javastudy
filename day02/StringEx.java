package day02;

public class StringEx {
    public static void main(String[] args) {

        // '' 로 감싼 문자는 char(정수타입)
        // "" 로 감싼 여러개의 문자들은 유니코드로 변환되지 않는다.

        char v1 = 'A';
        String v2 = "홍장군";

        String v3 = new String("홍길동");
        String v4 = "홍장군";

        System.out.printf("%c %s %s %n", v1,v2,v3);
        System.out.println(v2.hashCode());
        System.out.println(v3.hashCode());
        System.out.println(v4.hashCode());
    }
}
