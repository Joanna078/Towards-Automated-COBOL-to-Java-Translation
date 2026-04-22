import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept input S
        String s = scanner.nextLine();
        int pos2 = s.length();
        int pos1 = 1 + 200000;
        pos2 += 200000;

        // Accept input Q
        int q = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        char[] forma = new char[500000];
        for (int i = 0; i < 500000; i++) {
            forma[i] = ' ';
        }

        for (int i = 0; i < q; i++) {
            // Accept input INP
            String inp = scanner.nextLine();
            String[] parts = inp.split(" ");
            char t = parts[0].charAt(0);
            char f = parts[1].charAt(0);
            char c = parts[2].charAt(0);

            if (t == '1') {
                char w = forma[pos1 - 1];
                forma[pos1 - 1] = forma[pos2 - 1];
                forma[pos2 - 1] = w;
            } else if (f == '1') {
                pos1--;
                forma[pos1 - 1] = c;
            } else {
                pos2++;
                forma[pos2 - 1] = c;
            }
        }

        // Display the result
        StringBuilder result = new StringBuilder();
        for (int i = pos1 - 1; i <= pos2 - 1; i++) {
            result.append(forma[i]);
        }
        System.out.println(result.toString().trim());

        scanner.close();
    }
}