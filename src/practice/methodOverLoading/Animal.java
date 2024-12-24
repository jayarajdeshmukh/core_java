package practice.methodOverLoading;

public class Animal {
       void sound(){
           System.out.println("sound");
       }
       class Dog extends Animal{
           @Override
           void sound(){
               System.out.println("barks");
           }
       }
       class main{
           public static void main(String[] args) {
               Animal myAnimal = new Animal();
               myAnimal.sound();

               myAnimal.sound();
           }
       }
}
