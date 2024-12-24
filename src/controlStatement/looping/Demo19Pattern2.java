package controlStatement.looping;

public class Demo19Pattern2 {
    public static void main (String [] args){
        for (int row = 1; row <= 7; row++) {
            for (int star = 1; star < 70; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
