package controlStatement.looping.whileloop;

public class Demo7SumOfNumbers {
    public static void main(String[] args) {
        int number=456;
        int sum=0;
        while (number>0){
         int digit=number%10;
         sum=sum+digit;
         number=number/10;
        }
        System.out.println("sum"+sum);
    }
}
