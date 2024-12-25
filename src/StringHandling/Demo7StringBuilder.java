package StringHandling;

//A StringBuilder helps in constructing or modifying strings more efficiently.
//It allows you to add, insert, delete, or replace parts of a string without creating a new string each time
public class Demo7StringBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("string data");
        stringBuilder.insert(0,"At the begining ");
        stringBuilder.delete(3,5); // from start to end it will delete all of them

        //append insert delete
        System.out.println(stringBuilder);

        String str = "Jay";
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.reverse();
        System.out.println(stringBuilder2);
    }

}
