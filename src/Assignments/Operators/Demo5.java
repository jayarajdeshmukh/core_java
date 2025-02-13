package Assignments.Operators;

 // Assign values of variables 'a' and 'b' as 55 and 70 respectively and then check if both the conditions 'a < 50' and 'a < b' are true.
public class Demo5 {
    public static void main(String[] args) {
        int a = 55;
        int b = 70;
        if(a<55 && a<b){
            System.out.printf("Both conditions are true");
        }else {
            System.out.println("Both conditions are not true");
        }
    }
}
