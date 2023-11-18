// demonstrates reading characters from a file, handles potential exceptions that might occur during 
// file operations, and ensures proper resource clean-up by closing the file in the finally block.
import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;

public class FileReadChars {
   /* Method closes a FileReader. 
      Prints exception message if closing fails */
   public static void closeFileReader(FileReader fileName) {
      try {
         if (fileName != null) { // Ensure "file" references a valid object
            System.out.println("Closing file.");
            fileName.close(); // close() may throw IOException if fails
         }
      } catch (IOException closeExcpt) {
         System.out.println("Error closing file: " + closeExcpt.getMessage());
      }
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      FileReader fileCharStream = null; // File stream for reading chars
      String fileName;                  // User defined file name
      int charRead;                     // Data read from file

      charRead = 0;

      // Get file name from user
      System.out.print("Enter a valid file name: ");
      fileName = scnr.next();

      try {
         // Prompt user for input
         System.out.println("Opening file " + fileName + ".");
         fileCharStream = new FileReader(fileName); // May throw FileNotFoundException

         // Use file input stream
         System.out.print("Reading character values: ");
         while (charRead != -1) { // -1 means end of file has been reached
            charRead = fileCharStream.read(); // May throw IOException
            System.out.print(charRead + " ");
         }
         System.out.println();
      } catch (IOException excpt) {
         System.out.println("Caught IOException: " + excpt.getMessage());
      } finally {
         closeFileReader(fileCharStream); // Ensure file is closed!
      }
   }
}