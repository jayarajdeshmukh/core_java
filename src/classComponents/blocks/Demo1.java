package classComponents.blocks;

public class Demo1 {
    // Instance block: Block of code which inclose inside curly braces, which does not have name which does not
    // have accept any parameter, access specifier, modifier and define all methods and constructors at class level
    // if we want to run the instance block first we create a object
    // ex. class name. reference name = new class name

    {
        System.out.println("Instance block");
    }

    // static block: with static keyword outside method
    static {
        System.out.println("Static block");
    }
    public static void main(String[] args) {
        System.out.println("Main Method");
        Demo1 demo1 = new Demo1();
    }
}
