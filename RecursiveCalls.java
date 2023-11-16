public class RecursiveCalls {
    // Method to print the alphabet in reverse order recursively
    public static void backwardsAlphabet(char currLetter) {
        if (currLetter == 'a') {
            System.out.println(currLetter); // Print 'a' when the current letter reaches 'a'
        } else {
            System.out.print(currLetter + " "); // Print the current letter
            backwardsAlphabet((char) (currLetter - 1)); // Recursively call with the previous letter
        }
    }

    public static void main(String[] args) {
        char startingLetter = 'z'; // Starting letter is 'z'

        backwardsAlphabet(startingLetter); // Start printing the alphabet in reverse from 'z'
    }
}
