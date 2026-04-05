import java.util.*;

public class SecondLargest {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int countLargest = 0;

        // Find largest and count its occurrences
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
                countLargest = 1;
            } else if (arr[i] == largest) {
                countLargest++;
            }
        }

        // If largest appears more than once
        if (countLargest > 1) {
            System.out.println(largest);
            return;
        }

        // Find second largest (strictly smaller)
        for (int i = 0; i < n; i++) {
            if (arr[i] != largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }

        System.out.println(secondLargest);

        sc.close();
    }
}