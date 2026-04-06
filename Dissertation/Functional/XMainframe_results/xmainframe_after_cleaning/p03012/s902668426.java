import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String input = reader.readLine();
        int sum = 0;
        int prevWeight = 0;
        int pivot = 0;
        for (int i = 0; i < n; i++) {
            int weight = 0;
            while (input.charAt(pivot) != ' ') {
                weight = weight * 10 + (input.charAt(pivot) - '0');
                pivot++;
            }
            sum += weight;
            int currentWeight = sum - prevWeight * 2;
            if (currentWeight >= sum / 2) {
                System.out.println(prevWeight);
                break;
            }
            prevWeight = weight;
        }
    }
}
