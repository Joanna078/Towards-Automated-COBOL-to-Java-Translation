import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = reader.readLine().split(" ");
        int H = Integer.parseInt(arr[0]);
        int W = Integer.parseInt(arr[1]);
        char[][] grid = new char[H][W];
        for (int i = 0; i < H; i++) {
            grid[i] = reader.readLine().toCharArray();
        }
        List<Integer> cntH = new ArrayList<>();
        List<Integer> cntW = new ArrayList<>();
        for (int i = 0; i < H; i++) {
            boolean flgH = true;
            for (int j = 0; j < W; j++) {
                if (grid[i][j] == '#') {
                    flgH = false;
                    break;
                }
            }
            if (flgH) {
                cntH.add(1);
            } else {
                cntH.add(0);
            }
        }
        for (int i = 0; i < W; i++) {
            boolean flgW = true;
            for (int j = 0; j < H; j++) {
                if (grid[j][i] == '#') {
                    flgW = false;
                    break;
                }
            }
            if (flgW) {
                cntW.add(1);
            } else {
                cntW.add(0);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < H; i++) {
            if (cntH.get(i) == 0) {
                for (int j = 0; j < W; j++) {
                    if (cntW.get(j) == 0) {
                        sb.append(grid[i][j]);
                    }
                }
                System.out.println(sb.toString());
                sb.setLength(0);
            }
        }
    }
}
