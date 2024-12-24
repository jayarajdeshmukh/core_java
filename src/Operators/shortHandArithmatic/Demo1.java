package Operators.shortHandArithmatic;

public class Demo1 {
    public static void main(String[] args) {
        int sum = 10;
        //sum = sum + 10;
        sum +=10; // shorthand arithmatic operator
        System.out.println(sum);// 20

        int a = 1;
        // a = a+2;
        a+= 2;
        System.out.println(a);//3

        int b = 10;
        // b = b-5;
        b-= 5;
        System.out.println(b);//5

        int c = 10;
        // c = c*10;
        c *= 10;
        System.out.println(c);// 100

        int d = 100;
        // d = d/10
        d /= 10;
        System.out.println(d);// 10

        int e = 11;
        // e = e%3
        e %= 3;
        System.out.println(e);// 2
    }
}
