package Assignments.Operators;

  // Now solve the above question demo5 to check if at-least one of the conditions 'a < 50' or 'a < b' is true.
public class Demo6 {
      public static void main(String[] args) {
          int a = 55;
          int b = 70;
          if(a<55 || a<b){
              System.out.printf("At least one condition is true");
          }else {
              System.out.println("Neither condition is true");
          }
      }
  }