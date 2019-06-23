package ch11pc06;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Frank
 */
public class FileArray {
    //methods
    public static void writeArray(String fileName, int[] intArray) throws IOException {
        //open file as a binary file
        //contents of array written to the file
        //close the file
        
        //instantiate FileOutputStream and DataOutputStream classes
        FileOutputStream fileStream = new FileOutputStream(fileName);
        DataOutputStream outputFile = new DataOutputStream(fileStream);
        
        for (int i = 0; i < intArray.length; i++) {
            outputFile.writeInt(intArray[i]);
        }
        outputFile.close();
    }
    
    public static void readArray(String fileName, int[] intArray) throws IOException {
        //open the file
        //read the file and store in the array
        //close the file
        
        //instantiate FileInputStream and DataInputStream classes
        FileInputStream fileStream = new FileInputStream(fileName);
        DataInputStream inputFile = new DataInputStream(fileStream);
        
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = inputFile.readInt();
        }
        inputFile.close();
    }
    
    public static void printArray (int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
}
