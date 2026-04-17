import java.util.Scanner;

public class PROGRAM_ID {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept input for S and T
        System.out.print("Enter S: ");
        String S = scanner.nextLine().trim();

        System.out.print("Enter T: ");
        String T = scanner.nextLine().trim();

        // Check if S is equal to the substring of T excluding the last character
        if (S.equals(T.substring(0, Math.max(0, T.length() - 1)))) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }
}