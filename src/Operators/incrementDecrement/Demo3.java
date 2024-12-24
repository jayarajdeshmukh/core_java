package Operators.incrementDecrement;

public class Demo3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;

        int p = a++; //post increment
        int q = ++b; //pre increment

        System.out.println(a); // 11
        System.out.println(b); // 11
        System.out.println(p); // 10
        System.out.println(q); // 11
    }
}
