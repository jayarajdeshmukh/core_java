package StringHandling;

//StringBuffer is synchronized, which means it is thread-safe.
// Multiple threads can safely use a StringBuffer at the same time without causing issues.
//StringBuilder is not synchronized, meaning it is not thread-safe.
// If multiple threads access a StringBuilder at the same time, it might lead to errors unless external synchronization is applied.
public class Demo8StringBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("string data");
        stringBuilder.insert(0,"At the begining ");
        stringBuilder.delete(3,5); // from start to end it will delete all of them

        //append insert delete
        System.out.println(stringBuilder);

        String str = "Jay";
        StringBuilder stringBuilder2 = new StringBuilder(str);
        stringBuilder2.reverse();
        System.out.println(stringBuilder2);
    }

}
