package practice;

public class Demo32 {
        // Define the interface at the class level
        interface TobeImplemented {
            int add(int a, int b);
        }

        // Implement the interface in a class
        static class Test implements TobeImplemented {
            @Override
            public int add(int a, int b) {
                return a + b;
            }
        }

        public static void main(String[] args) {
            // Create an instance of Test
            Test test = new Test();

            // Use the add method
            int result = test.add(5, 3);
            System.out.println("Result: " + result);
        }
}