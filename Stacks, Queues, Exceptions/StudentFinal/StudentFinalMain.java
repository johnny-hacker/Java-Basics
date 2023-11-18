/*
This is the Main for StudentFinal class, alloing the program to sort 4 student objects retrieved from user
*/

public class StudentFinalMain {
    // create intsnace of StudentFinal class
    static StudentFinal student = new StudentFinal();
    
    public static void main(String[] args) {
        System.out.println("Please enter 4 Student names, addresses, and GPAs: ");
        // call method to load all 10 student objects into an array list
        student.add_student();
        
        // show what this list currently looks like with no sorting
        System.out.println("Without any sorting: ");
        student.print_student();
        
        // now show what it looks like to sort by name
        student.sort_student();
        // print to student.txt file
        student.print_file();
        System.out.println("Sorted in ascending order by name: ");
        // print out to console
        student.print_student();
    }
    
}