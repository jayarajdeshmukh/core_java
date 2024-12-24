package StringHandling;

public class Demo2 {
    public static void main(String[] args) {
        String str1 = "abc";// scp
        String str2= "abc";// scp
        String str3 = "abc";
        String str4 = "abc";

        // if you use new it will be false
        String str5 = new String("abc");//heap
        String str6 = new String("abc");//heap
        String str7 = new String("abc");
        String str8 = new String("abc");

        System.out.println(str1 == str2);
        System.out.println(str4 == str1);
        System.out.println(str2 == str3);
        System.out.println(str3 == str4);

        System.out.println(str5==str6);
        System.out.println(str6==str7);
        System.out.println(str7==str8);
        System.out.println(str8==str7);
    }
}
