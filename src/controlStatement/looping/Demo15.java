package controlStatement.looping;

public class Demo15 {
    public static void main(String[] args) {
        // factors of given number
        // 10 --> 1,2,5.
        // 100 --> 1,2,5,10,20,25,50.
        // 1000--> 1,2,5,10,20,25,50,100,200,250,500.
        // maximum factor = number / 2
        // factor will be if the reminder is zero

        int number = 28;
        for (int i = 1; i <= number/2;i++){
            if (number % i == 0){
                System.out.println("factor" + i);
            }
        }
    }
}

