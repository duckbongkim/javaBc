package abstracts;

public class InterfaceChild implements InterfaceA, interfaceB{
    @Override
    public void methodA(){
        System.out.println("InterfaceChild.MethodA");
    }
    @Override
    public void methodB(){
        System.out.println("인터페이스 차일드.메소드B");
    }
    
    @Override
    public void methodCommon(){
        System.out.println("차일드.메소드커먼");
    }
}
