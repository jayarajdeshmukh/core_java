package classComponents.thisKeyword;

public class Student {
    int id;
    String name;
    int age;

    // zero param
    public Student() {
    }

    // param
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
