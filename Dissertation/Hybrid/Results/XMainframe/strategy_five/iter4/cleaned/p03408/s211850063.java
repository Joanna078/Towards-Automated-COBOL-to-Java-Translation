import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String[] skey = new String[100];
        int[] sval = new int[100];
        int slen = 0;
        for (int i = 0; i < n; i++) {
            String tmpkey = reader.readLine();
            boolean found = false;
            for (int j = 0; j < slen; j++) {
                if (skey[j].equals(tmpkey)) {
                    sval[j]++;
                    found = true;
                    break;
                }
            }
            if (!found) {
                skey[slen] = tmpkey;
                sval[slen] = 1;
                slen++;
            }
        }
        int m = Integer.parseInt(reader.readLine());
        String[] tkey = new String[100];
        int[] tval = new int[100];
        int tlen = 0;
        for (int i = 0; i < m; i++) {
            String tmpkey = reader.readLine();
            boolean found = false;
            for (int j = 0; j < tlen; j++) {
                if (tkey[j].equals(tmpkey)) {
                    tval[j]++;
                    found = true;
                    break;
                }
            }
            if (!found) {
                tkey[tlen] = tmpkey;
                tval[tlen] = 1;
                tlen++;
            }
        }
        reader.close();

        int point = 0;
        for (int i = 0; i < slen; i++) {
            int tmp = sval[i];
            for (int j = 0; j < tlen; j++) {
                if (skey[i].equals(tkey[j])) {
                    tmp -= tval[j];
                }
            }
            point = Math.max(point, tmp);
        }

        String ans = String.format("%03d", point);
        System.out.println(ans.replaceFirst("^0+(?!$)", ""));
    }
}