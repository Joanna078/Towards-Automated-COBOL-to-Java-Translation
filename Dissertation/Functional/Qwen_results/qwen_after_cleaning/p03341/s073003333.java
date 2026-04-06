import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input
        int n = Integer.parseInt(scanner.nextLine());
        String s = scanner.nextLine();
        
        // Initialize counters
        int wCnt = 0;
        int eCnt = 0;
        int min = n;
        int ww = 0;
        int ew = 0;
        int m;
        
        // Count occurrences of 'W' and 'E'
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'W') {
                wCnt++;
            } else {
                eCnt++;
            }
        }
        
        // Calculate minimum value
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'E') {
                ew++;
            }
            m = ww + (eCnt - ew);
            if (min > m) {
                min = m;
            }
            if (s.charAt(i) == 'W') {
                ww++;
            }
        }
        
        // Output result
        System.out.println(min);
    }
}