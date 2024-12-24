package Operators.incrementDecrement;

public class Demo6 {
    public static void main(String[] args) {
        int a= 5;
        int b= 4;
        int c= 3;
        System.out.println(a++ + --b + c++ + --a - ++b); //12

        System.out.println(a); //5
        System.out.println(b); //4
        System.out.println(c); //4
    }
}
