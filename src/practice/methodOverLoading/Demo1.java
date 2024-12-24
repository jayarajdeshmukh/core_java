package practice.methodOverLoading;

public class Demo1 {
    public static void main(String[] args) {
        class Addition{
            int add(int a, int b){
                return a+b;
            }
            float add(float a, float b){
                return a+b;
            }
        }
        Addition addition = new Addition();
        System.out.println(addition.add(1,20));
        System.out.println(addition.add(10,20));
    }
}
