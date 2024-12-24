package controlStatement.looping.forloop;

public class FactorsDemo19 {
    public static void main(String[] args) {
        int number=100;
        for(int i=1; i<=number/2; i++){
            if(number % i== 0) {
            System.out.println("factor"+i);
        }
     }
   }
}
