package arry;

public class Array2 {
    public static void main(String[] args){
        //배열 변수 선언
        int[] student;
        // 배열 변수 생성
        student = new int[5];

        //배열안에 값을 입력
        student[0] = 90;
        student[1] = 80;
        student[2] = 70;
        student[3] = 60;
        student[4] = 50;

        System.out.println("학생1 점수: "+student[0]);
        System.out.println("학생2 점수: "+student[1]);
        System.out.println("학생3 점수: "+student[2]);
        System.out.println("학생4 점수: "+student[3]);
        System.out.println("학생5 점수: "+student[4]);

    }
}
