import java.util.Arrays;
import java.util.Comparator;
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
    private int[] tKhCopy = new int[MAX_N];
    private int[] tF1Copy = new int[MAX_M];
    private int[] tF2Copy = new int[MAX_M];
    private int[] tF3Copy = new int[MAX_M];
    private int[] tF4Copy = new int[MAX_M];
    private int[] tB1Copy = new int[MAX_K];
    private int[] tB2Copy = new int[MAX_K];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DFriend dfriend = new DFriend();
        dfriend.inp = scanner.nextLine();
        scanner.close();

        String[] parts = dfriend.inp.split(" ");
        int n = Integer.parseInt(parts[0]);
        int m = Integer.parseInt(parts[1]);
        int k = Integer.parseInt(parts[2]);

        Arrays.fill(dfriend.tKh, 0);

        for (int i = 0; i < m; i++) {
            parts = scanner.nextLine().split(" ");
            int x = Integer.parseInt(parts[0]);
            int y = Integer.parseInt(parts[1]);
            if (x < y) {
                dfriend.tF1[i] = x;
                dfriend.tF2[i] = y;
            } else {
                dfriend.tF1[i] = y;
                dfriend.tF2[i] = x;
            }
            dfriend.tF3[i] = x;
            dfriend.tF4[i + m] = y;
            dfriend.tF4[i] = y;
            dfriend.tF3[i + m] = x;
        }

        for (int i = 0; i < k; i++) {
            parts = scanner.nextLine().split(" ");
            int x = Integer.parseInt(parts[0]);
            int y = Integer.parseInt(parts[1]);
            if (x < y) {
                dfriend.tB1[i] = x;
                dfriend.tB2[i] = y;
            } else {
                dfriend.tB1[i] = y;
                dfriend.tB2[i] = x;
            }
        }

        Arrays.sort(dfriend.tF1, 0, m, Comparator.comparingInt(o -> o));
        Arrays.sort(dfriend.tF2, 0, m, Comparator.comparingInt(o -> o));
        Arrays.sort(dfriend.tF3, 0, m, Comparator.comparingInt(o -> o));
        Arrays.sort(dfriend.tF4, 0, m * 2, Comparator.comparingInt(o -> o));
        Arrays.sort(dfriend.tB1, 0, k, Comparator.comparingInt(o -> o));
        Arrays.sort(dfriend.tB2, 0, k, Comparator.comparingInt(o -> o));

        int pF = 0;
        int pB = 0;
        for (int i = 1; i <= n; i++) {
            int j = i + 1;
            while (j <= n) {
                boolean flFri = false;
                boolean flBlk = false;

                // Friend check
                while (pF < m && j > dfriend.tF1[pF]) {
                    pF++;
                }
                if (pF < m && j == dfriend.tF1[pF]) {
                    flFri = true;
                }

                // Block check
                while (pB < k && j > dfriend.tB1[pB]) {
                    pB++;
                }
                if (pB < k && j == dfriend.tB1[pB]) {
                    flBlk = true;
                }

                if (!flFri && !flBlk) {
                    Arrays.fill(dfriend.flgSearch, ' ');
                    dfriend.flHit = '0';
                    dfriend.lvl = 1;
                    dfriend.sFri[dfriend.lvl] = i;

                    dfriend.friendSearch();

                    if (dfriend.flHit == '1') {
                        dfriend.tKh[i]++;
                        dfriend.tKh[j]++;
                    }
                }

                j++;
            }
        }

        int len = 0;
        for (int i = 1; i <= n; i++) {
            int edFri = dfriend.tKh[i];
            int j = 5;
            while (j >= 1 && dfriend.editArea[j] == ' ') {
                j--;
            }
            System.arraycopy(dfriend.editArea, j + 1, dfriend.outK, len + 1, 6 - j);
            dfriend.outK[len + 7 - j] = ' ';
            len += 7 - j;
        }

        System.out.println(new String(dfriend.outK, 1, len - 1));
    }

    private void friendSearch() {
        searchFri();

        while (sPos[lvl] > 1 && sKey != tF3[sPos[lvl] - 1]) {
            sPos[lvl]--;
        }
    }

    private void searchFri() {
        sKey = sFri[lvl];
        int kMin = 1;
        int kMax = cFr2;
        sPos[lvl] = 0;
        int kCur = (kMin + kMax) / 2;
        while (kMin <= kMax && sPos[lvl] == 0) {
            if (sKey == tF3[kCur]) {
                sPos[lvl] = kCur;
            } else if (sKey < tF3[kCur]) {
                kMax = kCur - 1;
            } else {
                kMin = kCur + 1;
            }
            kCur = (kMin + kMax) / 2;
        }
    }

    private int idxIj;
    private char flNxt;
    private char flHit;
    private char flFri;
    private char flBlk;
    private int edFri;
    private char[] flgSearch = new char[MAX_N];
    private int lvl;
    private char[] editArea = new char[6];
}