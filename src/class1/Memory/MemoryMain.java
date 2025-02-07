package class1.Memory;

public class MemoryMain {
    public static void main(String[] args) {
        System.out.println("메모리 메인 스타트");
        method1(10);
        System.out.println("메모리 메인 종료");
    }
    static void method1(int m1){
        System.out.println("메모리메인.매서드1 시작");
        int cal =m1*2;
        method2(cal);
        System.out.println("메모리메인.매서드1 종료");
    }
    
    static void method2(int m2){
        System.out.println("메모리메인.매서드2 시작");
        System.out.println("메모리메인.매서드2 종료");
    }
}
