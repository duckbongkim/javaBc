package methods;

public class Method1 {
    public static void main(String[] args){
        int sum1 = add(5, 10);
        // 매서드 호출: add(5,10)
        // int sum1 = 15;
        System.out.println("결과1 출력: "+sum1);

        int sum2 = add (15, 20);
        System.out.println("결과2 출력: "+sum2);


    }
    // public static int add(int a, int b) = method 선언
    // public: 다른 클래스에서 호출할 수 있는 메서드;
    // static: 객체를 생성하지 않고 호출할 수 있는 (정적) 메서드
    // int(type): 반환 타입
    // add(int a, int b): 시그니처
    // add: method의 이름
    // (int a, int b): 매개변수(parameter) 메서드를 호출할때 필요한 값

    // {...} >> method 본문
    // return: 메서드의 반환 결과
    public static int add(int a, int b){
        System.out.println(a+"+"+b+"연산 수행");
        return a+b;
    }
}
