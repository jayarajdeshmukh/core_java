package Operators.Assignment;


public class Demo1 {
    public static void main(String[] args) {
        int a = 20;//direct value
        int b = 20-10;// expression
        int c = b;// another variable
        int d = getValue();// function call
        System.out.println(a);//20
        System.out.println(b);//10
        System.out.println(c);//10
        System.out.println(d);//100
        }

    private static int getValue() {
        return 100;
    }
}
