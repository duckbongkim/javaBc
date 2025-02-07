package variables;

public class Var8 {
    public static void main(String[] args){
        byte a= -127;
        System.out.println(a);

        short b = 32767;
        System.out.println(b);

        int c = 2147483647;
        System.out.println(c);

        long d = 9223372036854775807L;
        System.out.println(d);

        float f = 10.0f; // 4byte 까지 표현 가능(소수점 7자리 까지 정밀도)
        System.out.println(f);

        double g = 10.0; // 8byte 까지 표현 가능(소수점 15자리 정밀도)
        System.out.println(g);
    }
}
