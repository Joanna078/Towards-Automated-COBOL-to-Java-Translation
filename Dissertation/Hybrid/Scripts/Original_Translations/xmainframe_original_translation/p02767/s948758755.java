import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inp = reader.readLine();
        int n = Integer.parseInt(inp);
        int xp = 0;
        int p1 = 1;
        int i = 0;
        int[] inX = new int[n];
        while (i < n) {
            int p2 = p1;
            while (inp.charAt(p1) >= '0' && inp.charAt(p1) <= '9') {
                p1++;
            }
            inX[i] = Integer.parseInt(inp.substring(p2, p1));
            xp += inX[i];
            i++;
            p1++;
        }
        double avg = Math.round((double) xp / n);
        long xP2 = 0;
        for (int j : inX) {
            xP2 += Math.pow(j - avg, 2);
        }
        System.out.println(Math.round(xP2));
    }
}
