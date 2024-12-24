package oops.polymorphism.MethodOverloading;

public class Demo1 {
    public static void main(String[] args) {
        class Addition{
            public int add(int a, int b){
                return a+b;
            }
            public double add(float a, float b){
                return a+b;
            }
        }
        Addition add = new Addition();
        System.out.println(add.add(10,2));
        System.out.println(add.add(10,3.4f));
    }
}
