package class1.Memory;

public class MemoryMain02 {
    public static void main(String[] args) {
        System.out.println("메모리 메인 스타트");
        method1();
        System.out.println("메모리 메인 종료");
    }
    static void method1(){
        System.out.println("메모리메인.매서드1 시작");
        Data data1 = new Data(10);
        method2(data1);
        System.out.println("메모리메인.매서드1 종료");
    }
    
    static void method2(Data data2){
        System.out.println("메모리메인.매서드2 시작");
        System.out.println("데이터.밸류= "+ data2.getValue());
        System.out.println("메모리메인.매서드2 종료");
    }
}
