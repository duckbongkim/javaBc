package arry;

public class Array6 {
    public static void main(String[] args){
        // 2차원 배열 (2*3)
        int [][] arr = new int[2][3];


        arr[0][0] = 1; arr[0][1] = 2; arr[0][2] = 3;
        arr[1][0] = 4; arr[1][1] = 5; arr[1][2] = 6;

        //1행 출력
        System.out.println(arr[0][0]+" "+arr[0][1]+" "+arr[0][2]);
        //2행 출력
        System.out.println(arr[1][0]+" "+arr[1][1]+" "+arr[1][2]);
    }
}
