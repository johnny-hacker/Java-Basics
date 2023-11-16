import java.util.Scanner;

public class IndexOf {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String searchStr = "";
        String patternStr = "";
        int index = -1;
        boolean done = false;
        
        // Loop to continuously prompt for string and pattern until "Q" is entered
        while (!done) {
            System.out.print("Enter a string to search for a pattern or \"Q\" to quit.");
            searchStr = in.next();
            
            // If "Q" is entered, terminate the loop
            if (searchStr.equals("Q")) {
                done = true;
                continue;
            }
            
            System.out.print("Enter a pattern to find the index of in the search string.");
            patternStr = in.next();

            if (searchStr.length() > 1) {
                System.out.println("You are searching for the index of pattern \"" + patternStr
                        + "\" in string \"" + searchStr + "\".");
                String origString = searchStr;
                index = indexOf(searchStr, patternStr);

                if (index >= 0) {
                    System.out.println("\nThe index of \"" + patternStr + "\" in the string \"" + origString
                            + "\" is " + index + ".");
                } else {
                    System.out.println("\n\"" + patternStr + "\" was NOT found in the string \"" + searchStr + "\".");
                }
            }
        }
    }

    // Method to find the index of a pattern in a string
    public static int indexOf(String s, String contains) {
        if (contains.length() > s.length()) {
            return -1;
        }
        return indexOf(s, contains, 0);
    }

    // Recursive method to find the index of a pattern in a string
    private static int indexOf(String s, String contains, int index) {
        // Base case: If substring is longer than the remaining string, return -1
        if (s.length() - index < contains.length()) {
            return -1;
        }
        
        // Check if the substring matches the pattern
        if (s.substring(index, index + contains.length()).equals(contains)) {
            return index;
        } else {
            // Recursive call to search for the pattern in the next index position
            return indexOf(s, contains, index + 1);
        }
    }
}
