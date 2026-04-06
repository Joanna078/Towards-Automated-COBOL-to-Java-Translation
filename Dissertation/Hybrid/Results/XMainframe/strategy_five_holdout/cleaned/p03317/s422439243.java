import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inp = reader.readLine();
        String inp2 = reader.readLine();

        int maxlen = 2;
        int cur = 1;
        int i = 1;
        int j = 0;
        int len = 0;
        int[] nk = new int[3];
        
        for (int m = 0; m < maxlen; m++) {
            j = cur;
            while (j <= inp.length() && !inp.substring(j - 1, j).equals(" ")) {
                j++;
            }
            len = j - cur;
            if (len > 0) { // Ensure there is something to parse
                nk[i] = Integer.parseInt(inp.substring(cur - 1, cur + len - 1));
            }
            cur = j + 1;
            i++;
        }

        int x = nk[1] - nk[2];
        nk[2]--;
        BigInteger bigX = BigInteger.valueOf(x);
        BigInteger bigK = BigInteger.valueOf(nk[2]);
        BigInteger result = bigX.divide(bigK);
        if (!bigX.mod(bigK).equals(BigInteger.ZERO)) {
            result = result.add(BigInteger.ONE);
        }
        result = result.add(BigInteger.ONE);

        String zs = result.toString();
        String ans = "";
        if (zs.length() > 6) {
            ans = zs.substring(zs.length() - 6);
        } else {
            ans = zs;
        }

        System.out.println(ans);
    }
}