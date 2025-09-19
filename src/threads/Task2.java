package threads;

public class Task2 extends Thread{

    private String threadName;

    @Override

     public void run(){
       this.threadName = Thread.currentThread().getName();

       for (int i = 0; i < 10; i++) {

     System.out.printf(" thread name is  %s and private member is (%s) and number is (%d) %n ", Thread.currentThread().getName(), this.threadName , i);
   
           
       }
    }

  
   
    
}
