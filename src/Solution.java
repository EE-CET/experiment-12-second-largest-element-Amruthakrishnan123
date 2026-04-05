import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        
        // Use long to safely handle the full range of integers
        long largest = Long.MIN_VALUE;
        long secondLargest = Long.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (!sc.hasNextInt()) break;
            int current = sc.nextInt();

            if (current > largest) {
                // Shift the old largest to secondLargest
                secondLargest = largest;
                largest = current;
            } else if (current > secondLargest) {
                // KEY CHANGE: Removed the "current < largest" check.
                // This allows secondLargest to be equal to largest 
                // if the maximum value appears more than once.
                secondLargest = current;
            }
        }

        System.out.println(secondLargest);
        sc.close();
    }
}