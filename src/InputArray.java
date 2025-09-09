import java.util.Scanner;

public class InputArray {
   
    public static int[] inputArrayElements(){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of array : ");
        int size = input.nextInt();

        int[] arr = new int[size];




        if( size == 0){
            System.out.println("Provide size of array greater than zero");
            return arr;
        };

        int i = 0;
        while (i < arr.length){
            System.out.println("Enter the element of array Element No. " + i);
            int element = input.nextInt();
            arr[i] = element;
            i++;
        }
        return arr;
    };

    }
