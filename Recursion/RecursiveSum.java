import java.util.Scanner;
public class RecursiveSum{
    // recursive method
   public static int RecursiveSum(int my_array[], int i,int N){
      // Base Case: 
      // Terminates when i equals 5, or the "length" of the array
      if (i == N) 
         return 0;
      // should start at 0 and add the next element in front
      return my_array[i] + RecursiveSum(my_array, i + 1,N);
   }

// main 
   public static void main(String[] args){
     int N, my_sum, i; // declare variables
     N = 5;     // 5 inputs
     int my_array[] = new int[N]; // create array with 5 elements
     my_sum = 0;
     Scanner my_scanner = new Scanner(System.in);
     // ask user for 5 inputs
     System.out.print("Enter 5 numbers you would like to find the sum total of : ");
     // go through and retrieve the 5 inputs from the user
     for ( i = 0 ; i < N ; i++ ){
        my_array[i] = my_scanner.nextInt();
     }
     // call my_sum function
     my_sum = RecursiveSum(my_array, 0, N);
     // print out the sum
     System.out.println("\n The total of N numbers is : " + my_sum);
   }
}