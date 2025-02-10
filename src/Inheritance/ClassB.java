package Inheritance;

public class ClassB extends ClassA {
    public ClassB(int a){
        super(); // 자신이 상속박은 생성자를 의미 기본생성자인경우 super 가 없어도됨
        System.out.println("ClassB.ClassB"+a);
    }

    public ClassB(int a, int b){
        super();
        System.out.println("ClassB.ClassB : " + a+b);
    }
}
