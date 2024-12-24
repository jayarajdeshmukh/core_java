package classComponents.variables;

public class Demo3 {
    String studentName;//instance variable
    Student s1=new Student();
    static String studentAddress;// static variable

    public static void main(String[] args) {
        int a=10;// local variable - primitive local variable
        int b=20;// local variable- primitive local variable

        System.out.println(a);
        System.out.println(b);
        System.out.println(studentAddress);
    }
}
