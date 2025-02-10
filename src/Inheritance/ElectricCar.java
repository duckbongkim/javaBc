package Inheritance;

public class ElectricCar extends Car{


    @Override
    public void move(){
        System.out.println("엄청 빠르게 이동");
    }
    
    public void charge(){
        System.out.println("충전합니다.");
    }
}
