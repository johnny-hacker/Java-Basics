import java.util.HashSet;

public class HashSetAddRemoveResult {
   public static void main(String[] args) {
      // Creating a HashSet named 'ownedBooks' to store book titles
      HashSet<String> ownedBooks = new HashSet<String>();

      // Variables to store the result of add and remove operations
      boolean addResult;
      boolean removeResult;

      // Adding book titles to the HashSet
      ownedBooks.add("A Tale of Two Cities");
      ownedBooks.add("The Lord of the Rings");
      ownedBooks.add("Le Petit Prince");

      // Attempting to add "Le Petit Prince" again to the HashSet
      // As HashSet doesn't allow duplicates, the add method returns a boolean indicating the success of addition
      addResult = ownedBooks.add("Le Petit Prince");
      System.out.println("Added \"Le Petit Prince\" again: " + addResult);

      // Attempting to remove "The Hobbit" from the HashSet
      // If the element is present and gets removed, the remove method returns true; otherwise, it returns false
      removeResult = ownedBooks.remove("The Hobbit");
      System.out.println("Removed \"The Hobbit\": " + removeResult);
   }
}

}