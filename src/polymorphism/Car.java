package polymorphism;

// practise for overriding in java
public class Car extends  Vehcle{

    String name = "Car";

   Car(){

    super("Car");
   }

   @Override
    void service(){

        System.out.println("Inherherited class 'car' service time is " + super.serviceDuration);
        super.service();

   }

   public static void main(String[] args) {
    
    Car car = new Car();

    car.service();


   }

    
}
