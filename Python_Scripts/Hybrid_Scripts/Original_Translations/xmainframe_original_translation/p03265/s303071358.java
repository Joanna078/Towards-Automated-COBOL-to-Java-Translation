import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = reader.readLine().split(" ");
        int x1 = Integer.parseInt(arr[0]);
        int y1 = Integer.parseInt(arr[1]);
        int x2 = Integer.parseInt(arr[2]);
        int y2 = Integer.parseInt(arr[3]);
        int dx = x2 - x1;
        int dy = y2 - y1;
        int ddx = Math.abs(dx);
        int ddy = Math.abs(dy);
        if (0 <= dx && 0 <= dy) {
            int a1 = x2 - ddy;
            int a2 = y2 + ddx;
            int a3 = a1 - ddx;
            int a4 = a2 - ddy;
            System.out.println(a1 + " " + a2 + " " + a3 + " " + a4);
        } else if (dx < 0 && 0 <= dy) {
            int a1 = x2 - ddy;
            int a2 = y2 - ddx;
            int a3 = a1 + ddx;
            int a4 = a2 - ddy;
            System.out.println(a1 + " " + a2 + " " + a3 + " " + a4);
        } else if (dx < 0 && dy < 0) {
            int a1 = x2 + ddy;
            int a2 = y2 - ddx;
            int a3 = a1 + ddx;
            int a4 = a2 + ddy;
            System.out.println(a1 + " " + a2 + " " + a3 + " " + a4);
        } else {
            int a1 = x2 + ddy;
            int a2 = y2 + ddx;
            int a3 = a1 - ddx;
            int a4 = a2 + ddy;
            System.out.println(a1 + " " + a2 + " " + a3 + " " + a4);
        }
    }
}
