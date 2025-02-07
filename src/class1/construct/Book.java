package class1.construct;

public class Book {
    String title;
    String author;
    int page;

    //기본생성자
    Book(){
        this("","",0);
    }

    Book(String title, String author){
        this(title,author,0);
    }

    Book(String title, String author, int page){
        this.title = title;
        this.author = author;
        this.page = 0;
    }

    void displayInfo(){
        System.out.println("제목: "+title+", 저자: "+author+", page: "+page);
    }
}
