package practice.armstrongNumber;

public class Demo3 {
    public static void main(String[] args) {
        int number=555;
        int sum=0;
        int originalNumber=number;
        while (number>0){
            int digit=number%10;
            sum=sum+digit*digit*digit;
            number=number/10;
        }
        System.out.println(sum==originalNumber?"armstrong":"not armstrong");
    }
}