```java
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
        int i = 0, j = 0, k = 0, px = 0, py = 0, cnt = 0;
        while (px < x || py < y) {
            if (px < x && (py == y || pa[a - i - 1] >= pc[c - k - 1])) {
                cnt += pa[a - i - 1];
                i++;
                px++;
            } else if (py < y && (px == x || pb[b - j - 1] >= pc[c - k - 1])) {
                cnt += pb[b - j - 1];
                j++;
                py++;
            } else if (px < x && py < y) {
                int cntX1 = 0, cntY1 = 0;
                int i1 = i, j1 = j;
                int px1 = px + 1, py1 = py + 1;
                while (px1 <= x && pa[a - i1 - 1] >= pc[c - k - 1]) {
                    cntX1 += pa[a - i1 - 1];
                    i1++;
                    px1++;
                }
                while (py1 <= y && pb[b - j1 - 1] >= pc[c - k - 1]) {
                    cntY1 += pb[b - j1 - 1];
                    j1++;
                    py1++;
                }
                cnt += pc[c - k - 1];
                if (cntX1 >= cntY1) {
                    k++;
                    px++;
                } else {
                    k++;
                    py++;
                }
            } else if (px < x) {
                cnt += pc[c - k - 1];
                k++;
                px++;
            } else if (py < y) {
                cnt += pc[c - k - 1];
                k++;
                py++;
            }
        }
        System.out.println(cnt);
    }
}
```