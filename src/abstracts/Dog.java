package abstracts;

//public class Dog extends AbstractAnimal{

public class Dog implements InterfaceAnimal{
    @Override
    public void sound(){
        System.out.println("멍멍");
    }
    
    @Override
    public void move(){
        System.out.println("호다닥");
    }

}
