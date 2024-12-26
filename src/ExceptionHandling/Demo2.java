package ExceptionHandling;

// A.E = when we divide by zero
// NullPointer Exception = null value

public class Demo2 {
    public static void main(String[] args) {
        int a = 7000;
        int b = 0;

        //c = a/b;
        // without try catch
       // System.out.println(c); --> we get Arethmetic Exception

        try{
            int c = a/b;
            System.out.println("The result is " + c);
        }
        catch(ArithmeticException e){
            System.out.println("We failed to divide by zero");
            System.out.println(e);
        }
        System.out.println("End of the program");
    }
}
