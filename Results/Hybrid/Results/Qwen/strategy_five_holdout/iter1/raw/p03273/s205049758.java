```java
import java.util.Arrays;

public class ABC_107_B {
    public static void main(String[] args) {
        String inp = "example input"; // Replace with actual input
        String[] parts = inp.split(" ");
        int h = Integer.parseInt(parts[0]);
        int w = Integer.parseInt(parts[1]);

        char[][] a = new char[h][w];
        for (int i = 0; i < h; i++) {
            System.out.println("Enter row " + (i + 1));
            a[i] = System.console().readLine().toCharArray();
        }

        boolean[] cntH = new boolean[h];
        Arrays.fill(cntH, false);
        boolean[] cntW = new boolean[w];
        Arrays.fill(cntW, false);
        int cnt = 0; // Initialize cnt here

        for (int i = 0; i < h; i++) {
            if (!cntH[i]) {
                boolean flagH = true;
                for (int j = 0; j < w; j++) {
                    if (a[i][j] == '#') {
                        flagH = false;
                        break;
                    }
                }
                if (flagH) {
                    cntH[i] = true;
                }
            }
        }

        for (int i = 0; i < w; i++) {
            if (!cntW[i]) {
                boolean flagW = true;
                for (int j = 0; j < h; j++) {
                    if (a[j][i] == '#') {
                        flagW = false;
                        break;
                    }
                }
                if (flagW) {
                    cntW[i] = true;
                    cnt++; // Increment cnt here
                }
            }
        }

        for (int i = 0; i < h; i++) {
            if (!cntH[i]) {
                StringBuilder st = new StringBuilder(w);
                int c = 0;
                for (int j = 0; j < w; j++) {
                    if (!cntW[j]) {
                        st.append(a[i][j]);
                    } else {
                        c++;
                    }
                }
                System.out.println(st.toString());
            }
        }
    }
}
```