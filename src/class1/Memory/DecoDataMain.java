package class1.Memory;

public class DecoDataMain {
    public static void main(String[] args) {
        String s = "hello java";

        String deco = DecoData.deco(s);

        System.out.println("before: "+s);
        System.out.println("after: "+deco);


    }
}
