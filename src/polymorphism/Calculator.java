package polymorphism;

// this the the practice of method overloading 
public class Calculator {
    
    public int add(int a, int b){
        return a + b;
    }

    public int add(int a , int b , int c ){
        return (a + b + c);
    }

    public double add( double a , double b ){
        return  a + b;
    }

    public static void main(String[] args) {
        
        Calculator cl = new Calculator();

       double a = cl.add(10344.3 , 689.4);
       System.out.println(a);

       System.out.println(cl.add(2, 5));
       System.out.println(cl.add(20, 90, 23));
    }
}
