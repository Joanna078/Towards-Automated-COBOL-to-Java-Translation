import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String s = scanner.nextLine();
        String[] parts = s.split(" ");
        int x = Integer.parseInt(parts[0]);
        int y = Integer.parseInt(parts[1]);
        int a = Integer.parseInt(parts[2]);
        int b = Integer.parseInt(parts[3]);
        int c = Integer.parseInt(parts[4]);

        int[] pa = new int[a];
        int[] pb = new int[b];
        int[] pc = new int[c];

        s = scanner.nextLine();
        parts = s.split(" ");
        for (int i = 0; i < a; i++) {
            pa[i] = Integer.parseInt(parts[i]);
        }

        s = scanner.nextLine();
        parts = s.split(" ");
        for (int i = 0; i < b; i++) {
            pb[i] = Integer.parseInt(parts[i]);
        }

        s = scanner.nextLine();
        parts = s.split(" ");
        for (int i = 0; i < c; i++) {
            pc[i] = Integer.parseInt(parts[i]);
        }

        Arrays.sort(pa);
        Arrays.sort(pb);
        Arrays.sort(pc);

        int px = 0, py = 0, cnt = 0;
        int i = 0, j = 0, k = 0;

        while (px < x || py < y) {
            if (px < x && i < a && pa[i] >= pc[k]) {
                cnt += pa[i++];
                px++;
            } else if (py < y && j < b && pb[j] >= pc[k]) {
                cnt += pb[j++];
                py++;
            } else if (px < x && py < y && i < a && j < b) {
                int cntX1 = xCnt1(pa, i, px, pc[k]);
                int cntY1 = yCnt1(pb, j, py, pc[k]);
                cnt += pc[k++];
                if (cntX1 >= cntY1) {
                    px++;
                } else {
                    py++;
                }
            } else if (px < x && i < a) {
                cnt += pc[k++];
                px++;
            } else if (py < y && j < b) {
                cnt += pc[k++];
                py++;
            }
        }

        System.out.println(cnt);
    }

    private static int xCnt1(int[] pa, int i, int px, int pcK) {
        int cntX1 = 0;
        int i1 = i;
        int px1 = px + 1;
        while (px1 <= x && i1 < pa.length && pa[i1] >= pcK) {
            cntX1 += pa[i1++];
            px1++;
        }
        return cntX1;
    }

    private static int yCnt1(int[] pb, int j, int py, int pcK) {
        int cntY1 = 0;
        int j1 = j;
        int py1 = py + 1;
        while (py1 <= y && j1 < pb.length && pb[j1] >= pcK) {
            cntY1 += pb[j1++];
            py1++;
        }
        return cntY1;
    }
}