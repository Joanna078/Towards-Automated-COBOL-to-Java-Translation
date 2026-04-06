import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inp = reader.readLine();
        int maxlen = 2;
        int cur = 1;
        int i = 1;
        int j;
        int len;
        int[] dn = new int[maxlen];
        int tmp;
        while (i <= maxlen) {
            j = cur;
            while (j < inp.length() && inp.charAt(j - 1) != ' ') {
                j++;
            }
            len = j - cur;
            if (len > 0) { // Ensure we don't parse an empty string
                dn[i - 1] = Integer.parseInt(inp.substring(cur - 1, j).trim());
            }
            cur = j + 1;
            i++;
        }
        tmp = (int) Math.pow(100, dn[0]) * dn[1];
        System.out.println(tmp);
    }
}