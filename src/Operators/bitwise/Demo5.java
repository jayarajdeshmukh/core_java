package Operators.bitwise;

public class Demo5 {
    public static void main(String[] args) {
        System.out.println("Logical Right Shift Operator");

        // output = operand1 / 2^operand2

        System.out.println(4 >> 1); // 2 --> 4 / 2^1 = 4 / 2 = 2
        System.out.println(4 >> 2); // 1 --> 4 / 2^2 = 4 / 4 = 1
        System.out.println(4 >> 3); // 0 --> 4 / 2^3 = 0
        System.out.println(4 >> 4); // 4 / 2^4 = 0
        System.out.println(3 >> 1); // 3 / 2^1 = 1
        System.out.println(7 >> 3); // 7 / 2^3 = 7 / 8 = 0
        System.out.println(128 >> 1); // 128 / 2^1 = 64
        System.out.println(128 >> 2); // 128 / 2^2 = 32
        System.out.println(128 >> 3); // 128 / 2^3 = 16
        System.out.println(128 >> 4); // 128 / 2^4 = 8
    }
}