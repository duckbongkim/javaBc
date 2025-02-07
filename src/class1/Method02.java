package class1;

public class Method02 {
    public static void main(String[] args) {

        Student student1 = createStudent("홀길동",25,100);
        Student student2 = createStudent("최동진",20,50);

        print(student1);
        print(student2);





    }
    static Student createStudent(String name,int age, int grade){

        Student student = new Student(); // 인스턴스 생성
        //인스턴스 값 입력
        student.name=name;
        student.age=age;
        student.grade=grade;

        return student;
    }

    static void print(Student student){
        System.out.println("이름: "+student.name);
    }
}
