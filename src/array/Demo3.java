package array;

public class Demo3 {
    public static void main(String[] args) {
        // array size restriction
        // int [] array = new int[10.2f] compile time error
        int [] array = new int[0]; // no issue
        int [] array1 = new int[-5]; //runtime = NegativeSizeExeception
    }
}
