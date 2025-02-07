package operator;

public class OperatorAdd1 {
    public static void main(String[] args){
        int a = 0;

        // 1씩 증가
        a = a+1;
        System.out.println("a = "+a);

        a += 1;
        System.out.println("a = "+a);


        //증감연산
        ++a; // a = a+1
        System.out.println(a);

        --a;
        System.out.println(a);
    }
}
