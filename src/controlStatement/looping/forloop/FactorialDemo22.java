package controlStatement.looping.forloop;

public class FactorialDemo22 {
    // factors 6->1,2,3.
    // factorial 6->1*2*3*4*5*6 = 720.
    public static void main(String[] args) {
        int number=6;
        int factorial=1;
        for(int i=1; i<=number; i++){
            factorial= factorial*i;
        }
        System.out.println("factorial of given number is" + factorial);
    }
}
