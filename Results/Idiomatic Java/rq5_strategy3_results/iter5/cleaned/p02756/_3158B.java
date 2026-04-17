import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input string S
        String s = scanner.nextLine();
        int pos2 = s.length();

        // Read integer Q
        int q = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Initialize positions
        int pos1 = 200000;
        pos2 += 200000;

        // Initialize the array FORMA
        char[] forma = new char[500000];
        for (int i = 0; i < 500000; i++) {
            forma[i] = ' ';
        }

        // Process each input line
        for (int i = 0; i < q; i++) {
            String inp = scanner.nextLine();
            String[] parts = inp.split(" ");
            char t = parts[0].charAt(0);
            char f = parts[1].charAt(0);
            char c = parts[2].charAt(0);

            if (t == '1') {
                char temp = forma[pos1];
                forma[pos1] = forma[pos2];
                forma[pos2] = temp;
            } else if (f == '1') {
                pos1--;
                forma[pos1] = c;
            } else {
                pos2++;
                forma[pos2] = c;
            }
        }

        // Output the result
        StringBuilder result = new StringBuilder();
        for (int i = pos1; i <= pos2; i++) {
            result.append(forma[i]);
        }
        System.out.println(result.toString());

        scanner.close();
    }
}