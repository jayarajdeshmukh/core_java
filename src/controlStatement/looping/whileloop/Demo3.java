package controlStatement.looping.whileloop;

public class Demo3 {
    public static void main(String[] args) {
        int left=0;
        int right=10;
        while(left<right){
            System.out.println(left + "\t" + right);
        }
        // infinite loop
        // 0 10
        // .....
    }
}
