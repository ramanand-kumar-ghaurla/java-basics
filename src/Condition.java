import java.util.Scanner;

public class Condition {
    public static void main(String[] args){

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
    };

}
