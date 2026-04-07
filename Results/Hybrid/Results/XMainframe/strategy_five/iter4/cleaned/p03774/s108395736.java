import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        StringTokenizer tokenizer = new StringTokenizer(line);
        int n = Integer.parseInt(tokenizer.nextToken());
        int m = Integer.parseInt(tokenizer.nextToken());
        int[][] stations = new int[n][2];
        for (int i = 0; i < n; i++) {
            line = reader.readLine();
            tokenizer = new StringTokenizer(line);
            stations[i][0] = Integer.parseInt(tokenizer.nextToken());
            stations[i][1] = Integer.parseInt(tokenizer.nextToken());
        }
        int[][] paths = new int[m][2];
        for (int i = 0; i < m; i++) {
            line = reader.readLine();
            tokenizer = new StringTokenizer(line);
            paths[i][0] = Integer.parseInt(tokenizer.nextToken());
            paths[i][1] = Integer.parseInt(tokenizer.nextToken());
        }
        int minDistance = Integer.MAX_VALUE;
        int stationIndex = -1;
        for (int i = 0; i < n; i++) {
            int distance = Integer.MAX_VALUE;
            int pathIndex = -1;
            for (int j = 0; j < m; j++) {
                int dx = Math.abs(stations[i][0] - paths[j][0]);
                int dy = Math.abs(stations[i][1] - paths[j][1]);
                int dist = dx + dy;
                if (dist < distance) {
                    distance = dist;
                    pathIndex = j + 1;
                }
            }
            if (distance < minDistance) {
                minDistance = distance;
                stationIndex = i + 1;
                // Convert pathIndex to string and pad with leading zeros if necessary
                String ans = String.format("%02d", pathIndex);
                System.out.print(ans);
            }
        }
    }
}