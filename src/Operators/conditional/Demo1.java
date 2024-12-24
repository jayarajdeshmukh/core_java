package Operators.conditional;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println("Conditional Operator or ternary or if else shorthand operator");
        /*  It works on 3 operands
        Output 1). if the operand1 is true then output will be operand2
               2). if the operand1 is false then output will be operand3 */

        System.out.println(true ? "this is true" : "this is false"); // this is true
        System.out.println(false ? "this is true" : "this is false"); // this is false

        System.out.println(4 > 3 ? 4 : 3); // 4
        System.out.println(4 < 3 ? 4 : 3); // 3

            }
}
