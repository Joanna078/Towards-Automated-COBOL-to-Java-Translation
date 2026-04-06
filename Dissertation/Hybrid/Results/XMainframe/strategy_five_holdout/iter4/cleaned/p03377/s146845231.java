import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        int cur = 0;
        int len = 0;
        int[] abx = new int[3];
        int i = 0;

        for (int k = 0; k < 3; k++) {
            for (int j = cur; j < line.length(); j++) {
                if (line.charAt(j) == ' ') {
                    break;
                }
                len++;
            }
            abx[i] = Integer.parseInt(line.substring(cur, cur + len).trim());
            cur += len + 1;
            len = 0;
            i++;
        }

        if (abx[0] <= abx[2] && abx[2] <= abx[0] + abx[1]) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}