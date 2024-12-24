package controlStatement.conditionalOrDecisonMaking.switchDemos;

public class Demo6 {
    public static void main(String[] args) {
        String NumberToPrint = switch (3) {
            case 1 -> "One";
            case 2 -> "Two";
            case 3 -> "Three";
            case 4 -> "Four";
            default -> "Invalid number";
        };
            System.out.println(NumberToPrint);
        }
    }
