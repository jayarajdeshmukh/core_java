package controlStatement.looping;

public class Demo9 {
    public static void main (String [] args) {
        for (int left = 0, right = 5; left < right ;left++) {
            System.out.println(left + "\t" + right);
        }
        //0 5
        //1 5
        //2 5
        //3 5
        //4 5
    }
}
