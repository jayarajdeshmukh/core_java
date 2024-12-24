package controlStatement.looping;

public class Demo14 {
    public static void main(String[] args) {
        // OR (but it is waste of time)
          int sum = 0;
             for (int i = 1; i <= 100; i++){
              if (i % 5 == 0){
          System.out.println(i);
            sum = sum + i;
         }
        }
         System.out.println("Sum" + sum);
    }
}
