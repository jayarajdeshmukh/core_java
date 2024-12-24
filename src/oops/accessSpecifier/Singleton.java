package oops.accessSpecifier;

public class Singleton {

    // singleton= only one object will be created
    private static Singleton instance;

    private Singleton(){    // constructor (cannot access outside the class)

    }

    public static Singleton getInstance(){
        if (instance == null){  // reference which is type of singleton
            instance = new Singleton();
        }
        return instance;
    }
}
