package classComponents.blocks;

import classComponents.variables.Student;

public class student {
    static {
        System.out.println("Static block");
    }
    {
        System.out.println("Instance block");
    }
    public student(){                         // constructor call(using class name)
        System.out.println("Constructor");// if we want to execute the constructor and instance block we need to create object
    }

    public static void main(String[] args) {
        System.out.println("Main Method");
        Student s = new Student();

    }
}
