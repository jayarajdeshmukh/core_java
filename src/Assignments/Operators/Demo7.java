package Assignments.Operators;

  //If the marks of Robert in three subjects are 78,45 and 62 respectively (each out of 100 ), write a program to calculate his total marks and percentage marks.
public class Demo7 {
      public static void main(String[] args) {
          int sub1 = 78;
          int sub2 = 45;
          int sub3 = 62;

          int totalMarks = sub1 +sub2 +sub3;
          double percentage = (totalMarks / 3.0);
          System.out.println(totalMarks + "/300");
          System.out.println(percentage + "%");
      }
}
