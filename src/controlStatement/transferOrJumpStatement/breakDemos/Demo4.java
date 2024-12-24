package controlStatement.transferOrJumpStatement.breakDemos;

public class Demo4 {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        for (int temp : array) {
            System.out.println(temp);
            break;
        }
    }
}