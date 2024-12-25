package StringHandling;

public class Demo6Methods {
    public static void main(String[] args) {
        String courses = "java,python,nodeJS,Devops";
        // split = it will split the courses
        String[] splitString = courses.split(",");
        for (String course : splitString) {
            System.out.println(course);

        }
            //blank : Returns true if the string is empty or contains only white space codepoints, otherwise false.
            String str = "     ";
            String str2 = null;
            System.out.println("Is string blank " + str.isBlank());// true

//        String str = "Hello";
//        String str2 = null;
//        System.out.println("Is string blank " + str.isBlank());// false

        // lenght==0--> true else false
        System.out.println("Is String empty " + str.isEmpty());//false

        // search
        System.out.println(courses.contains("java"));//true

        String str7 = "Abc";
        System.out.println(str7.codePointAt(0));//65
        System.out.println(str7.codePointAt(1));//98

        System.out.println("Character array");
        char[] charArray = str7.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            System.out.println(charArray[i]+' ');
        }
        // reverse method is not there in string class
        System.out.println("reversing the string");
        String string="good morning boys, yes its morning";
        //  string reverse();

        String reverseString="";
        for(int index = reverseString.length()-1;index>=0;index--){
          reverseString+=reverseString.charAt(index);
        }
        System.out.println(reverseString);
    }
}
