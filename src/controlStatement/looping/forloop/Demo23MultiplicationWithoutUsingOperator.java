package controlStatement.looping.forloop;

public class Demo23MultiplicationWithoutUsingOperator {
    public static void main(String[] args) {
        int number1=10;
        int number2=5;
        int sum=0;
        for(int i=1; i<=number2; i++) {
           sum +=number1;
            // sum =number1 + sum;
        }
            System.out.println(sum);
    }
}
