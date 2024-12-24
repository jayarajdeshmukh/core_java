package controlStatement.transferOrJumpStatement.continueDemos;

public class Demo1 {
    // use only inside the loops otherwise CTE
    // keyword, jump statement or transfer statement
    public static void main(String[] args) {
        for (int i=1; i<=100; i++){
            if (i%5==0){
                continue;
                }
                System.out.println(i);
        }
    }
}
