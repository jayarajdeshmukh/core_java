package StringHandling;
/*                   1. Concatenation
You can concatenate strings using the + operator or concat() method.
String str1 = "Hello";
String str2 = "World";
String result = str1 + " " + str2;  // Output: "Hello World"
String result2 = str1.concat(" ").concat(str2);  // Output: "Hello World"

                   2. Length
You can get the length of a string using the length() method.
String str = "Hello";
int length = str.length();  // Output: 5

                   3. Substring
The substring() method extracts a portion of the string.
String str = "Hello, World!";
String subStr = str.substring(0, 5);  // Output: "Hello"

                    4. Index of a Substring
To find the position of a substring within a string, you can use the indexOf() method.
String str = "Hello, World!";
int index = str.indexOf("World");  // Output: 7

                    5. Replacing a Substring
The replace() method replaces characters or substrings in the string.
String str = "Hello, World!";
String newStr = str.replace("World", "Java");  // Output: "Hello, Java!"

                     6. Splitting a String
You can split a string into an array of substrings using the split() method.
String str = "apple,banana,cherry";
String[] fruits = str.split(",");  // Output: ["apple", "banana", "cherry"]

                     7. Trimming Whitespace
The trim() method removes leading and trailing whitespace.
String str = "  Hello, World!  ";
String trimmed = str.trim();  // Output: "Hello, World!"

                      8. Changing Case
To convert a string to upper or lower case, use the toUpperCase() and toLowerCase() methods.
String str = "Hello";
String upperStr = str.toUpperCase();  // Output: "HELLO"
String lowerStr = str.toLowerCase();  // Output: "hello"

                       9. Checking if a String Contains Another String
Use contains() to check if a substring exists in the string.
String str = "Hello, World!";
boolean contains = str.contains("World");  // Output: true

                       10. String Comparison
To compare strings, you can use equals() or equalsIgnoreCase() for case-insensitive comparison.
String str1 = "hello";
String str2 = "Hello";
boolean isEqual = str1.equals(str2);  // Output: false
boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2);  // Output: true

                       11. String Formatting
Use String.format() or System.out.printf() for formatted strings.
String name = "Alice";
int age = 30;
String formatted = String.format("My name is %s and I am %d years old.", name, age);  // Output: "My name is Alice and I am 30 years old."

                        12. StringBuilder for Mutable Strings
Since String is immutable in Java, for efficient string manipulation (especially in loops), use StringBuilder.
StringBuilder sb = new StringBuilder("Hello");
sb.append(", World!");  // Output: "Hello, World!"
String result = sb.toString();

                        13. Checking if a String is Empty or Null
Use isEmpty() and isBlank() (since Java 11) to check if a string is empty or contains only whitespace.
String str = "   ";
boolean isEmpty = str.isEmpty();  // Output: false
boolean isBlank = str.isBlank();  // Output: true

 */


public class Notes {

}
