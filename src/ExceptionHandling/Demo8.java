package ExceptionHandling;

public class Demo8 {
    public static void main(String[] args) {
        try {
            System.out.println(10/1);
            String str = "";
            System.out.println(str.length());
            int[] array = {};
            System.out.println(array[0]);
        }
        catch (ArithmeticException arithmeticException) {
            System.out.println("invalid denominator");
        }
        catch (NullPointerException nullPointerException) {
            System.out.println("null operations");
        }
        finally {
            System.out.println("finally block");
        }
        System.out.println("rest of the main");
    }
}
