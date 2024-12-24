package controlStatement.looping;

public class Demo16 {
    public static void main(String[] args) {
        // 28--> 1,2,4,7,14.
        int sumOffactors = 0;
        int number = 28;
        for (int i = 1; i <= number/2;i++){
            if (number % i == 0){
                System.out.println("factor" + i);
                sumOffactors = sumOffactors + i;
            }
        }
        System.out.println(number == sumOffactors ? "Perfect": "Not a perfect");
    }
}
