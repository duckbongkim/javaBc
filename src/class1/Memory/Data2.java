package class1.Memory;

public class Data2 {
    public String name;
    public static int count;

    public Data2(String name){
        this.name = name;
        count++;
    }

    //지역 변수 >> 스택영역에서 관리됨

    // 매서드 영역 >> 클래스 변수 >> 시작: jvm시작 || 종료: jvm종료
    // 힙 영역 >> 인스턴스 변수 >> 시작: 인스턴스 생성 || 종료: 인스턴스 종료
}
