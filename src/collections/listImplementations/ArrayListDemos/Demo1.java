package collections.listImplementations.ArrayListDemos;

import java.util.ArrayList;
              // add

public class Demo1 {
    public static void main(String[] args) {
        ArrayList arraylist = new ArrayList();
        arraylist.add(100);
        arraylist.add(200);
        arraylist.add("abc");
        arraylist.add("abc");
        arraylist.add(null);
        arraylist.add(true);
        System.out.println(arraylist);
    }
}
