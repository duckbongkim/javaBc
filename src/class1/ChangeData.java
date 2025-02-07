package class1;

public class ChangeData {
    public static void main(String[] args){
        Data dataA = new Data();

        dataA.value=10;

        Data dataB = dataA;

        System.out.println("dataA의 참조값: "+dataA);
        System.out.println("dataB의 참조값: "+dataB);
        System.out.println("dataA.value: "+dataA.value);
        System.out.println("dataB.value: "+dataB.value);

        dataA.value=20;

        System.out.println("dataA.value: "+dataA.value);
        System.out.println("dataB.value: "+dataB.value);

        dataB.value=30;
        System.out.println("dataA.value: "+dataA.value);
        System.out.println("dataB.value: "+dataB.value);

    }
}
