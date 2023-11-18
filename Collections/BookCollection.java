import java.util.HashSet;

public class BookCollection {
    public static void main(String[] args) {
        // Create a HashSet named 'ownedBooks' to store book titles
        HashSet<String> ownedBooks = new HashSet<String>();

        // Add books to the HashSet
        ownedBooks.add("A Tale of Two Cities");
        ownedBooks.add("The Lord of the Rings");

        // Check if the HashSet contains "A Tale of Two Cities" and print the result
        System.out.println("Contains \"A Tale of Two Cities\": " +
                ownedBooks.contains("A Tale of Two Cities"));

        // Remove "The Lord of the Rings" from the HashSet
        ownedBooks.remove("The Lord of the Rings");

        // Check if the HashSet contains "The Lord of the Rings" and print the result
        System.out.println("Contains \"The Lord of the Rings\": " +
                ownedBooks.contains("The Lord of the Rings"));
    }
}
