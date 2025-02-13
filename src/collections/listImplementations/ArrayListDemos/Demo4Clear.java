package collections.listImplementations.ArrayListDemos;

import java.util.ArrayList;
              // add

public class Demo4Clear {
    public static void main(String[] args) {
        ArrayList arraylist = new ArrayList();
        arraylist.add(100);
        arraylist.add(200);
        arraylist.add("abc");
        arraylist.add("abc");
        arraylist.add(null);
        arraylist.add(true);
        System.out.println("Before Removal");
        System.out.println(arraylist);
        System.out.println("Before removal size"+ arraylist.size());

        arraylist.clear();
        System.out.println("After Removal");
        System.out.println(arraylist);
        System.out.println("After removal size"+ arraylist.size());
    }
}
