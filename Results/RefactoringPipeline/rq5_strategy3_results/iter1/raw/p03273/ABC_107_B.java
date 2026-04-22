```java
import java.util.Scanner;

public class ABC_107_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        String[] parts = inp.split("\\s+");
        int H = Integer.parseInt(parts[0]);
        int W = Integer.parseInt(parts[1]);

        String[] a = new String[H];
        for (int i = 0; i < H; i++) {
            a[i] = scanner.nextLine();
        }

        int[] cntH = new int[100];
        int[] cntW = new int[100];
        int cnt = 0;

        for (int i = 0; i < H; i++) {
            boolean flagH = true;
            for (int j = 0; j < W; j++) {
                if (a[i].charAt(j) == '#') {
                    flagH = false;
                    break;
                }
            }
            if (flagH) {
                cntH[i] = 1;
            }
        }

        for (int i = 0; i < W; i++) {
            boolean flagW = true;
            for (int j = 0; j < H; j++) {
                if (a[j].charAt(i) == '#') {
                    flagW = false;
                    break;
                }
            }
            if (flagW) {
                cntW[i] = 1;
                cnt++;
            }
        }

        for (int i = 0; i < H; i++) {
            if (cntH[i] == 0) {
                StringBuilder st = new StringBuilder();
                int c = 0;
                for (int j = 0; j < W; j++) {
                    if (cntW[j] == 0) {
                        st.append(a[i].charAt(j));
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