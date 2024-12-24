package controlStatement.looping.forloop;

public class PrimeDemo21 {
    //prime numbers-> don't have any factors apart from 1 and number itself.
    // e.g. 3,5,7,11,13,17,19,......
    public static void main(String[] args) {
        int number=7;
        boolean isPrime=true;
        for(int i=2; i<=number/2; i++) {
            if (number % i == 0) {
                System.out.println(i);
                isPrime = false;
                break;
            }
        }
            System.out.println(isPrime?"its prime": "its not prime");
    }
}
