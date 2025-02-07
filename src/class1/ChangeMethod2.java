package class1;

public class ChangeMethod2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메서드 호출전: "+dataA.value);
        changeRef(dataA);
        System.out.println("매서드 호출 후 : "+dataA.value);

    }
    static void changeRef(Data dataX){
        dataX.value = 20;
    }
}
// 참조 하고있는 원본값을 바꾸면 참조값을 불러오는 모든 데이터는 바뀜.