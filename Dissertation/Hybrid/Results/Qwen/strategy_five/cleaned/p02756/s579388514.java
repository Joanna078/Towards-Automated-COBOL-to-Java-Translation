import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string S
        String s = scanner.nextLine();
        String[] parts = s.split(" ");
        int pos2 = parts.length - 1; // Adjusted to correctly count spaces

        // Initialize positions
        int pos1 = 1 + 200000;
        pos2 += 200000;

        // Input integer Q
        int q = Integer.parseInt(scanner.nextLine());

        // Array to simulate FORMA
        char[] forma = new char[400000];
        for (int i = 0; i < forma.length; i++) {
            forma[i] = ' ';
        }

        // Process each input line
        for (int i = 0; i < q; i++) {
            String inp = scanner.nextLine();
            parts = inp.split(" ");
            char t = parts[0].charAt(0);
            char f = parts[1].charAt(0);
            char c = parts[2].charAt(0);

            if (t == '1') {
                char w = forma[pos1 - 1]; // Adjusted index to be 0-based
                forma[pos1 - 1] = forma[pos2 - 1]; // Adjusted index to be 0-based
                forma[pos2 - 1] = w; // Adjusted index to be 0-based
            } else {
                if (f == '1') {
                    pos1--;
                    forma[pos1 - 1] = c; // Adjusted index to be 0-based
                } else {
                    pos2++;
                    forma[pos2 - 1] = c; // Adjusted index to be 0-based
                }
            }
        }

        // Display the result
        StringBuilder result = new StringBuilder();
        for (int i = pos1 - 1; i <= pos2 - 1; i++) { // Adjusted indices to be 0-based
            result.append(forma[i]);
        }
        System.out.println(result.toString().trim()); // Trim to remove trailing spaces

        scanner.close();
    }
}