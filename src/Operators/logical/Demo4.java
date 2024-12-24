package Operators.logical;

public class Demo4 {
    public static void main(String[] args) {
        System.out.println(10 % 2 == 1 && 10 % 0 ==0); // false
        System.out.println(10 % 2 == 0 || 10 % 0 ==0); // true

        int year = 2024;
        System.out.println(
                (year % 400 == 0) || ((year % 100 != 0) && (year % 4 == 0)) // true
                );
    }
}
