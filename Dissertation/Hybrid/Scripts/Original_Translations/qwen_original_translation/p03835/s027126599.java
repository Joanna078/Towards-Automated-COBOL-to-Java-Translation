import java.util.Scanner;

public class ABC_051_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        String inp = scanner.nextLine();
        
        // Data Division
        int k = Integer.parseInt(inp.split(" ")[0]);
        int s = Integer.parseInt(inp.split(" ")[1]);
        int cnt = 0;
        
        // Logic
        for (int i = 0; i < 3 * k; i++) {
            if (k < i) break;
            for (int j = 0; j < 3 * k; j++) {
                if (k < j) break;
                int tmp = i + j;
                if (tmp <= s && s - tmp <= k) {
                    cnt++;
                }
            }
        }
        
        // Output
        System.out.println(cnt);
    }
}