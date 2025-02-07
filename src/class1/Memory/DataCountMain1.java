package class1.Memory;

public class DataCountMain1 {
    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Data1 data1 = new Data1("A",counter1);
        System.out.println("A count= "+counter1.count);

        Counter counter2 = new Counter();
        Data1 data2 = new Data1("B",counter2);
        System.out.println("B count= "+counter2.count);

        Counter counter3 = new Counter();
        Data1 data3 = new Data1("C",counter3);
        System.out.println("C count= "+counter3.count);
    }
}
