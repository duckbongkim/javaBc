package arry;
import java.util.Scanner;
public class ArrayEx3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int[] arr = new int[size];

        int i=1;
        for(int num : arr){
            num = i;
            System.out.print(num);
            if (num != arr.length){
                System.out.print(",");
            }
            i++;

        }

    }
}
