package oops.polymorphism.MethodOverriding;

//Superclass (Vehicle) has a method fuelType() that prints "Vehicle uses fuel".
//Subclass 1 (Car) overrides the fuelType() method to print "Car uses petrol or diesel".
//Subclass 2 (ElectricCar) overrides the fuelType() method to print "Electric car uses electricity".


public class Vehicle {                 // parent class or super class
    void fuelType(){
        System.out.println("Vehicle uses fuel");
    }
}
 class Car extends Vehicle {
    @Override
     void fuelType() {
        System.out.println("Car uses petrol or diesel");
    }
 }
  class ElectricVehicle extends Vehicle {
    @Override
      void fuelType() {
        System.out.println("Electric car uses electricity");
    }
  }
   class jay{
       public static void main(String[] args) {
           // Creating an object of Vehicle class
        Vehicle vehicle = new Vehicle();
        vehicle.fuelType(); // Output: Vehicle uses fuel

           // Creating an object of Car class
           Car car = new Car();
           car.fuelType(); // Car uses petrol or diesel

           // Creating an object of Electric vehicle class
           ElectricVehicle electricVehicle = new ElectricVehicle();
           electricVehicle.fuelType(); // Electric car uses electricity
       }
   }