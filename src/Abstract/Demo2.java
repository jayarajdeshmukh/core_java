package Abstract;

public class Demo2 {
    class Animal{
        void MakeSound(){
            System.out.println("Sound");
        }
    }
    class Monkey extends Animal{
        @Override
        void MakeSound(){
            System.out.println("Monkey makes sound");

        }
    }
}
