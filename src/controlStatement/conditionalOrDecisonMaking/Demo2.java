package controlStatement.conditionalOrDecisonMaking;

public class Demo2 {
    public static void main(String[] args) {
        // decision making -- run or skip
        // false = do not print. true = print
        System.out.println("1");
        System.out.println("2");

        if (true) {
            System.out.println("3");
            System.out.println("4");

            if (false) {
                System.out.println("3");
                System.out.println("4");
            }
        }
    }
}