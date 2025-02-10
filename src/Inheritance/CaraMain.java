package Inheritance;

public class CaraMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move(); // 부모클래스가 가지고 있는 메서드
        electricCar.charge();
        electricCar.openDoor();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();
        gasCar.openDoor();

        Hydrogen hydrogen = new Hydrogen();
        hydrogen.move();
        hydrogen.fillHydrogen();
        hydrogen.openDoor();
    }
}
