package Operators.logical;

public class Demo3 {
    public static void main(String[] args) {
        int number1 = 100;
        int number2 = 200;
        System.out.println(number1 > number2 && number2 != number1); // false
        //System.out.println((10 % 2 == 0) && (10 % 0 == 0)); // AE
        System.out.println((10 % 2 == 0) && (10 % 5 == 0)); //true
    }
}
