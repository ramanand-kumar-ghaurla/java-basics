package fileHandling;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileReader {
    

    void fileReader( String fileName){

       

        

        try ( java.io.FileReader reader = new java.io.FileReader(fileName)) {
            
           
        int read = 0;

            do { 

                 read = reader.read();

                 System.out.print( (char)read);

            } while (read != -1);
        }catch( FileNotFoundException e){
            System.out.printf("%s does not exists , provide a valid filename please : %s", fileName, e.getMessage());
        } 
        catch (IOException e) {
            System.out.printf(" Error in reading file : %s", e.getMessage());
        


    }
}

public static void main(String[] args) {

     Scanner input = new Scanner(System.in);

        System.out.println("Enter file name to read : ");

        String fileName = input.nextLine();
    
    FileReader filereader = new FileReader();

    filereader.fileReader(fileName);
}

}