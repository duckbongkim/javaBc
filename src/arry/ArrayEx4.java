package arry;
import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int[] arr = new int[size];

        int i=size;
        for(int num : arr){
            num = i;
            System.out.print(num);
            if (num != 1){
                System.out.print(",");
            }
            i--;

        }
    }
}
