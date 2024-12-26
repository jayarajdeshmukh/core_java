package ExceptionHandling;

public class Demo4 {
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
            System.out.println("******");
        }
        catch(NullPointerException nullPointerException) {
            System.out.println("handles NullPointerException");
        }
        finally {
            System.out.println("finally block");
        }
        System.out.println("rest of the main");
    }
}
