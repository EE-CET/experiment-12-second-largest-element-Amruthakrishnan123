import java.util.*;

public class SecondLargest {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read N
        int n = sc.nextInt();

        // Read array
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } 
            else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        // Print result
        System.out.println(secondLargest);

        sc.close();
    }
}