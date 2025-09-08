
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter Your name please : ");
        String name = userInput.nextLine();
        System.out.println("Good morning " + name);

        System.out.print("enter your age also please: ");
        int age = userInput.nextInt();
        System.out.print( name + " your age is " + age);
        userInput.close();
    }

}
