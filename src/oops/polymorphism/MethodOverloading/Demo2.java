package oops.polymorphism.MethodOverloading;

public class Demo2 {
    public static void main(String[] args) {
    class Addition{
       public int add(int a, int b){
            return a+b;
        }
    }
    class child extends Addition{
        public int add(int a, int b){
            return a+b;
        }
    }
    child child = new child();
    System.out.println(child.add(10,21));
}
}
