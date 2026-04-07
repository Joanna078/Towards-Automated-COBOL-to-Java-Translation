```java
import java.util.Scanner;

public class ABC_045_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define arrays to hold the input strings
        char[] sa = new char[100];
        char[] sb = new char[100];
        char[] sc = new char[100];

        // Read input strings
        String inputSA = scanner.nextLine();
        System.arraycopy(inputSA.toCharArray(), 0, sa, 0, Math.min(inputSA.length(), 100));

        String inputSB = scanner.nextLine();
        System.arraycopy(inputSB.toCharArray(), 0, sb, 0, Math.min(inputSB.length(), 100));

        String inputSC = scanner.nextLine();
        System.arraycopy(inputSC.toCharArray(), 0, sc, 0, Math.min(inputSC.length(), 100));

        // Initialize variables
        char now = 'a';
        char winner = ' ';

        int aidx = 0;
        int bidx = 0;
        int cidx = 0;

        int alen = inputSA.length();
        int blen = inputSB.length();
        int clen = inputSC.length();

        boolean flg = false;

        // Process the strings
        while (!flg) {
            switch (now) {
                case 'a':
                    aidx++;
                    if (aidx < alen) {
                        now = sa[aidx];
                    } else {
                        winner = 'A';
                        flg = true;
                    }
                    break;
                case 'b':
                    bidx++;
                    if (bidx < blen) {
                        now = sb[bidx];
                    } else {
                        winner = 'B';
                        flg = true;
                    }
                    break;
                case 'c':
                    cidx++;
                    if (cidx < clen) {
                        now = sc[cidx];
                    } else {
                        winner = 'C';
                        flg = true;
                    }
                    break;
            }
        }

        // Output the result
        System.out.println(winner);
    }
}
```