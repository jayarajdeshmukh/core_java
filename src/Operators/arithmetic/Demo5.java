package Operators.arithmetic;

public class Demo5 {
    public static void main(String[] args) {
        System.out.println(10+20);//30-->mathematical addition
        System.out.println(10+"20");//1020--> string concatination
        System.out.println(10+20*10-10/1);//200--> BODMAS
        System.out.println(10+20*(10-10)/1);//10--> BODMAS
        System.out.println("ABC" + "ABC" + "ABC");//130A
        System.out.println("ABC" + "ABC" + "ABC");//AAA
        System.out.println("ABC" + "ABC" + "ABC");//AAA

        // String Concatination
        System.out.println("ABC" + 10 + "ABC");//140
        System.out.println("ABC" + 10 + "ABC");//75A
        System.out.println("ABC" + 10 + "ABC");//A10A
        System.out.println("ABC"+ "ABC"+ "ABC");//AAA
    }
}
