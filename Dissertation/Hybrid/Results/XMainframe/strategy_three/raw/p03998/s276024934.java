```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] sa = reader.readLine().toCharArray();
        char[] sb = reader.readLine().toCharArray();
        char[] sc = reader.readLine().toCharArray();

        char now = 'a';
        String winner = "";

        int aidx = 0;
        int bidx = 0;
        int cidx = 0;

        int alen = sa.length;
        int blen = sb.length;
        int clen = sc.length;

        while (true) {
            if (now == 'a') {
                if (aidx < alen) {
                    now = sa[aidx++];
                } else {
                    winner = "A";
                    break;
                }
            } else if (now == 'b') {
                if (bidx < blen) {
                    now = sb[bidx++];
                } else {
                    winner = "B";
                    break;
                }
            } else {
                if (cidx < clen) {
                    now = sc[cidx++];
                } else {
                    winner = "C";
                    break;
                }
            }
        }

        System.out.println(winner);
    }
}
```