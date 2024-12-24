package oops.finalKeyword;

public class Demo2 {
    public static void main(String[] args) {
        final int a = 100;
        // a = 200;// CTE -->final variable can not be resignned
        System.out.println(a);
    }
}
