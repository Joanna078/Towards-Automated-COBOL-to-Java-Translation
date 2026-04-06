import java.util.Arrays;
import java.util.Scanner;

public class ABC_043_B {
    public static void main(String[] args) {
        // Working storage section
        char[] s1 = new char[10];
        char[] ans1 = new char[10];
        int i;
        int len;
        int now = 0;

        // Accept input
        System.out.println("Enter string of length up to 10 characters:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.length() > 10) {
            throw new IllegalArgumentException("Input length must be up to 10 characters");
        }
        input.getChars(0, input.length(), s1, 0);

        // Compute length
        len = input.length();

        // Process the string
        for (i = 0; i < len; i++) {
            if (s1[i] == 'B') {
                if (now != 0) {
                    ans1[now - 1] = ' ';
                    now--;
                }
            } else {
                ans1[now++] = s1[i];
            }
        }

        // Display output
        System.out.println(new String(Arrays.copyOfRange(ans1, 0, now)));
        scanner.close();
    }
}