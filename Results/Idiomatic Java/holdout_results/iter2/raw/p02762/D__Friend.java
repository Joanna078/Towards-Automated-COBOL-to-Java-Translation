```java
import java.util.Arrays;
import java.util.Scanner;

public class DFriend {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String inp = scanner.nextLine();
        String[] parts = inp.split("\\s+");
        int inN = Integer.parseInt(parts[0]);
        int inM = Integer.parseInt(parts[1]);
        int inK = Integer.parseInt(parts[2]);

        int cFr2 = inM * 2;
        int[] tKh = new int[inN];
        Arrays.fill(tKh, 0);

        int[][] tFri = new int[inM][2];
        int[][] tFri2 = new int[cFr2][2];
        int[][] tBlk = new int[inK][2];

        for (int i = 0; i < inM; i++) {
            inp = scanner.nextLine();
            parts = inp.split("\\s+");
            int inX = Integer.parseInt(parts[0]);
            int inY = Integer.parseInt(parts[1]);
            tFri[i][0] = Math.min(inX, inY);
            tFri[i][1] = Math.max(inX, inY);
            tFri2[i][0] = inX;
            tFri2[i + inM][0] = inY;
            tFri2[i][1] = inY;
            tFri2[i + inM][1] = inX;
        }

        for (int i = 0; i < inK; i++) {
            inp = scanner.nextLine();
            parts = inp.split("\\s+");
            int inX = Integer.parseInt(parts[0]);
            int inY = Integer.parseInt(parts[1]);
            tBlk[i][0] = Math.min(inX, inY);
            tBlk[i][1] = Math.max(inX, inY);
        }

        Arrays.sort(tFri, (a, b) -> a[0] != b[0] ? a[0] - b[0] : a[1] - b[1]);
        Arrays.sort(tBlk, (a, b) -> a[0] != b[0] ? a[0] - b[0] : a[1] - b[1]);
        Arrays.sort(tFri2, (a, b) -> a[0] != b[0] ? a[0] - b[0] : a[1] - b[1]);

        int pF = 1, pB = 1;
        for (int i = 0; i < inN; i++) {
            for (int j = i + 1; j < inN; j++) {
                if (friendCheck(i, j, tFri, pF) && blockCheck(i, j, tBlk, pB)) {
                    friendSearch(i, j, tFri2, tKh);
                }
            }
        }

        StringBuilder outK = new StringBuilder();
        for (int kh : tKh) {
            outK.append(kh).append(" ");
        }
        System.out.println(outK.toString().trim());
    }

    private static boolean friendCheck(int i, int j, int[][] tFri, int pF) {
        while (pF <= tFri.length && tFri[pF - 1][0] < i) {
            pF++;
        }
        return pF <= tFri.length && tFri[pF - 1][0] == i;
    }

    private static boolean blockCheck(int i, int j, int[][] tBlk, int pB) {
        while (pB <= tBlk.length && tBlk[pB - 1][0] < j) {
            pB++;
        }
        return pB <= tBlk.length && tBlk[pB - 1][0] == j;
    }

    private static void friendSearch(int i, int j, int[][] tFri2, int[] tKh) {
        int lvl = 1;
        int[] sFri = new int[100000];
        sFri[lvl - 1] = i;
        boolean flHit = false;

        while (lvl > 0) {
            int pos = binarySearch(sFri[lvl - 1], tFri2);
            if (pos >= 0 && tFri2[pos][0] == sFri[lvl - 1]) {
                if (tFri2[pos][1] == j) {
                    flHit = true;
                    break;
                } else if (tKh[tFri2[pos][1]] == 0) {
                    tKh[tFri2[pos][1]] = 1;
                    lvl++;
                    sFri[lvl - 1] = tFri2[pos][1];
                }
            } else {
                lvl--;
            }
        }

        if (flHit) {
            tKh[i]++;
            tKh[j]++;
        }
    }

    private static int binarySearch(int key, int[][] array) {
        int low = 0, high = array.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (array[mid][0] == key) {
                return mid;
            } else if (array[mid][0] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
```