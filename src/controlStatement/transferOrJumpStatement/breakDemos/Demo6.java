package controlStatement.transferOrJumpStatement.breakDemos;

public class Demo6 {
    // numbers which is not divisible by 3, 5, 7
    public static void main(String[] args) {
        for (int i=1; i<=100; i++){
            if (!(i%3==0 || i%5==0 || i%7==0))
            System.out.println(i);
        }
    }
}
