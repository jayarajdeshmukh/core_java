package practice;

public class Demo34 {
     @FunctionalInterface
    interface Substraction{
         void substract(int input1, int input2) ;
     }
      public static class Example1{
          public static void main(String[] args) {
              Substraction intinterface=(n1, n2) ->
                      System.out.println(n1-n2);
          };
          //intinterface.substract(5,2);
    }
}
/*public class Demo34 {
    @FunctionalInterface
    interface Substraction {
        void subtract(int input1, int input2);
    }

    public static class Example1 {
        public static void main(String[] args) {
            // Implement the Substraction interface using a lambda expression
            Substraction subtraction = (n1, n2) ->
                    System.out.println(n1 - n2);

            // Call the subtract method with two arguments
            subtraction.subtract(5, 2);
        }
    }
}
*/
