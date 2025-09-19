package enums;

import java.util.Scanner;

public class Week {

    public static void main(String[] args) {
        
       Week week = new Week();

       week.dayPlanner();

    }

    void dayPlanner(){

       try{
         Scanner input = new Scanner(System.in);

        System.out.println("Enter the day pealse : ");

        Day day = Day.valueOf(input.nextLine().toUpperCase());

          if(day.getInfo() == "WeekDay"){

                System.out.printf("Today is %s and it is %s %n", day, day.getInfo());
                
            }else{
                System.out.printf("this is %s and is is %s %n", day, day.getInfo());
            }

       }catch(Exception e){

        System.out.println("enter a valid day in all capital letter : " + e.getMessage());
       }

    }
    
}
