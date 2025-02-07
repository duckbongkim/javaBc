package class1.Memory;

public class Data1 {
    public String name;
    //public int count;

    public Data1(String name, Counter counter){
        this.name = name;
        counter.count++;
    }
}
