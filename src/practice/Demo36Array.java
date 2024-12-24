package practice;

public class Demo36Array {
    public static void main(String[] args) {
        int []array = {2,3,5,6,3,2};
      int sum = 0;
        for(int i=0; i<array.length; i++){
            sum = sum + array[i];
            System.out.println(+sum);
        }
    }
}
