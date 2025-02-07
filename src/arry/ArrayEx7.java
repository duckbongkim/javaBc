package arry;
import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalPrice = 0;

        //최대 저장 개수 입력
        int maxProduct = 10;

        //배열 생성
        String[][] prodcutArray = new String[10][2];
        String productName = scanner.nextLine();
        int productPrice = scanner.nextInt();


        while (true) {
            System.out.println("----------상품 구매 프로그램------------");

            System.out.print("1: 상품 등록, 2: 목록, 3: 종료 : ");
            //사용자 입력
            int selectNum = scanner.nextInt();

            if (selectNum == 1) {
                scanner.nextLine();

                System.out.print("상품 이름 입력: ");
                productName = scanner.nextLine();


                System.out.print("상품 가격 입력: ");
                productPrice = scanner.nextInt();

                System.out.print("수량을 입력: ");
                int cnt = scanner.nextInt();

//                totalPrice += price * cnt;


            } else if (selectNum == 2) {
                for (int i=0; i< maxProduct; i++){
                    System.out.print("삼품명: "+prodcutArray[i][0] + " ");
                    System.out.print("가 격: "+prodcutArray[i][1] + " 원");
                    System.out.println();
                }


            } else if (selectNum == 3) {
                System.out.print("프로그램 종료..");
                break;
            } else {
                System.out.println("번호를 다시 선택해주세요.");
            }

        }
    }
    }



