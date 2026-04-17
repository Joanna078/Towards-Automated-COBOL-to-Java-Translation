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

        for (int i = 0; i < inN; i++) {
            for (int j = i + 1; j < inN; j++) {
                if (isFriend(i, j, tFri) && isBlock(i, j, tBlk)) {
                    searchFriends(i, j, tFri2, tKh);
                }
            }
        }

        StringBuilder outK = new StringBuilder();
        for (int kh : tKh) {
            outK.append(kh).append(" ");
        }
        System.out.println(outK.toString().trim());
    }

    private static boolean isFriend(int i, int j, int[][] tFri) {
        for (int[] pair : tFri) {
            if (pair[0] == i && pair[1] == j) {
                return true;
            }
        }
        return false;
    }

    private static boolean isBlock(int i, int j, int[][] tBlk) {
        for (int[] pair : tBlk) {
            if (pair[0] == i && pair[1] == j) {
                return true;
            }
        }
        return false;
    }

    private static void searchFriends(int i, int j, int[][] tFri2, int[] tKh) {
        tKh[i]++;
        tKh[j]++;
    }
}
```