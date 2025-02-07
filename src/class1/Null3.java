package class1;

public class Null3 {
    public static void main(String[] args) {
        BigData bigData =new BigData();
        System.out.println("bigData.count: "+bigData.count);
        System.out.println("bigData.data: "+ bigData.data);
        bigData.data = new Data();
        System.out.println("bigdata.data.value: "+bigData.data.value);
    }
}
