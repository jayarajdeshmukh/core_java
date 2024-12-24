package Operators.incrementDecrement;

public class Demo4 {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;

        int p = a--; //post decrement
        int q = --b; //pre decrement

        System.out.println(a); // 9
        System.out.println(b); // 9
        System.out.println(p); // 10
        System.out.println(q); // 9
    }
}

