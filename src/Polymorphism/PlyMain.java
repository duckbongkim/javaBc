package Polymorphism;


public class PlyMain {
    public static void main(String[] args) {
        // 부모변수가 부모 인스턴스를 참조
        System.out.println("Parent>>Parent");
        Parent parent = new Parent();
       // parent.parentMethod();

        //자식 변수가 자식 인스턴스를 참조
        System.out.println("Cdhil>>Child");
        Child child = new Child();
       // child.childMethod();
        
        //부모변수가 자식 인스턴스를 참조(다형적 참조)
        System.out.println("Parent>>Child");
        Parent poly = new Child();
        //poly.parentMethod();

        Child child2 = (Child) poly;

        //child2.childMethod();

        //poly.childMethod();
        //Child polyChid = new Parent();


    }
}
