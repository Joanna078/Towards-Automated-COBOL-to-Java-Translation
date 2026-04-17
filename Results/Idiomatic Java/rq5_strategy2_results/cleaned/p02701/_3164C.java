import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept N
        System.out.print("Enter the number of elements (N): ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Array to store strings
        String[] s = new String[n];

        // Accept each string
        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            s[i] = scanner.nextLine();
        }

        // Sort the array
        Arrays.sort(s);

        // Count unique strings
        int cnt = 1;
        for (int i = 1; i < n; i++) {
            if (!s[i].equals(s[i - 1])) {
                cnt++;
            }
        }

        // Display the count of unique strings
        System.out.printf("%05d%n", cnt);

        scanner.close();
    }
}