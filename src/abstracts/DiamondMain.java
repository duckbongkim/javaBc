package abstracts;

public class DiamondMain {
    public static void main(String[] args) {
        InterfaceA a = new InterfaceChild();
         a.methodA();
         a.methodCommon();


        interfaceB b = new InterfaceChild();
        b.methodB();
        b.methodCommon();

    }
}
