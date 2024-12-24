package controlStatement.conditionalOrDecisonMaking.switchDemos;

public class Demo1 {
    //In switch value can be must of type = byte,short,int,char,integer value also allowed
    // Float,double,boolean(true, false), not allowed
    // After java12 you dont need to write break statement
     public static void main(String[] args)
    {
        int monthNumber = 7;
        switch (monthNumber) {
            case 1 -> System.out.println("Jan");
            case 2 -> System.out.println("Feb");
            case 3 -> System.out.println("March");
            case 4 -> System.out.println("Apr");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("June");
            case 7 -> System.out.println("July");
            case 8 -> System.out.println("Aug");
            case 9 -> System.out.println("Sep");
            case 10 -> System.out.println("Oct");
            case 11 -> System.out.println("Nov");
            case 12 -> System.out.println("Dec");
            default -> System.out.println("Invalid month number");
        }
    }
}