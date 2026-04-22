import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input N
        int n = Integer.parseInt(scanner.nextLine());
        
        // Input array S
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = scanner.nextLine();
        }
        
        // Sort array S
        Arrays.sort(s);
        
        // Count distinct elements
        int cnt = 1;
        for (int i = 1; i < n; i++) {
            if (!s[i].equals(s[i - 1])) {
                cnt++;
            }
        }
        
        // Output result
        System.out.println(cnt);
    }
}