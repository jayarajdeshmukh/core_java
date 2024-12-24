package dataTypes;

public class Demo1 {
    public static void main(String []args){
//      byte byteValue = Byte.MIN_VALUE;
//      System.out.println(byteValue);
//
//      short shortValue = Short.MIN_VALUE;
//      System.out.println(shortValue);
//
//       int intValue = Integer.MIN_VALUE;
//        System.out.println(intValue);
//
//        long longValue = Long.MIN_VALUE;
//        System.out.println(longValue);
// }

        // swap the numbers without using third variable
        int a=4;
        int b=10;
        a=a^b;
        a=b^a;
        a=a^b;
        System.out.println(a);
        System.out.println(b);
}
}




