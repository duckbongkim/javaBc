package class1;

public class Null {
    public static void main(String[] args){
        Data data =null;
        System.out.println("Null data: "+ data);

        data = new Data();
        System.out.println("New data: "+data);

        data =null;
        System.out.println("re Null data : "+data);
    }
}
