package practice.palindromeNumber;

public class Demo2 {
    public static void main(String[] args) {
        int number=5858769;
        int originalNumber=number;
        int reverse=0;
        while (number>0){
            int digit=number%10;
            reverse=reverse*10 +digit;
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
