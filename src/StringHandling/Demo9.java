package StringHandling;

public class Demo9 {
    public static void main(String[] args) {
        //initial default capacity : 16
        //we can specify the capacity in the constructor call
        StringBuilder stringBuilder = new StringBuilder(100);

        // lenght() : no. of characters
        System.out.println(stringBuilder.length());

        // capacity: initial array creation
        System.out.println(stringBuilder.capacity());
    }
}
