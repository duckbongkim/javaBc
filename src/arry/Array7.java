package arry;

public class Array7 {
    public static void main(String[] args){
        // 2차원 배열 (2*3)
        //int [][] arr = new int[2][3];


//        arr[0][0] = 1; arr[0][1] = 2; arr[0][2] = 3;
//        arr[1][0] = 4; arr[1][1] = 5; arr[1][2] = 6;

        //int[][] arr = {{1,2,3},{4,5,6}};

        //반목문을 활용한 1씩 증가하는 값 입력
        //2차원 배열 생성
        //int [][] arr = new int[2][3];

        int[][] arr = {{1,3,5},{2,4,6}};




        //2차원 배열에 입력할 값 선언
//        int i=1;
//        for(int row=0; row<arr.length; row++){
//            for (int col=0; col<arr[row].length; col++){
//                arr[row][col] = i++;
//            }
//        }


        //1행 출력
        //System.out.println(arr[0][0]+" "+arr[0][1]+" "+arr[0][2]);
        //2행 출력
        //System.out.println(arr[1][0]+" "+arr[1][1]+" "+arr[1][2]);
        
        
        //행 반복문
//        for(int row =0; row<2; row++){
//            System.out.println(arr[row][0]+" "+arr[row][1]+" "+arr[row][2]);
//        }
        
        //행과 열 반복문
        // arr.length는 행의 계수 =2
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }

    }
}

