package controlStatement.transferOrJumpStatement.continueDemos;

public class Demo2Return {
    // end of the method
    public static void main(String[] args) {
        for (int i=1; i<=100; i++){
            if (i%5==0){
           return;
                }
                System.out.println(i);
        }
        System.out.println("rest of the main method");
    }
}
