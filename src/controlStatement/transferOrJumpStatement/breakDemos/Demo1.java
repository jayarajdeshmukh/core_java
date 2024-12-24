package controlStatement.transferOrJumpStatement.breakDemos;

public class Demo1 {
    // breaks can not be use outside the loop or switch
    public static void main(String[] args) {
        for (int i=1; i<=10; i++){
            System.out.println(i);
            break;
        }
    }
}
