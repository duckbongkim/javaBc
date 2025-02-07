package arry;

public class ArrayEx1 {
    public static void main(String[] args){
        int[] student = {90,80,70,50,60};
        int sum = 0;


        for(int i= 0; i< student.length; i++){
            sum += student[i];
        }

        double average = (double) sum / student.length;

        System.out.println(average);
    }
}
