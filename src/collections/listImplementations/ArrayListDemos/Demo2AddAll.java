package collections.listImplementations.ArrayListDemos;

import java.util.ArrayList;
              // add

public class Demo2AddAll {
    public static void main(String[] args) {
        ArrayList arraylist = new ArrayList();
        arraylist.add(100);
        arraylist.add(200);
        arraylist.add("abc");
        arraylist.add("abc");
        arraylist.add(null);
        arraylist.add(true);
        System.out.println(arraylist);

        ArrayList arrayList2= new ArrayList<>();
        arrayList2.addAll(arraylist);
        arrayList2.add("new list");
        System.out.println(arrayList2);
    }
}
