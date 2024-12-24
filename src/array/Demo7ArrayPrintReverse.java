package array;

public class Demo7ArrayPrintReverse {
    public static void main(String[] args) {
        int []array = {10,20,30,40,50};
        //ascending order
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            // desc
            for(int index = array.length-1; index >= 0; index--) {
                System.out.print(array[index] + " ");
            }
        }
    }
}
