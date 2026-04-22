import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept K
        System.out.print("Enter K: ");
        int k = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Accept S
        System.out.print("Enter S: ");
        String s = scanner.nextLine();

        // Unstring S delimited by space
        String[] parts = s.split(" ");
        String trimmedS = parts[0].trim();
        int len = trimmedS.length();

        // Display result
        if (len <= k) {
            System.out.println(trimmedS);
        } else {
            System.out.println(trimmedS.substring(0, k) + "...");
        }

        scanner.close();
    }
}