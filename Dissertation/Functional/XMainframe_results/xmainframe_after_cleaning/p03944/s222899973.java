import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int n = sc.nextInt();
        int maxX = 0;
        int minX = w;
        int maxY = 0;
        int minY = h;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int a = sc.nextInt();
            if (a == 1) {
                maxX = Math.max(maxX, x);
            } else if (a == 2) {
                minX = Math.min(minX, x);
            } else if (a == 3) {
                maxY = Math.max(maxY, y);
            } else if (a == 4) {
                minY = Math.min(minY, y);
            }
        }
        int area = (minX - maxX) * (minY - maxY);
        if (area <= 0 || minX <= maxX || minY <= maxY) {
            System.out.println(0);
        } else {
            System.out.println(area);
        }
    }
}
