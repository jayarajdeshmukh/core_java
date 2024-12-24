package oops.accessSpecifier;

public class SingletonTest {
    public static void main(String[] args) {
    Singleton singleton1 = Singleton.getInstance(); // static method(using class name)
    Singleton singleton2= Singleton.getInstance();
    }
}
