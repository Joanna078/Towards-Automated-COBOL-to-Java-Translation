import java.util.Scanner;

public class PROGRAM_ID {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept input for N
        long N = scanner.nextLong();

        // Accept input for S
        scanner.nextLine(); // Consume newline left-over
        String S = scanner.nextLine();

        // Count occurrences of "ABC" in S
        long cnt = S.chars().filter(ch -> ch == 'A' || ch == 'B' || ch == 'C').count();

        // Display the count
        System.out.printf("%09d%n", cnt);

        scanner.close();
    }
}