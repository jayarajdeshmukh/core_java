package practice.sumOfNumbers;

public class Demo3 {
    public static void main(String[] args) {
        int number=8264964;
        int sum=0;
        while (number>0){
            int digit=number%10;
            sum=sum+digit;
            number=number/10;
        }
        System.out.println(sum);
    }
}
