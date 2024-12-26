package ExceptionHandling;

public class Demo4NullPointException {
    public static void main(String[] args) {
        String s = null;
        // throws NullPointerException
        System.out.println(s.length());
    }
}
