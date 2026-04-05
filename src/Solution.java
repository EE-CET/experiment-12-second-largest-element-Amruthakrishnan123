import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Check if there is an input for N
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();

        // Use long to handle cases where array contains Integer.MIN_VALUE
        long largest = Long.MIN_VALUE;
        long secondLargest = Long.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (!sc.hasNextInt()) break;
            int current = sc.nextInt();

            if (current > largest) {
                // The old largest becomes the second largest
                secondLargest = largest;
                largest = current;
            } else if (current > secondLargest && current < largest) {
                // Current is smaller than largest but bigger than secondLargest
                secondLargest = current;
            }
        }

        // Print the result (casting back to int or printing the long)
        // If secondLargest is still Long.MIN_VALUE, it means no 2nd largest exists
        System.out.println(secondLargest);

        sc.close();
    }
}