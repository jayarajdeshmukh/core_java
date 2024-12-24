package Operators.bitwise;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println("Bitwise AND Operation");
        //System.out.println(4 && 5); // CTE
        System.out.println(4 & 5); // 4
        System.out.println(8 & 2); // 0

        System.out.println("Bitwise OR Operation");
        System.out.println(4 | 5); // 5
        System.out.println(8 | 2); // 10
        System.out.println(16 | 3); // 19

        System.out.println("Bitwise XOR Operation");
        System.out.println(true ^ true); //false
        System.out.println(false ^ false); //false
        System.out.println(true ^ false); // true
        System.out.println(false ^ true); //true

        System.out.println(4 ^ 5); // 1
        System.out.println(17 ^ 16); // 1
    }

}
