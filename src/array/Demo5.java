package array;

public class Demo5 {
    public static void main(String[] args) {
        int []array = {12,2,3,6,4};

        System.out.println("array lenght or size " + array.length);  // 5

        System.out.println("accessing the array elements using for loop");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("accessing the array elements using inhanced for loop");
        for (int temp : array) {
            System.out.println(temp);
    }
}
}
