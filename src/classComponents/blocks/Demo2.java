package classComponents.blocks;

public class Demo2 {
    static {
        System.out.println("Demo2 static block");
    }
    {
        System.out.println("Demo2 instance block");
    }
    Demo2(){
        System.out.println("Demo2 zero parameterized constructor block");
    }
    Demo2(int a){
        this();// we calling zero-parameterized from parameterized
        System.out.println("Demo2 parameterized constructor block");
    }

    public static void main(String[] args) {
        Demo2 obj = new Demo2(10);
    }
}
