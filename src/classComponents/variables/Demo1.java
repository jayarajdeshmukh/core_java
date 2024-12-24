package classComponents.variables;

public class Demo1 {
    public static void main(String[] args) {
        Student s1=new Student();
        // s1---> refernce variable
        // new --> keyword which is used to create an object
        // new student()--> object
        // student --> class name or derived data type
        System.out.println(s1);// hashcode,refernce or address

        // set new values
        s1.studentId=132;
        s1.studentName="Jay";
        s1.studentAddress="Umadi";
        s1.studentAge=23;
        s1.studentGender="Male";

        System.out.println("student Id \t"+s1.studentId);
        System.out.println("student Name \t"+s1.studentName);
        System.out.println("student Address \t"+s1.studentAddress);
        System.out.println("student Age \t"+s1.studentAge);
        System.out.println("student Gender \t"+s1.studentGender);
        System.out.println(s1.collageName);
    }
}


