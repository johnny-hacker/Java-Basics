/*
Student class creates:
 - instances of student object 
 - adds tobjects to a linked list
 - sorts student list in ascending order
 - prints out list to student.txt file
*/

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Collections;
import java.util.InputMismatchException;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.lang.reflect.Field;  

/* implements Comparable<StudentFinal> means that this class implements the Comparable interface and specifies 
that it can compare instances of the StudentFinal class with other instances of StudentFinal */

public class StudentFinal implements Comparable<StudentFinal> {
    private Double gpa; // student gpa
    private String name; // student name
    private String address; //student address
    Scanner sc = new Scanner(System.in);
    // creat instance of linked list to hold objects
    LinkedList<StudentFinal> StudentList = new LinkedList<StudentFinal>(); 

    // student default constructor
    public StudentFinal() {
        gpa = 0.0;
        name = "";
        address = "";
    }
    // constrctor that creates student objects
    public StudentFinal(String sName, String sAddress, Double sGpa) {
        gpa = sGpa;
        name = sName;
        address = sAddress;
    }

    // method that creates 4 students then adds them to the linked list
    // method also does input validation on gpa
    public void add_student() {
        // go through and collect student info on 4 students from user
        for (int i = 0; i < 4; i++) {
            // get student name
            System.out.print("Name: ");
            String get_name = sc.nextLine();
            // get student address
            System.out.print("Address: ");
            String get_address = sc.nextLine();
            // get student GPA
            System.out.print("GPA: ");
            // call validate_gpa method to get user input for gpa
            Double get_gpa = validate_gpa();
            // take each input and pass it to studentFinal contsructor to create student object
            // simultaneously add new student object to student linked list
            StudentList.add(new StudentFinal(get_name, get_address, get_gpa));
            System.out.println(); // new line
        }
    }

    // Method collects gpa from user and validates the input is of type double
    public double validate_gpa() {
        // while true, will continue until user enters correct input and returns double value
        while (true) {
            // try collecting gpa
            try {
                // get gpa
                gpa = Double.parseDouble(sc.nextLine());
                return gpa; // will only get to here if input was a double
            } catch (NumberFormatException ignore) { // catch error if user doesn't enter in a double
                System.out.print("Incorrect input for GPA. Please enter a valid numeric GPA: ");
            } catch(InputMismatchException ignore) { // catch error if user doesn't enter in a double
                System.out.println("Incorrect input for GPA. Please enter a valid numeric GPA: ");
            }
        }
    } 

    // Method sorts student list
    public void sort_student() {
        // use collections to sort linked list
        Collections.sort(StudentList);            
    }
    
    // method prints out the linked list and every object characteristsic in it
    public void print_student() {
        for (int i = 0; i < StudentList.size(); i++) {
            System.out.println("Student #" + (i+1)); // student number
            System.out.println("Student GPA: " + StudentList.get(i).gpa); // gpa
            System.out.println("Student Name: " + StudentList.get(i).name); // name
            System.out.println("Student Address: " + StudentList.get(i).address); //address
            System.out.println(); // end line
        }
    }

    // method prints out each instance of student info from student list out onto a file
    public void print_file() {
        FileOutputStream fileStream = null;
        PrintWriter outFS = null;
        // try to open file
        try {
            fileStream = new FileOutputStream("C:/Users/johnn/OneDrive/Documents/Java/Programming II/Student.txt");
        } 
        // catch if file is not found
        catch (FileNotFoundException e) {
            // if the file is not found catch the exception
            System.out.print("File path not found");
        }

        // write out banner
        outFS = new PrintWriter(fileStream);
        outFS.println("\n----------------");
        outFS.println("  STUDENT INFO");
        outFS.println("----------------");
        // print everything to the file
        for (int i = 0; i < StudentList.size(); i++) {
            outFS.println("Student #" + (i+1)); // student number
            outFS.println("Student GPA: " + StudentList.get(i).gpa); // roll number
            outFS.println("Student Name: " + StudentList.get(i).name); // name
            outFS.println("Student Address: " + StudentList.get(i).address); //address
            outFS.println(); // end line
        }
        // close file
        outFS.close();
    }

    // override
    @Override
    // method compares the name of student objects to sort in ascending order
    public int compareTo(StudentFinal o) {
        // return the name that comes first alphabetically
        return name.compareTo(o.name);
    } 
    
}
