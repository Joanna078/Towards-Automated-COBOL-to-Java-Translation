import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept K
        int k = Integer.parseInt(scanner.nextLine().trim());

        // Accept S
        String s = scanner.nextLine().trim();

        // Split S into words and count them
        String[] words = s.split(" ");
        int len = words.length;

        if (len <= k) {
            // Display trimmed S
            System.out.println(s.trim());
        } else {
            // Display first K characters followed by "..."
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < k; i++) {
                result.append(words[i]);
                if (i < k - 1) {
                    result.append(" ");
                }
            }
            result.append("...");
            System.out.println(result.toString());
        }

        scanner.close();
    }
}