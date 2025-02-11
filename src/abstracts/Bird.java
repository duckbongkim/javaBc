package abstracts;

public class Bird extends AbstractAnimal implements Fly{
    @Override
    public void sound(){
        System.out.println("까악");
    }

    @Override
    public void fly(){
        System.out.println("펄럭");
    }

    @Override
    public void move(){
        System.out.println("춍춍");
    }

}
