package class1.Memory;

public class DataCountMain2 {
    public static void main(String[] args) {

        Data2 data1 = new Data2("A");
        System.out.println("A count= "+data1.count);


        Data2 data2 = new Data2("B");
        System.out.println("B count= "+data2.count);


        Data2 data3 = new Data2("C");
        System.out.println("C count= "+data3.count); // 인스턴스에서 스테틱 변수에 접근

        System.out.println(Data2.count); // 클래스에서 접근 (구별이 쉬워 많이 사용)
    }
}
