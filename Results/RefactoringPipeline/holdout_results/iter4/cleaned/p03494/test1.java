import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize variables
        int re = 10000;
        int n = scanner.nextInt();
        n++; // Increment n as per COBOL logic
        scanner.nextLine(); // Consume newline
        String inp = scanner.nextLine();

        int[] a = new int[200];
        int temp1, temp2, temp3, mod, r, s;
        int now = 0;

        // First loop to process input
        for (s = 0; s < n; s++) {
            temp1 = inp.indexOf(' ', now);
            if (temp1 == -1) {
                temp1 = inp.length();
            }
            temp2 = temp1 - now;
            a[s] = Integer.parseInt(inp.substring(now, temp1));
            now = temp1 + 1;
        }

        // Second loop to process array elements
        for (s = 0; s < n; s++) {
            r = a[s] / 2;
            mod = a[s] - r * 2;
            temp3 = 0;
            while (mod != 1) {
                r = a[s] / 2;
                mod = a[s] - r * 2;
                a[s] = r;
                temp3++;
            }
            if (temp3 > 0) {
                temp3--;
            }
            if (temp3 < re) {
                re = temp3;
            }
        }

        // Output result
        System.out.println(re);
    }
}