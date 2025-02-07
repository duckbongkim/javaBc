package class1.encapsulation;

public class MaxCounter {

    private int count=0;
    private int max;

    public MaxCounter(int max){
        this.max = max;
    }

    public void increment(){
        if(count>=max){
            System.out.println(max+", 최대값 초과");
        }else{
            count++;
        }
    }

    public void getCount(){
        System.out.println(count);
    }
}
