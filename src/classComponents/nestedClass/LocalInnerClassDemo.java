package classComponents.nestedClass;

public class LocalInnerClassDemo {
    public static void main(String[] args) {
        // Local Inner Class

        class LocalInnerClass{
            int variable=100;
            void method(){
                System.out.println("Local Inner Class Method");
            }
        }
        LocalInnerClass localInnerClass = new LocalInnerClass();
        System.out.println(localInnerClass.variable);
        localInnerClass.method();
    }
}

