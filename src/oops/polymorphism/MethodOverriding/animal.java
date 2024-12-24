package oops.polymorphism.MethodOverriding;

public class animal {
    // parent class or super class
    void sound(){
        System.out.println("animal  makes a sound");
    }
}
 class dog extends animal {
     // Method in the subclass (Child class) overriding the superclass method
     @Override
    void sound(){
        System.out.println("dog barks");
    }
 }
      class Main{
    public static void main(String[] args) {
        animal myAnimal = new animal();// creating an object of animal class
        animal myDog = new dog();  // creating an object of dog class

        myAnimal.sound(); //
        myDog.sound();

    }
 }
