package class1.AccessModifier;

public class AccessMain {
    public static void main(String[] args) {
        Access01 data = new Access01();
        //public 호출
        data.publicField =1;
        data.publicMethod();
        //default 호출
        data.defaultField = 2;
        data.defaultMethod();
        //private 호출
//        data.privateField = 3;
//        data.privateMethod();
        
        
        //내부실행
        data.innerAccess();
    }
}
