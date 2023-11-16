/*
This is the Main for Student class, alloing the program to sort 10 student objects
*/

public class StudentMain {
    // create intsnace of Student class
    static Student student = new Student();
    // create instance of StudentNameSort class
    static StudentNameSort nameSort = new StudentNameSort();
    // create instance of StudentRollNoSort class
    static StudentRollNoSort rollSort = new StudentRollNoSort();
    public static void main(String[] args) {
        // call method to load all 10 student objects into an array list
        student.add_student();
        
        // show what this list currently looks like with no sorting
        System.out.println("Without any sorting: ");
        student.print_student();
        
        // now show what it looks like to sort by name
        // call doSelectionSort method from StudentNameSort
        nameSort.doSelectionSort(student.getList()); // pass the list from Student class
        System.out.println("============== SELECTION SORT BY NAME ============ ");
        student.print_student();

        // display what the list looks like sorting by roll number
        // call doSelectionSort from StudenRollNoSort class
        rollSort.doSelectionSort(student.getList()); // pass array list from student class
        System.out.println("\"============== SELECTION SORT BY NUMBER ============ \"");
        student.print_student();
    }
    
}
