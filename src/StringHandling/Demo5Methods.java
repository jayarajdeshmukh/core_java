package StringHandling;

public class Demo5Methods {
    public static void main(String[] args) {
        String str = "Hello World";

        System.out.println("size of the string "+ str.length());//11 size of the string

        //charAt() : returns the character at specified index. index starts from 0
        //if the index is not there we get StringIndexOutOfBoundsException
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));

        // It combines the string together
        str =str.concat(" War begins start");
        System.out.println(str);// Hello World War begins start

        // change the case
        String str2 = "Hey guys wlecome to new world";
        str2 = str2.toUpperCase();
        System.out.println(str2);

        //lowercase
        String str3 = "The Journey Begins Start";
        str = str3.toLowerCase();
        System.out.println(str3);

        // replace
        str3 = str3.replace('a','@');
        System.out.println(str3);

        String str4 = "Python master class";
        String substring = str4.substring(0,3);
        System.out.println(substring);



    }
}
