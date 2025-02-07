package class1.Packge;


//다른 패키지의 클래스를 임포트
import class1.Packge2.Test;
import class1.construct.Book;

public class Packge {
    public static void main(String[] args) {
        Data data = new Data();
        data.value = 70;
        System.out.println(data.value);

        //다른 패키지의 클래스 불러오기
        Test test = new Test();
        test.name = "동진";
        System.out.println(test.name);
    }

}
