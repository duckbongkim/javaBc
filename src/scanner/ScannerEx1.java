package scanner;
import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int totalPrice = 0;

        while(true) {
            System.out.println("----------상품 구매 프로그램------------");

            System.out.print("1: 상품 입력, 2: 결제, 3: 종료 : ");
            //사용자 입력
            int selectNum = scanner.nextInt();

            if(selectNum == 1){
                scanner.nextLine();

                System.out.print("상품 이름 입력: ");
                String name = scanner.nextLine();


                System.out.print("상품 가격 입력: ");
                int price = scanner.nextInt();

                System.out.print("수량을 입력: ");
                int cnt = scanner.nextInt();

                totalPrice += price*cnt;

                System.out.println("====결제정보====");
                System.out.println("상품명: "+name+" 가격: "+price+" 수량: "+cnt+" 총가격: "+totalPrice);

            } else if (selectNum == 2) {
                System.out.println("결제금액: "+totalPrice);
                totalPrice = 0;
                System.out.println("결제가 완료 되었습니다.");
                System.out.println("남은 결제 금액: "+totalPrice);
            } else if (selectNum == 3) {
                System.out.print("프로그램 종료..");
                break;
            } else {
                System.out.println("번호를 다시 선택해주세요.");
            }

        }
        }
    }

