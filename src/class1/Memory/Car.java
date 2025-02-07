package class1.Memory;

public class Car {
    private static int totalCars;
    private String name;

    public Car(String name){
        System.out.println("구입, 자동차 이름: "+name);
        this.name = name;
        totalCars++;
    }

    public static void showTotalCars(){
        System.out.println("구매한 차량수 : "+totalCars);
    }
}
