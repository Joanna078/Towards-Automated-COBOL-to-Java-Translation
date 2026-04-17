import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept input
        String s = scanner.nextLine();
        int k = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Calculate LEN
        int len = s.split(" ").length;

        // Calculate S-N
        int sN;
        if (len < 5) {
            sN = len * (len + 1) / 2;
        } else {
            sN = (len - 4) * 5 + 10;
        }

        // Initialize DIC array
        String[] dic = new String[sN];
        int ix = 0;

        // Populate DIC array
        for (int i = 0; i < len; i++) {
            for (int j = 1; j <= 5 && i + j <= len; j++) {
                dic[ix++] = s.substring(i, i + j);
            }
        }

        // Sort DIC array
        Arrays.sort(dic);

        // Find the k-th unique substring
        int i = 0, j = 0;
        while (i < k) {
            int jw = j;
            while (j < dic.length && dic[j].equals(dic[jw])) {
                j++;
            }
            i++;
        }

        // Output the result
        System.out.println(dic[j - 1].trim());

        scanner.close();
    }
}