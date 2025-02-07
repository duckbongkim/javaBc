package oop;

import class1.Data;

public class oop01 {
    public static void main(String[] args){
        Data data = new Data();
        add(data); // x001.value 를 1증가
        add(data); // x001.value 를 1증가
        add(data); // x001.value 를 1증가
        //System.out.println("최종숫자: "+ data.value);
    }

    static void add(Data data){
        //data.value++;
        //System.out.println("숫자 증가 : value =  "+data.value);
    }
}
