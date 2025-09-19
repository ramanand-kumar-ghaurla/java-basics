package threads;

public class BasicThread {

    public static void main(String[] args) throws InterruptedException {
        
        Task t1 = new Task();
        Task2 t2 = new Task2();

         
       
         System.out.println( " from main Thread before start"+" " +t1.getState());
       
         t1.start();
        System.out.println( " from main Thread after start"+" " +t1.getState());

        while(t1.isAlive()){
           System.out.println( " from main Thread in while loop before sleep"+" " +t1.getState());

            t1.sleep(5000);
            System.out.println( " from main Thread in while loop after sleep"+" " +t1.getState());
        }

     System.out.println( " from main Thread outside the while loop"+" " +t1.getState());
      
      

       
        

       
    }
    
}
