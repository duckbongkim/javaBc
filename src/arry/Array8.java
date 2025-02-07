package arry;

public class Array8 {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];
        int x = 1;
        for(int col = 0 ; col<arr[0].length; col+=1){
            for(int row = 0; row<arr.length; row+=1){
                arr[row][col] = x++;
            }
        }
        for(int i = 0 ; i<arr.length; i+=1){
            for(int j = 0; j<arr[i].length; j+=1){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
