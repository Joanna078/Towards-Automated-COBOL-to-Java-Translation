import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        StringTokenizer tokenizer = new StringTokenizer(line);
        int n = Integer.parseInt(tokenizer.nextToken());
        int m = Integer.parseInt(tokenizer.nextToken());
        Point[] stations = new Point[n];
        for (int i = 0; i < n; i++) {
            line = reader.readLine();
            tokenizer = new StringTokenizer(line);
            int x = Integer.parseInt(tokenizer.nextToken());
            int y = Integer.parseInt(tokenizer.nextToken());
            stations[i] = new Point(x, y);
        }
        Point[] paths = new Point[m];
        for (int i = 0; i < m; i++) {
            line = reader.readLine();
            tokenizer = new StringTokenizer(line);
            int x = Integer.parseInt(tokenizer.nextToken());
            int y = Integer.parseInt(tokenizer.nextToken());
            paths[i] = new Point(x, y);
        }
        int minDistance = Integer.MAX_VALUE;
        int stationIndex = -1;
        for (int i = 0; i < n; i++) {
            int distance = Integer.MAX_VALUE;
            for (int j = 0; j < m; j++) {
                int dx = Math.abs(stations[i].x - paths[j].x);
                int dy = Math.abs(stations[i].y - paths[j].y);
                int dist = dx + dy;
                if (dist < distance) {
                    distance = dist;
                }
            }
            if (distance < minDistance) {
                minDistance = distance;
                stationIndex = i + 1;
            }
        }
        System.out.println(minDistance);
        System.out.println(stationIndex);
    }
}

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}