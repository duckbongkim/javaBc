package arry;
import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.print("숫자를 입력하세용: ");
    int size = scanner.nextInt();
    int[] arr = new int[size];

    for(int i = 0; i<size; i++){
        int num = scanner.nextInt();
        arr[i] = num;
    }

    int minNum,maxNum;
    minNum = arr[0];
    maxNum = arr[0];
    for (int number : arr){
        if (number > maxNum) maxNum = number;
        if (number < minNum) minNum = number;
    }
    System.out.println("최대"+maxNum+", 최소"+minNum);



    }
}
