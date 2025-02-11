package abstracts;

//public class Cow extends AbstractAnimal{
public class Cow implements InterfaceAnimal{
    @Override
    public void sound(){
        System.out.println("음머");
    }
    
    @Override
    public void move(){
        System.out.println("걷는다");
    }
}
