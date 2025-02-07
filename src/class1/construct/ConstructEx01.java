package class1.construct;

public class ConstructEx01 {
    public static void main(String[] args) {
        //기본생성자 사용
        Book book1 = new Book();
        book1.displayInfo();

        //제목과 저자만 받는 생성자
        Book book2 = new Book("어린왕자","생택쥐베리");
        book2.displayInfo();

        Book book3 = new Book("나의 라임 오렌지 나무","조제 마우르지",299);
        book3.displayInfo();

    }
}
