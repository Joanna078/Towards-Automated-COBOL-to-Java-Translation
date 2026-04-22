import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize array A with 100 elements, all set to 0
        int[] a = new int[100];
        
        // Accept value for B
        int b = scanner.nextInt();
        b++; // Add 1 to B

        // Increment A[C] for C from 1 to B
        for (int i = 0; i < b; i++) {
            int c = scanner.nextInt();
            a[c - 1]++;
        }

        // Count how many elements in A are greater than 0
        int d = 0;
        for (int value : a) {
            if (value > 0) {
                d++;
            }
        }

        // Display the result
        System.out.printf("%010d%n", d);

        scanner.close();
    }
}