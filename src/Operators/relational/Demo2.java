package Operators.relational;

public class Demo2 {
    public static void main(String[] args) {
        int number = 10;
        System.out.println(number % 2 == 0); // true
        System.out.println(number % 2 != 1); // true

        int year = 2024;
        System.out.println(year % 400 == 0); //False
        System.out.println(year % 4 == 0); //true
        System.out.println(year % 100 == 0); // false

        System.out.println(65 == 'A'); // true
        System.out.println(65 > 'A'); // false
        System.out.println(65 < 'A'); // false
        System.out.println(65 >= 'A'); // true
        System.out.println(65 <= 'A'); // true
    }
}
