package class1;

public class Class02 {
    public static void main(String[] args){
        Student student = new Student(); // 클래스 불러오기
        // Student student >>  변수선언
        // new Student(); >> 메모리에 생성 참조값을 변수에 넣어서 사용

        student.name = "학생1";
        student.age = 16;
        student.grade = 90;
        
        Student student1;// 클래스 선언
        student1 = new Student(); // 클래스 생성
        // 새로운 변수가 선언되면 새로운 참조값이 생성 됨
        student1.name = "학생2";
        student1.age = 15;
        student1.grade = 80;

        Student[] students = new Student[2];
        students[0] = student;
        students[1] = student1;

//        for(int i = 0; i< students.length; i++){
//            System.out.println("이름: "+students[i].name);
//        }

        for(Student s : students){
            System.out.println("이름: "+s.name);
        }

        //System.out.println("이름: "+students[0].name);
        //System.out.println("이름: "+x001.name);
        //System.out.println("이름: "+x001.학생1);
        // 참조값의 맴버 변수를 불러옴
    }
}
