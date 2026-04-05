import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read size of array
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int current = sc.nextInt();

            if (current > largest) {
                // Update both if new maximum is found
                secondLargest = largest;
                largest = current;
            } else if (current > secondLargest && current < largest) {
                // Update only secondLargest if current is in between
                secondLargest = current;
            }
        }

        // Output the result
        System.out.println(secondLargest);
        
        sc.close();
    }
}