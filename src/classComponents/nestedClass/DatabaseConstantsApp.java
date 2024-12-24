package classComponents.nestedClass;

public class DatabaseConstantsApp {
    public static void main(String[] args) {
        System.out.println("Mysql Dev credentials");
        System.out.println(Constants.MySql.Dev.username);
        System.out.println(Constants.MySql.Dev.password);

        System.out.println("Mysql QA credentials");
        System.out.println(Constants.MySql.QA.username);
        System.out.println(Constants.MySql.QA.password);

        System.out.println("Mysql Prod credentials");
        System.out.println(Constants.MySql.Prod.username);
        System.out.println(Constants.MySql.Prod.password);
    }
}
