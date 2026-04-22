```java
import java.util.Scanner;

public class ABC_045_B {

    private static final int MAX_LENGTH = 100;
    private static char[] sa = new char[MAX_LENGTH];
    private static char[] sb = new char[MAX_LENGTH];
    private static char[] sc = new char[MAX_LENGTH];
    private static char now = 'a';
    private static char winner = ' ';
    private static int aidx = 0;
    private static int bidx = 0;
    private static int cidx = 0;
    private static int alen = 0;
    private static int blen = 0;
    private static int clen = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter SA1: ");
        String input = scanner.nextLine();
        alen = input.length();
        input.getChars(0, alen, sa, 0);

        System.out.print("Enter SB1: ");
        input = scanner.nextLine();
        blen = input.length();
        input.getChars(0, blen, sb, 0);

        System.out.print("Enter SC1: ");
        input = scanner.nextLine();
        clen = input.length();
        input.getChars(0, clen, sc, 0);

        while (true) {
            if (now == 'a') {
                aidx++;
                if (aidx > alen) {
                    winner = 'A';
                    break;
                }
                now = sa[aidx - 1];
            } else if (now == 'b') {
                bidx++;
                if (bidx > blen) {
                    winner = 'B';
                    break;
                }
                now = sb[bidx - 1];
            } else {
                cidx++;
                if (cidx > clen) {
                    winner = 'C';
                    break;
                }
                now = sc[cidx - 1];
            }
        }

        System.out.println(winner);
    }
}
```