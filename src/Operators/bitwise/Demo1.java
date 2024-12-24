package Operators.bitwise;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println(10 % 2 == 1 && 10 % 0 ==0); //false
        //System.out.println(10 % 2 == 1 & 10 % 0 ==0); //AE

        System.out.println(10 % 2 == 0 || 10 % 0 ==0); // true
        //System.out.println(10 % 2 == 0 | 10 % 0 ==0); // AE
    }
}
