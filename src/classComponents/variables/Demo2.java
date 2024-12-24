package classComponents.variables;

public class Demo2 {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();
        Student s4=new Student();
        Student s5=new Student();

        // static variable= it is a variable which is defined inside the class with static keyword but outside of all methods, constructors and blocks
        // static means does not change
        //how to access static variable= using class name
          //Syntax:
                // ClassName.staticVariableName
        // how many times static variable is created= only once that is common for all of the objects or group at the time of class loading
        System.out.println(Student.collageName);

    }
}
