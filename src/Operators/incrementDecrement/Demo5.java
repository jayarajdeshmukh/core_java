package Operators.incrementDecrement;

public class Demo5 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        System.out.println(a++ + ++b + c-- + --d + ++a + --b);
       // System.out.println(a++ (1) + ++b(3) + c--(3) + --d(3) + ++a(3) + --b(2)); //15
        System.out.println(a); // 3
        System.out.println(b); // 2
        System.out.println(c); // 2
        System.out.println(d); // 3
    }
}
