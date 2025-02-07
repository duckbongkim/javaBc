package oop;

public class oop02 {
    public static void main(String[] args){
        ObjectValue data = new ObjectValue();
        data.add(5);
        data.add(2);
        data.add(-5);
        System.out.println("최종숫자: "+ data.value);
    }

//    static void add(Data data){
//        data.value++;
//        System.out.println("숫자 증가 : value =  "+data.value);
//    }
}
