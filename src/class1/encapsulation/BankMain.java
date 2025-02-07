package class1.encapsulation;

public class BankMain {
    public static void main(String[] args){
        BankAccount account = new BankAccount();

        account.getBalance();

        account.withdraw(100);
        account.deposit(-1000);

        account.deposit(10000);
        account.getBalance();
    }
}
