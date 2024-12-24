package StringHandling;

public class Demo1 {
    public static void main(String[] args) {
        // find lenght of string
        String str = "Hello World";
        System.out.println(str.length());

        String str1 = new String("abc");// heap
        String str2 = new String("pqr");// heap
        String str3 = "abc";

        // it is equals method
        System.out.println(str1 == str2);

        System.out.println(str1.hashCode());
        System.out.println(str3.hashCode());

        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str3));
    }
}
