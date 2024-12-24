package practice;

public class Demo25 {
    public static void main(String[] args) {
        int number = 70;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                System.out.println("Factors"+i);
            }
        }
    }
}