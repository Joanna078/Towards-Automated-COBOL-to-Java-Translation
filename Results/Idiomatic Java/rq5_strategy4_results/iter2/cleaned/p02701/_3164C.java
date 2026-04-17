import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read N
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Read strings into array
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = scanner.nextLine().trim();
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

        // Output the count
        System.out.println(cnt);

        scanner.close();
    }
}