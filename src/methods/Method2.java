package methods;

public class Method2 {
    public static void main(String[] args) {
        printHeader();
        System.out.println("프로그램이 동작합니다.");
        printFooter();
    }
    public static void printHeader(){
        System.out.println("= 프로그램을 시작합니다.=");
        return; // void 반환 타입이므로 생략 가능
    }
    public static void printFooter(){
        System.out.println("= 프로그램 종료 =");
    }
}
