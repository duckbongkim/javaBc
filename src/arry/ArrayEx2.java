package arry;

public class ArrayEx2 {
    public static void main(String[] args){
        int[] student = {90,80,70,60,50};

        int maxNum =0;
        for(int i= 0; i< student.length; i++){
            if(student[i]>maxNum){
                maxNum = student[i];
            }
        }
        System.out.println("최대값"+maxNum);
    }
}
