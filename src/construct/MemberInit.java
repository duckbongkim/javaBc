package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    MemberInit(String name, int grade){
        //this.name = name; // this.name 하면 매개변수가 아닌 맴버 변수를 사용하겟다는 선언
        //this.age = 33;
        //this.grade = grade;
        this(name, 33, grade);
    }

    MemberInit(String name, int age, int grade){
        this.name = name; // this.name 하면 매개변수가 아닌 맴버 변수를 사용하겟다는 선언
        this.age = age;
        this.grade = grade;
    }
    // 인스턴스가 생성될때마다 내가 만드는 초기값.
    // 접근자 this 는 맴버변수에 접근하기 하기 위해 사용 >> this 는 인스턴스에 치환

}
