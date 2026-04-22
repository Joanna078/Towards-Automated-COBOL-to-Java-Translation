import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept input for K
        System.out.print("Enter value for K: ");
        int k = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Accept input for S
        System.out.print("Enter string S: ");
        String s = scanner.nextLine();

        // Unstring S delimited by space
        String[] parts = s.split(" ", 2);
        String trimmedS = parts[0].trim();
        int len = trimmedS.length();

        // Display result based on length comparison
        if (len <= k) {
            System.out.println(trimmedS);
        } else {
            System.out.println(trimmedS.substring(0, k) + "...");
        }

        scanner.close();
    }
}