package practice;

public class Demo33 {
    @FunctionalInterface
    interface StringFirstLetterInterface {
        void getFirstLetter(String inputString);
    }
        public static class Example1{
            public static void main(String[] args) {
                StringFirstLetterInterface stringInterface =(str)->
                        System.out.println(str.charAt(0));
            };
            //stringInterface.getFirstLetter("Jayaraj");
        }
    }


