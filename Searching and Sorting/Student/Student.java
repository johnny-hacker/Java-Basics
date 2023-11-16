/*
Student class creates:
 - instances of student object 
 - adds tobjects to an array list
 - prints out list  
*/

import java.util.ArrayList;

public class Student {
    public int rollno; // roll number
    public String name; // student name
    public String address; //student address
    // creat instance of array list to hold objects
    ArrayList<Student> StudentList = new ArrayList<Student>();
    // student default constructor
    public Student() {
        rollno = 0;
        name = "";
        address = "";
    }
    // constrctor that creates student objects
    public Student(int rollNum, String sName, String sAddress) {
        rollno = rollNum;
        name = sName;
        address = sAddress;
    }
    // method that creates 10 students then adds them to the array list
    public void add_student() {
        // create 10 students
        Student student1 = new Student(101, "Johnny", "271 street");
        Student student2 = new Student(122, "Brayden", "281 street");
        Student student3 = new Student(103, "Adam", "391 street");
        Student student4 = new Student(154, "Zebra", "381 street");
        Student student5 = new Student(105, "Michael", "231 street");
        Student student6 = new Student(111, "Evan", "341 street");
        Student student7 = new Student(197, "Quincy", "921 street");
        Student student8 = new Student(163, "Kaleb", "882 street");
        Student student9 = new Student(109, "Luis", "794 street");
        Student student10 = new Student(115, "Willy", "673 street");
        // add to list/inventory
        StudentList.add(student1);
        StudentList.add(student2);
        StudentList.add(student3);
        StudentList.add(student4);
        StudentList.add(student5);
        StudentList.add(student6);
        StudentList.add(student7);
        StudentList.add(student8);
        StudentList.add(student9);
        StudentList.add(student10);
    }
    // method prints out the array list and every object characteristsic in it
    public void print_student() {
        for (int i = 0; i < StudentList.size(); i++) {
            System.out.println("Student #" + (i+1)); // student number
            System.out.println("Student Number: " + StudentList.get(i).rollno); // roll number
            System.out.println("Student Name: " + StudentList.get(i).name); // name
            System.out.println("Student Address: " + StudentList.get(i).address); //address
            System.out.println(); // end line
        }
    }
    // method retuns array list
    public ArrayList<Student> getList() {
        return StudentList; // return list
    } 
}
