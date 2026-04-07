```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inp = reader.readLine();
        int dtL1 = 0;
        for (int i = 0; i < inp.length(); i++) {
            if (inp.charAt(i) == ' ') {
                dtL1 = i;
                break;
            }
        }
        int n = Integer.parseInt(inp.substring(0, dtL1));
        int xp = 0;
        int p1 = dtL1 + 1;
        int i = 0;
        int[] inX = new int[100]; // Assuming maximum possible size as per COBOL
        while (i < n) {
            int p2 = p1;
            while (p1 < inp.length() && inp.charAt(p1) >= '0' && inp.charAt(p1) <= '9') {
                p1++;
            }
            if (p2 < p1) { // Ensure there is a number to parse
                inX[i] = Integer.parseInt(inp.substring(p2, p1));
                xp += inX[i];
                i++;
            }
            if (p1 < inp.length()) {
                p1++;
            }
        }
        double avg = Math.round((double) xp / n);
        long xP2 = 0;
        for (int j = 0; j < n; j++) { // Corrected loop condition to use n
            xP2 += Math.pow(inX[j] - avg, 2);
        }
        System.out.println(String.format("%07d", xP2)); // Format to ensure 7 digits
    }
}
```