package oop;

public class ObjectValue {
    int value;

    // 매서드
    void add(int plus){
        value+=plus;
        System.out.println("숫자 증가("+plus+") value="+value);
    }
}
