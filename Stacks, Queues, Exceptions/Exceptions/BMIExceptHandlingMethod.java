// program Evalues BMI, But also throws exceptions if user enters incorrectlty
import java.util.Scanner;

public class BMIExceptHandlingMethod {
   // Method to get user weight, throws exception for negative values
   public static int getWeight() throws Exception {
      Scanner scnr = new Scanner(System.in);
      int weightParam;      // User defined weight (lbs)

      // Get user data
      System.out.print("Enter weight (in pounds): ");
      weightParam = scnr.nextInt();

      // Error checking, non-negative weight
      if (weightParam < 0) {
         // throw error exception message
         throw new Exception("Invalid weight.");
      }
      return weightParam;
   }

   // Method to get user height, throws exception for negative values
   public static int getHeight() throws Exception {
      Scanner scnr = new Scanner(System.in);
      int heightParam;      // User defined height (in)

      // Get user data
      System.out.print("Enter height (in inches): ");
      heightParam = scnr.nextInt();

      // Error checking, non-negative height
      if (heightParam < 0) {
         // throw error exception message
         throw new Exception("Invalid height.");
      }
      return heightParam;
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int weightVal;        // User defined weight (lbs)
      int heightVal;        // User defined height (in)
      float bmiCalc;        // Resulting BMI
      char quitCmd;         // Indicates quit/continue

      quitCmd = 'a';

      // Continuously prompts for user data until 'q' is entered
      while (quitCmd != 'q') {
         try {
            // Get user data
            weightVal = getWeight();
            heightVal = getHeight();

            // Calculate BMI and print user health info if no input error
            // Source: http://www.cdc.gov/
            bmiCalc = ((float) weightVal / (float) (heightVal * heightVal)) * 703.0f;

            System.out.println("BMI: " + bmiCalc);
            System.out.println("(CDC: 18.6-24.9 normal)");
         } catch (Exception excpt) {
            // Handles exceptions raised during input (negative values)
            // calls for the message thrown in the exception
            System.out.println(excpt.getMessage());
            System.out.println("Cannot compute health info");
         }

         // Prompt user to continue/quit
         System.out.print("\nEnter any key ('q' to quit): ");
         quitCmd = scnr.next().charAt(0);
      }
   }
}
