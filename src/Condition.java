import java.util.Scanner;


public class Condition {
    /**
     * this is my main method of condition class
     * @param args
     */
    public static void main(String[] args){

        
       // turnary();

       //calculateGrade();

       calculateMonth();
       
     
      
         };

    static  void ifElse(){
        Scanner input = new Scanner(System.in);
         System.out.print("Enter Your age : ");
        int age = input.nextInt();
        if (age < 0){
            System.out.println("Invalid age");
        }
        else if (age < 18) {
            System.out.println("You are underaged");
            
        }else if( age <= 60){
            System.out.println("You are eligible for working");

        }else if (age > 60){
            System.out.println("You are senior citizen");
        }

         input.close();
    }

   static  void turnary(){
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter first number : ");

        int num1 = input.nextInt();
         System.out.println(" Enter second number : ");
        int num2 = input.nextInt();

        

        int minimum = (num1 < num2) ? num1 : num2 ;

        System.out.println("the minimum no is : "+ minimum);




    }

  static   void calculateGrade ( ){
         Scanner input = new Scanner(System.in);
        System.out.println(" Enter Your marks : ");

        int marks = input.nextInt();

      
        String grade = ( marks > 80) ? " High" : ( ( marks > 50) ? "Morderate" : "Low");

        System.out.println("Your grade is : " + grade);

    }

    static void calculateMonth(){

         Scanner input = new Scanner(System.in);
        System.out.println(" Enter Your number for getting month : ");

        int number = input.nextInt();

    //  switch (number){
    //     case 1 :
    //         System.out.println("January");
    //         break;
    //     case 2 :
    //         System.out.println("Fubruary");
    //         break;
    //     case 3 :
    //         System.out.println("March");
    //         break;
    //     case 4 :
    //         System.out.println("April");
    //         break;
    //     case 5 :
    //         System.out.println("May");
    //         break;
    //     case 6 :
    //         System.out.println("June");
    //         break;
    //     case 7 :
    //         System.out.println("july");
    //         break;
    //     case 8 :
    //         System.out.println("August");
    //         break;
    //     case 9 :
    //         System.out.println("Sep");
    //         break;
    //     default:
    //         System.out.println("Invalid");
    //  }

    String month = switch(number){
        case 1 -> " Jan";
        case 2 -> " Feb";
        case 3,4,
        5,6,7 -> " Mon in Year";
        default->"Invalid";
    };

    System.out.println(" the month in new switch :"+ month);

    }

}
