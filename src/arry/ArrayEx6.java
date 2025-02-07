//package arry;
//import java.util.Scanner;
//
//public class ArrayEx6 {
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("행을 입력하세용: ");
//        int row = scanner.nextInt();
//
//        System.out.println("열을 입력하세용: ");
//        int col = scanner.nextInt();
//
//        int [][] arr = new int[row][col];
//
//
//
//        for(int i=0; i<row; i++){
//            System.out.print((i+1) + "행의 수를 입력" +col+"");
//            for(int j=0; j<col; j++){
//                arr[i][j] = scanner.nextInt();
//            }
//        }
//
//        int minNum,maxNum;
//        minNum = arr[0][0];
//        maxNum = arr[0][0];
//        for (int number : arr){
//            if (number > maxNum) maxNum = number;
//            if (number < minNum) minNum = number;
//        }
//        System.out.println("최대"+maxNum+", 최소"+minNum);
//
//
//
//    }
//}
