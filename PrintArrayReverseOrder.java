/*
Module 5 Option 1
Programmer: Olmedo, Johnny
CSC 400
Submission date: 06/15/2022 
This is class takes an array and reversed the order using recursion
*/

public class PrintArrayReverseOrder {

	public static void ReverseArray(int arr[], int n) // pass array and size of array
	{
		int i = n; // set i = length of array 
		// as long as the size of the array is not 0
		// iterate through array and print out the last array element 
	    if(n>0)
	    {
	    	System.out.print(arr[i-1]+" "); // print
	    	ReverseArray(arr, i - 1); // recursively call array and subtract 1 from length
	    }	
	}
}