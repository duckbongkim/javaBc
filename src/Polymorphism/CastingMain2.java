package Polymorphism;

public class CastingMain2 {
    public static void main(String[] args) {
        Parent parent = new Child(); // 업케스팅
        Child child = (Child) parent; // 다운캐스팅
       // child.childMethod(); // 다운캐스팅 >> 문제 없음

        Parent parent1 = new Parent();
        Child child1 = (Child) parent1; // ClassCastException
        //child1.childMethod();
        
    }
}
