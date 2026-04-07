```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // WORKING-STORAGE SECTION
        String inw = scanner.nextLine();
        int n = Integer.parseInt(inw.split(" ")[0]);
        String kxStr = inw.split(" ")[1];
        long k = "1000000000000000000".equals(kxStr) ? 999999999999999999L : Long.parseLong(kxStr);
        
        // DATA DIVISION
        char[] inp = new char[1_400_000];
        Arrays.fill(inp, ' ');
        int p1 = 0;
        int[] tblA = new int[200_000];
        int[] tblB = new int[200_000];
        int x = 0;
        int sa = 0;
        int out = 0;
        
        // PROCEDURE DIVISION
        scanner.nextLine(); // Read the next line into inp
        for (int i = 0; i < inp.length; i++) {
            inp[i] = scanner.next().charAt(0);
        }
        
        for (int i = 0; i < n; i++) {
            int p2 = p1;
            while (p2 < inp.length && inp[p2] != ' ') {
                p2++;
            }
            if (p2 > p1) { // Check to avoid parsing empty string
                tblA[i] = Integer.parseInt(new String(Arrays.copyOfRange(inp, p1, p2)));
            }
            p1 = p2 + 1;
        }
        
        x = tblA[0];
        int i = 1;
        while (i <= k && tblB[x] == 0 && x != 1) {
            tblB[x] = i;
            x = tblA[x - 1]; // Adjusted index to match COBOL's 1-based array
            i++;
        }
        
        sa = i - tblB[x];
        long lp = k - tblB[x];
        if ("1000000000000000000".equals(kxStr)) {
            lp += 1;
        }
        
        long sh = lp / sa;
        long amr = lp % sa;
        
        if (tblB[x] == 0 || tblB[x] > k) {
            x = 1;
            amr = k;
        }
        
        for (long j = 0; j < amr; j++) {
            x = tblA[x - 1]; // Adjusted index to match COBOL's 1-based array
        }
        
        out = x;
        System.out.println(out);
    }
}
```