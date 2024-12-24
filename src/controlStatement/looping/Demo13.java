package controlStatement.looping;

public class Demo13 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <=100; i = i+5){
            System.out.println(i);
            sum  = sum + i;
        }
        System.out.println("Sum" + sum);
    }
}
