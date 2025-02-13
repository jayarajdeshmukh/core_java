package StringHandling.practice;

public class Demo1 {
    public static void main(String[] args) {
        String name ="Jayaraj";
        int value = name.length();
        System.out.println(value);

       String lstring = name.toLowerCase();
        System.out.println(lstring);

        String ustring = name.toUpperCase();
        System.out.println(ustring);

        int length = name.length();
        System.out.println(length);

       String subStr = name.substring(0,3);
        System.out.println(subStr);

        int index = name.indexOf("raj");
        System.out.println(index);

       String str = "Hello World!";
       String newStr = str.replace("World","java");
        System.out.println(newStr);


    }
}
