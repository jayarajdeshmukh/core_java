package controlStatement.looping.whileloop;

public class Demo10palindromeNumber {
    // palindrome(given number=reverse number)
    public static void main(String[] args) {
        int number=123321;
        int originalNumber=number;
        int reverse =0;
        while (number>0){
            int digit=number%10;
            reverse = reverse *10+digit;
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