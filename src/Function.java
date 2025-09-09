public class  Function {
    public static  void main(String[] args){
        //createTable(2);

        // method for adding odd num till given numbers range

      int sum =   sumOddNumbers(3);

      System.out.printf("The sum of all odd numbers given by you is :-  %d", sum);

    };

    public static void  createTable(int number){

        int count ;

        for (count = 0; count <= 10; count++) {
            int multiple = count * number;
            System.out.printf("%d * %d = %d%n", count, number, multiple);
        }

    }

    public static int sumOddNumbers (int numbersCount){
        int sum = 0;

        for ( int count = 1 ; count <= numbersCount;  count++) {

            // find the odd numbersCount

            if(count % 2 != 0 && count <= numbersCount){

                sum = sum + count;
                 System.out.printf(" the count is %d and numbersCount is %d and sum is %d%n", count , numbersCount, sum);
               
            }

            
        };

        return sum ;
    }
    
}
