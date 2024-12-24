package array;

public class Demo4 {
    public static void main(String[] args) {
        // index = how far the element is from the base address
        // index range = 0 to 4
        int []array = {12,2,3,6,4};

        // it will call to string method of object class
        // it will print hexa decimal hash code value
        System.out.println(array);
        System.out.println("hashcode" +array.hashCode());

        //we can access the array elements using the concept of index
        System.out.println(array[0]); // 12
        System.out.println(array[1]); // 2
        System.out.println(array[2]); // 3
        System.out.println(array[3]); // 6
        System.out.println(array[4]); // 4
        System.out.println(array[5]); // array index of bound exception
    }
}
