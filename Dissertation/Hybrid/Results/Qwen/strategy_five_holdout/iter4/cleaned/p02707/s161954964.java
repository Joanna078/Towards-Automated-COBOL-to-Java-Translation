import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        int n = Integer.parseInt(scanner.nextLine());

        // Data structures
        String inputLine = scanner.nextLine();
        char[] inp = inputLine.toCharArray();
        int[] tbl = new int[200001]; // Adjusted size to match COBOL array
        Arrays.fill(tbl, 0);

        // Logic
        int p1 = 0;
        for (int i = 1; i <= n; i++) {
            int p2 = p1;
            while (p2 < inp.length && inp[p2] != ' ') {
                p2++;
            }
            if (p2 > p1) { // Ensure there is at least one character to process
                String w = new String(inp, p1, p2 - p1);
                int wLength = w.length();
                if (wLength > 0 && wLength < tbl.length) { // Ensure the index is within bounds
                    tbl[wLength]++;
                }
            }
            p1 = p2 + 1;
        }

        // Output
        for (int i = 1; i <= n; i++) {
            System.out.println(tbl[i]);
        }

        scanner.close();
    }
}