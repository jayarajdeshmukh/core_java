package oops.inheritance;

public class Demo1 {
    public static void main(String[] args) {
        class A {
            int a=1;

            void methodA() {
                System.out.println("Instance method of A");
            }
            A(){
                System.out.println("Constructor method of A");
            }
        }
        class B extends A {
            int b=2;
            void methodB() {
                System.out.println("Instance method of B");
            }
        }
        A a = new A();
        System.out.println(a.a);
        a.methodA();
    }
}
