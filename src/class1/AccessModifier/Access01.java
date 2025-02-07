package class1.AccessModifier;

public class Access01 {
    public int publicField;
    int defaultField;
    private int privateField;

    public void publicMethod(){
        System.out.println("퍼블릭 매서드: "+publicField);
    }

    void defaultMethod(){
        System.out.println("디폴트 매서드: "+defaultField);
    }

    private void privateMethod(){
        System.out.println("프라이빗 매서드: "+privateField);
    }

    public void innerAccess(){
        System.out.println("내부 호출");
        privateField=10;
        publicField=20;
        defaultField=30;

        publicMethod();
        defaultMethod();
        privateMethod();
    }
}
