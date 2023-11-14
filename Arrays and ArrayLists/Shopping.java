import java.util.Scanner;
import java.util.ArrayList;

public class Shopping {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Create an ArrayList to store items in the shopping cart
            ArrayList<String> shoppingCart = new ArrayList<String>();
            
            // Variables to store user input
            String shopping;
            String newItem;

            // Prompt the user to start shopping
            System.out.print("You're about to start shopping, would you like to continue? [Yes/yes] ");
            shopping = sc.nextLine();

            // Continue shopping as long as the user enters "Yes" or "yes"
            while (shopping.equals("Yes") || shopping.equals("yes")) {
                // Prompt the user to enter the name of the item to add to the cart
                System.out.print("Enter the name of the item you want to add to your cart: ");
                newItem = sc.nextLine();
                
                // Add the new item to the shopping cart
                shoppingCart.add(newItem);

                // Ask the user if they want to continue shopping
                System.out.print("Would you like to continue shopping? [Yes/yes] ");
                shopping = sc.nextLine();
            }

            // Display the contents of the shopping cart
            System.out.println("Items in your shopping cart: " + shoppingCart);
        }
    }
}
