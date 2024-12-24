package scanner;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter two numbers");
        int number1= scanner.nextInt();
        int number2= scanner.nextInt();
        System.out.println("Enter the operation");
        String operation= scanner.next();
        switch (operation){
            case "+"-> System.out.println("Addition is"+(number1 + number2));
            case "-"-> System.out.println("Substraction is"+(number1 - number2));
            case "*"-> System.out.println("Multiplication is"+(number1 * number2));
            case "/"-> System.out.println("Divison is"+(number1 / number2));
            case "%"-> System.out.println("Remainder is"+(number1 % number2));
            default -> System.out.println("invalid operation");
        }
    }
}
