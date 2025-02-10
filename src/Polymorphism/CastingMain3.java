package Polymorphism;

public class CastingMain3 {
    public static void main(String[] args) {
        Parent parent = new Parent();
        System.out.println("parent 호출");
        call(parent);

        Parent parent1 = new Child();
        System.out.println("parent1 호출");
        call(parent1);
    }

    private static void call(Parent parent){
        //parent.parentMethod();
        if(parent instanceof  Child){
            System.out.println("차일드 인스턴스 맞음");
            Child child=(Child) parent;
            //child.childMethod();
        }
    }
}
