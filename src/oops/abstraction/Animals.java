package oops.abstraction;

//abstract class dont create a object it cerates only classes

abstract class Animal {
    // abstract method (no body)
     public abstract void eat();

    //regular method
    public void sleep() {
        System.out.println("Sleeping...");
    }
}
   class Dog extends Animal {
    public void eat() {
        System.out.println("The dog barks");
    }
   }
 class Cat extends Animal {
    public void eat() {
        System.out.println("The cat meows");
    }
 }
 public class Animals{
     public static void main(String[] args) {
         Animal dog = new Dog();
         Animal cat = new Cat();
         dog.eat();
         dog.sleep();
         cat.eat();
         cat.sleep();
     }
 }