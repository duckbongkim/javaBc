package abstracts;

//public class Cat extends AbstractAnimal{
  public class Cat implements InterfaceAnimal{
    @Override
    public void sound(){
        System.out.println("야용!");
    }
    
    @Override
    public void move(){
        System.out.println("달린다");
    }
}
