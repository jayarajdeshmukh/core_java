package controlStatement.conditionalOrDecisonMaking.switchDemos;

public class Demo4 {
    public static void main(String[] args) {
        byte month= 7;
        String monthToprint = switch(month) {
            case 1->"Jan";
            case 2->"Feb";
            case 3->"March";
            case 4->"Apr";
            case 5->"May";
            case 6->"Jun";
            case 7->"July";
            case 8->"Aug";
            case 9->"Sep";
            case 10->"Oct";
            case 11->"Nov";
            case 12->"Dec";
            default -> "Invalid Month";
        };
        System.out.println(monthToprint);
    }
}
