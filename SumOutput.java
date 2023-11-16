public class SumOutput {

    public static int Sum(int num) {
        if (num > 0) {
            System.out.println(num); // Print the number
            return num + Sum(num - 1); // Recursive call to Sum method with num-1 and summing up the result
        } else {
            System.out.println(num); // Print '0' when num reaches 0
            return num;
        }
    }

    public static void main(String[] args) {
        int check = Sum(10);
        System.out.println("Sum: " + check); // Print the final sum
    }
}

