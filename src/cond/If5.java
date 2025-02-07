package cond;

public class If5 {
    public static void main(String[] args) {
        int age = 10;
        int discount = 0;
        int price = 10000;

        if (price >=1000){
            discount = discount+1000;
            System.out.println(price+"원 이상구매 "+discount+"원 할인");
        }

        if (age <= 10){
            discount = discount+1000;
            System.out.println(age+"살 미만 "+discount+"원 할인");
        }

        System.out.println(price+"원 에서"+discount+"원 할인");
    }
}
