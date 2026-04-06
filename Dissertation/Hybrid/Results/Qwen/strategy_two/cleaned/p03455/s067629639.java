import java.util.Scanner;

public class ABC_086_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        int maxlen = 2;
        int cur = 0; // Changed from 1 to 0 for correct substring indexing
        int i = 0;   // Changed from 1 to 0 for correct loop indexing
        int j;
        int len;

        String[] ab = new String[maxlen];
        int x;
        int d;

        while (i < maxlen) { // Changed from <= to < for correct array indexing
            j = cur;
            while (j < inp.length() && inp.charAt(j) != ' ') {
                j++;
            }

            len = j - cur;
            if (len > 0) { // Check to avoid empty string
                ab[i] = inp.substring(cur, cur + len);
            }
            cur = j + 1;
            i++;
        }

        if (ab[0] != null && ab[1] != null) { // Check to ensure both strings are not null
            x = Integer.parseInt(ab[0]) * Integer.parseInt(ab[1]);
            d = x % 2;

            if (d == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        } else {
            System.out.println("Invalid input");
        }
    }
}