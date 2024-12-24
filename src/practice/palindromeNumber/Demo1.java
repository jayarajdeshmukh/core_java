package practice.palindromeNumber;

public class Demo1 {
    public static void main(String[] args) {
        int number=1234321;
        int reverse=0;
        int originalNumber=number;
        while (number>0){
            int digit=number%10;
            reverse=reverse*10+digit;
            number=number/10;
        }
        if(originalNumber==reverse){
            System.out.println("palindrome");
        }
        else {
            System.out.println("not palindrome");
        }
     }
}