package controlStatement.conditionalOrDecisonMaking;

public class Demo6 {
    public static void main(String[] args) {
        int number = 27 ;

        if (number % 2 == 0) {
            System.out.println("its an even number");
        }
       // independent statements will not allowed between if and else
        else {
            System.out.println("its an odd number");
        }
    }
}
