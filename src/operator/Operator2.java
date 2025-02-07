package operator;

public class Operator2 {
    public static void main(String[] args) {
        //문자열+물자열 더하기
        String result1 = "hello"+"world";
        System.out.println(result1);

        //문자열 + 숫자열 >> 숫자를 문자열로 인식.
        String result2 = "a + b = ";
        int num1 = 10;
        System.out.println(result2+num1);

    }
}
