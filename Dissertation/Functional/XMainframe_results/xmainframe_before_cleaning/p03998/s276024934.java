import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] sa = reader.readLine().toCharArray();
        char[] sb = reader.readLine().toCharArray();
        char[] sc = reader.readLine().toCharArray();

        char now = ' ';
        String winner = "";

        int aidx = 0;
        int bidx = 0;
        int cidx = 0;

        int alen = sa.length;
        int blen = sb.length;
        int clen = sc.length;

        while (true) {
            if (now == 'a') {
                now = sa[aidx++];
                if (alen < aidx) {
                    winner = "A";
                    break;
                }
            } else if (now == 'b') {
                now = sb[bidx++];
                if (blen < bidx) {
                    winner = "B";
                    break;
                }
            } else {
                now = sc[cidx++];
                if (clen < cidx) {
                    winner = "C";
                    break;
                }
            }
        }

        System.out.println(winner);
    }
}