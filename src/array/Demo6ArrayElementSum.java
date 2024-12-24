package array;

public class Demo6ArrayElementSum {
    public static void main(String[] args) {
        int []array = {21,53,54,32,10};
        // inhanced for loop
        int sum = 0;
        for (int temp : array) {
            sum += temp;
            System.out.println(+sum);
        }
        System.out.println("Using traditional  for loop");
       sum = 0;
        for (int i = 0; i <array.length; i++){
            sum += array[i];
          // or sum = sum + array[i]
            System.out.println(+sum);
        }
    }
}
