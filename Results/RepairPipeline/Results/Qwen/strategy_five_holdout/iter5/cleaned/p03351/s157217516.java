import java.util.Scanner;

public class ABC_097_B {
    public static void main(String[] args) {
        String inp = ""; // Input string will be set here or through user input
        int maxlen = 4;
        int cur = 1;
        int i = 1;
        int j;
        int len = 0; // Initialize len to 0
        int[] abcd = new int[maxlen];

        // Simulating ACCEPT INP
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter input string:");
        inp = scanner.nextLine();

        while (i <= maxlen) {
            j = cur;
            while (j <= inp.length() && inp.charAt(j - 1) != ' ') {
                j++;
            }

            len = j - cur;
            if (len > 0) { // Ensure we don't parse an empty substring
                abcd[i - 1] = Integer.parseInt(inp.substring(cur - 1, j - 1));
            }

            cur = j + 1;
            i++;
        }

        if ((abcd[0] - abcd[2] <= abcd[3])) {
            System.out.println("Yes");
        } else if ((abcd[0] - abcd[1] <= abcd[3]) && (abcd[1] - abcd[2] <= abcd[3])) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}