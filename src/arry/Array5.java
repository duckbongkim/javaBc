package arry;

public class Array5 {
    public static void main(String[] args){
        int [] students;
        //배열생성과 초기화를 동시에 해주는 방법
        students = new int[]{90,80,70,60,50};

      //  int students = new int[]{90,80,70,60,50};

      //  int[] students = {90,80,70,60,50};

        for(int i = 0; i< students.length; i++){
            System.out.println("학생"+(i+1)+", 점수"+students[i]);
        }
    }
}
