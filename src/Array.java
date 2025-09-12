


public  class Array {

  public static void main(String[] args) {
     int[] array = InputArray.inputArrayElements();


     long sum = sumOfArray(array);

     System.out.println("The sum of your elements is : " + sum);
    
    
    }

     public static long sumOfArray(int[] array){
      
      long sumOfElement = 0;

      for (int i = 0; i < array.length; i++) {

          if( array.length == 0){
            System.out.println("Provide size of array greater than zero");
            return 0;
          }

           sumOfElement += array[i];

          
      }

          return sumOfElement;
     };
  

     
}