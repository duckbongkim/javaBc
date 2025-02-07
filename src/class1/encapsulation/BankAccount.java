package class1.encapsulation;

public class BankAccount {
   private int balance; // 계좌 잔고

    // 생성자
    public BankAccount(){
        balance = 0;
    }

    //입금
    public void deposit(int amount){
        if(isAmountValid(amount)){
            balance += amount;
        } else {
            System.out.println("유효하지 않은 금액입니다.");
        }
    }

    //출금
    public void withdraw(int amount){
        if(isAmountValid(amount)&& balance - amount > 0){
            balance -= amount;
        } else {
            System.out.println("유효하지 않음 또는 잔액이 부족합니다.");
        }
    }

    //잔고확인
    public void getBalance(){
        System.out.println("잔액: "+balance);
    }

    private boolean isAmountValid(int amount){
        return amount > 0;
    }
}
