package practice;

public class Demo29 {
    public static void main(String[] args) {
        //11-> 1*2*3*4*5*6*7*8*9*10*11
        int number=11;
        int factorial=1;
        for(int i=1; i<=number; i++){
        factorial=factorial*i;
        }
        System.out.println("factorial of given number" + factorial);
    }
}
