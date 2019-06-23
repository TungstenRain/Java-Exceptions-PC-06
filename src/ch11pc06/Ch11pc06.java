package ch11pc06;
import java.util.Scanner;
import java.io.IOException;

/**
 *
 * @author Frank
 * date 11/28/2017
 */
public class Ch11pc06 {

    public static void main(String[] args) throws IOException {
        //variables
        int[] intArray = new int[11];
        String fileName1, fileName2;
        
        //instantiate Scanner object keyboard
        Scanner keyboard = new Scanner(System.in);
        
        //Request file names from user:
        System.out.print("Please enter the file name to be read from. ");
        fileName1 = keyboard.nextLine();
        System.out.print("Please enter the file name to be written to. ");
        fileName2 = keyboard.nextLine();
        
        FileArray.readArray(fileName1, intArray);
        System.out.println(fileName1 + " has been read from.");
        
        FileArray.printArray(intArray);
        
        FileArray.writeArray(fileName2, intArray);
        System.out.println(fileName2 + " has been written to.");
    }
    
}
