package Operators.bitwise;

public class Demo4 {
    public static void main(String[] args) {
        System.out.println("Logical Left Shift Operator");

        // output = operand1 * 2^operand2

        System.out.println(4 << 1); // 8 --> 4 * 2^1 = 4 * 2 = 8
        System.out.println(4 << 2); // 16 --> 4 * 2^2 = 4 * 4 = 16
        System.out.println(4 << 3); // 32 --> 4 * 2^3 = 32
        System.out.println(4 << 4); // 64
        System.out.println(3 << 1); // 6
        System.out.println(7 << 3); // 7 * 2^3 = 7 * 8 = 56
    }
}
