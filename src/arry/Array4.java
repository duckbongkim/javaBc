package arry;

public class Array4 {
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

        for(int i = 0; i< student.length; i++){
            System.out.println("학생"+(i+1)+", 점수"+student[i]);
        }
    }
}
