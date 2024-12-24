package practice;

public class Demo21 {
        public static void main(String[]args){
            String NumberToPrint= switch(2){
                case 1-> "One";
                case 2->"Two";
                case 3->"Three";
                default-> "None of number";
            };
            System.out.println(NumberToPrint);
        }
    }

