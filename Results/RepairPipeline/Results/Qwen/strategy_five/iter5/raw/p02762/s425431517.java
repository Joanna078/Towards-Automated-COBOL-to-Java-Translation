```java
import java.util.Arrays;
import java.util.Scanner;

public class DFriend {
    private static final int MAX_N = 100000;
    private static final int MAX_M = 200001;
    private static final int MAX_K = 100000;
    private static final int MAX_LEN = 600001;

    private String inp;
    private char[] outK = new char[MAX_LEN];
    private int[] tKh = new int[MAX_N];
    private int[] tF1 = new int[MAX_M];
    private int[] tF2 = new int[MAX_M];
    private int[] tF3 = new int[MAX_M];
    private int[] tF4 = new int[MAX_M];
    private int[] tB1 = new int[MAX_K];
    private int[] tB2 = new int[MAX_K];
    private int[] sFri = new int[MAX_N];
    private int[] sPos = new int[MAX_N];
    private char[] flgSearch = new char[MAX_N];
    private int lvl;
    private char[] editArea = new char[6];
    private int cFr2;
    private char flNxt;
    private char flHit;
    private char flFri;
    private char flBlk;
    private int edFri;
    private int idxIj;
    private int pF;
    private int pB;

    public static void main(String[] args) {
        DFriend dfriend = new DFriend();
        dfriend.main();
    }

    public void main() {
        Scanner scanner = new Scanner(System.in);
        inp = scanner.nextLine();

        String[] parts = inp.split(" ");
        int n = Integer.parseInt(parts[0]);
        int m = Integer.parseInt(parts[1]);
        int k = Integer.parseInt(parts[2]);
        cFr2 = m * 2;

        Arrays.fill(tKh, 0);

        for (int i = 0; i < m; i++) {
            inp = scanner.nextLine();
            parts = inp.split(" ");
            int x = Integer.parseInt(parts[0]);
            int y = Integer.parseInt(parts[1]);
            if (x < y) {
                tF1[i] = x;
                tF2[i] = y;
            } else {
                tF1[i] = y;
                tF2[i] = x;
            }
            tF3[i] = x;
            tF4[i + m] = y;
            tF4[i] = y;
            tF3[i + m] = x;
        }

        for (int i = 0; i < k; i++) {
            inp = scanner.nextLine();
            parts = inp.split(" ");
            int x = Integer.parseInt(parts[0]);
            int y = Integer.parseInt(parts[1]);
            if (x < y) {
                tB1[i] = x;
                tB2[i] = y;
            } else {
                tB1[i] = y;
                tB2[i] = x;
            }
        }

        Arrays.sort(tF1, 0, m);
        Arrays.sort(tF2, 0, m);
        Arrays.sort(tF3, 0, m);
        Arrays.sort(tF4, 0, m * 2);
        Arrays.sort(tB1, 0, k);
        Arrays.sort(tB2, 0, k);

        pF = 1;
        pB = 1;
        for (int i = 1; i <= n; i++) {
            int j = i + 1;
            while (j <= n) {
                flFri = '0';
                flBlk = '0';

                // Friend check
                friendCheck(m);

                // Block check
                blockCheck(k);

                if (flFri == '0' && flBlk == '0') {
                    Arrays.fill(flgSearch, ' ');
                    flHit = '0';
                    lvl = 1;
                    sFri[lvl] = i;

                    friendSearch();

                    if (flHit == '1') {
                        tKh[i]++;
                        tKh[j]++;
                    }
                }

                j++;
            }
        }

        int len = 0;
        for (int i = 1; i <= n; i++) {
            edFri = tKh[i];
            int j = 5;
            while (j >= 1 && editArea[j] == ' ') {
                j--;
            }
            System.arraycopy(editArea, j, outK, len, 6 - j);
            outK[len + 6 - j] = ' ';
            len += 7 - j;
        }

        System.out.println(new String(outK, 0, len - 1));

        scanner.close();
    }

    private void friendCheck(int m) {
        while (pF <= m && idxIj <= tF1[pF - 1]) {
            pF++;
        }
        if (pF <= m && idxIj == tF1[pF - 1]) {
            flFri = '1';
        } else {
            flFri = '0';
        }
    }

    private void blockCheck(int k) {
        while (pB <= k && idxIj <= tB1[pB - 1]) {
            pB++;
        }
        if (pB <= k && idxIj == tB1[pB - 1]) {
            flBlk = '1';
        } else {
            flBlk = '0';
        }
    }

    private void friendSearch() {
        searchFri();

        while (sPos[lvl] > 1 && sFri[lvl] != tF3[sPos[lvl] - 1]) {
            sPos[lvl]--;
        }
    }

    private void searchFri() {
        int sKey = sFri[lvl];
        int kMin = 1;
        int kMax = cFr2;
        sPos[lvl] = 0;
        int kCur = (kMin + kMax) / 2;
        while (kMin <= kMax && sPos[lvl] == 0) {
            if (sKey == tF3[kCur - 1]) {
                sPos[lvl] = kCur;
            } else if (sKey < tF3[kCur - 1]) {
                kMax = kCur - 1;
            } else {
                kMin = kCur + 1;
            }
            kCur = (kMin + kMax) / 2;
        }
    }
}
```