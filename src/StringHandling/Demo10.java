package StringHandling;

public class Demo10 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "ABC";
        System.out.println(str1 == str2);// false: it will cheack the reference
        System.out.println(str1.equals(str2));//false: content cheack with case
        System.out.println(str1.equalsIgnoreCase(str2));// true: content check ignoring case
        System.out.println(str1.compareTo(str2));// int : positive
    }
}
