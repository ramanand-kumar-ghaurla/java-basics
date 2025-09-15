package polymorphism;

 abstract public class Vehcle {

    private String name;
   int serviceDuration = 3;

    Vehcle(String name ){

        this.name = name;

    }

    void service(){
        System.out.println( this.name + " is need to be serviced in  " + this.serviceDuration );
    }

    
    
}
