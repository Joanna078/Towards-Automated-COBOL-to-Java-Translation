import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int x, y, a, b, c;
        String[] arr = s.split(" ");
        x = Integer.parseInt(arr[0]);
        y = Integer.parseInt(arr[1]);
        a = Integer.parseInt(arr[2]);
        b = Integer.parseInt(arr[3]);
        c = Integer.parseInt(arr[4]);
        int[] pa = new int[a];
        int[] pb = new int[b];
        int[] pc = new int[c];
        s = br.readLine();
        arr = s.split(" ");
        for (int i = 0; i < a; i++) {
            pa[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(pa);
        s = br.readLine();
        arr = s.split(" ");
        for (int i = 0; i < b; i++) {
            pb[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(pb);
        s = br.readLine();
        arr = s.split(" ");
        for (int i = 0; i < c; i++) {
            pc[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(pc);
        int p1 = 0, p2 = 0, cnt = 0;
        while (p1 < a || p2 < b) {
            if (p1 < a && (p2 == b || pa[a - p1 - 1] >= pb[b - p2 - 1])) {
                cnt += pa[a - p1 - 1];
                p1++;
            } else {
                cnt += pb[b - p2 - 1];
                p2++;
            }
        }
        System.out.println(cnt);
    }
}