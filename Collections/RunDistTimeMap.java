import java.util.HashMap;
import java.util.Scanner;

public class RunDistTimeMap {
   public static void main (String[] args) {
      // Creating a HashMap to store race distances (keys) and best times (values)
      HashMap<Integer, Double> raceTimes = new HashMap<Integer, Double>();
      Scanner scnr = new Scanner(System.in);
      int userDistKm;

      // Adding race distances and their corresponding best times to the HashMap
      raceTimes.put(5, 23.14);
      raceTimes.put(15, 78.5);
      raceTimes.put(25, 120.75);
      
      // Prompting the user to enter a race distance
      System.out.println("Enter race distance in km (0 to exit): ");
      userDistKm = scnr.nextInt();

      // Continuously loop until the user enters 0 to exit
      while(userDistKm != 0) {
         // Checking if the race distance entered by the user exists in the HashMap
         System.out.print("Best time for " + userDistKm + " km race is: ");
         if (raceTimes.containsKey(userDistKm)) {
            // If the distance exists, retrieve and print the corresponding best time
            System.out.print(raceTimes.get(userDistKm));
            System.out.println(" minutes.");
            System.out.println();
         }
         else {
            // If the distance doesn't exist, notify the user
            System.out.println("No race of the specified distance exists.");
         }
         
         // Prompting the user again to enter another race distance or exit
         System.out.println("Enter race distance in km (0 to exit): ");
         userDistKm = scnr.nextInt();         
      }      
   }
}
