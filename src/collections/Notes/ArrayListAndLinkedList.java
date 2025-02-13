package collections.Notes;

import java.util.ArrayList;

      // ArrayList का उपयोग तब करें जब आपको तेज़ एक्सेस की ज़रूरत हो और लिस्ट में बदलाव कम हों।
     //LinkedList का उपयोग तब करें जब आपको लिस्ट में अक्सर तत्व डालने या हटाने की ज़रूरत हो, खासकर शुरुआत या अंत में।

public class ArrayListAndLinkedList {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> arrayList = new ArrayList<>();

        // Adding elements to the ArrayList
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");

        // Accessing elements by index
        System.out.println("First element: " + arrayList.get(0)); // Apple

        // Removing an element by index
        arrayList.remove(1); // Removes "Banana"

        // Printing all elements
        System.out.println("ArrayList after removal: " + arrayList); // [Apple, Cherry]
    }
}
//import java.util.LinkedList;
//
//public class LinkedListExample {
//    public static void main(String[] args) {
//        // Create a LinkedList
//        LinkedList<String> linkedList = new LinkedList<>();
//
//        // Adding elements to the LinkedList
//        linkedList.add("Apple");
//        linkedList.add("Banana");
//        linkedList.add("Cherry");
//
//        // Accessing elements by index
//        System.out.println("First element: " + linkedList.get(0)); // Apple
//
//        // Removing an element by index
//        linkedList.remove(1); // Removes "Banana"
//
//        // Printing all elements
//        System.out.println("LinkedList after removal: " + linkedList); // [Apple, Cherry]
//    }
//}




