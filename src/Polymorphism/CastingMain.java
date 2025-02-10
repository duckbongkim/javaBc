package Polymorphism;

public class CastingMain {
    public static void main(String[] args) {
        // 부모 타입의 변수가 자식 인스턴스를 참조
        Parent poly = new Child();

        //poly.childMetod();
        
        //일시적 다운캐스팅
       // ((Child) poly).childMethod();
        
    }
}
