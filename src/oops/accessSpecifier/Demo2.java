package oops.accessSpecifier;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println(Demo1.a);// public
      //  System.out.println(Demo1.b); CTE because its private
        System.out.println(Demo1.c);//protected
        System.out.println(Demo1.d);//default
    }
}
