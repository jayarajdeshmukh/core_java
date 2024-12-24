package Operators.conditional;

public class Demo6 {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 30;
        int number3 = 50;

        System.out.println("max of three numbers");
        System.out.println(
                (number1 > number2 && number1 > number3)
                ? number1
                : ( (number2 > number1 && number2 > number3)
                ? number2 : number3));

    }
  }