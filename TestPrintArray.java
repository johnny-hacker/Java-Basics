/*
Module 5 Option 1
Programmer: Olmedo, Johnny
CSC 400
Submission date: 06/15/2022 
This is class takes tests PrintArrayReverseOrder class
*/

public class TestPrintArray {
    public static void main(String[] args) {
        // initilize array
        int[] myNum = {10, 20, 30, 40};
        // print the array out
        System.out.println("Before reverse: ");
        for (int i = 0; i < myNum.length;i++) {
            System.out.print(myNum[i] + " ");
        }
        System.out.println(); // new line
        // reverse array and print to user
        System.out.println("After Reverse: ");
        PrintArrayReverseOrder.ReverseArray(myNum, myNum.length); // call ReverseArray function

    }
}
