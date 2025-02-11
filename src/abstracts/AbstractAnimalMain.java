package abstracts;




public class AbstractAnimalMain {

    public static void main(String[] args) {

//        AbstractAnimal abstractAnimal = new AbstractAnimal();

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();
        Bird bird = new Bird();

        bird.fly();
        bird.move();
        bird.sound();


        soundAnimal(dog);
        moveAnimal(dog);
        soundAnimal(cat);
        moveAnimal(cat);
        soundAnimal(cow);
        moveAnimal(cow);



    }
    public static void soundAnimal(InterfaceAnimal animal){
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    public static void moveAnimal(InterfaceAnimal animal){
        animal.move();
    }

}
