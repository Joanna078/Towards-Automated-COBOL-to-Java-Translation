import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input
        int n = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        scanner.close();
        
        // Initialize variables
        int h = n / 2;
        char[] inp = input.toCharArray();
        int[] tbl1Keys = new int[100000];
        int[] tbl1Values = new int[100000];
        int[] tbl2Keys = new int[100000];
        int[] tbl2Values = new int[100000];
        Arrays.fill(tbl1Keys, 0);
        Arrays.fill(tbl1Values, 0);
        Arrays.fill(tbl2Keys, 0);
        Arrays.fill(tbl2Values, 0);
        int cnt = 0;
        int p1 = 1;
        int ix = 1;
        
        // Process input
        for (int i = 1; i <= n; i++) {
            int p2 = p1;
            while (p2 <= n && inp[p2 - 1] != ' ') {
                p2++;
            }
            
            String vwStr = new String(inp, p1 - 1, p2 - p1);
            int vw = Integer.parseInt(vwStr);
            
            if (ix == 1) {
                tbl1Keys[vw]++;
                tbl1Values[vw] = vw;
            } else {
                tbl2Keys[vw]++;
                tbl2Values[vw] = vw;
            }
            
            ix = 3 - ix;
            p1 = p2 + 1;
        }
        
        // Sort tables
        Arrays.sort(tbl1Keys);
        Arrays.sort(tbl2Keys);
        
        // Calculate count
        if (tbl1Values[0] == tbl2Values[0]) {
            if (tbl1Keys[0] + tbl2Keys[1] >= tbl1Keys[1] + tbl2Keys[0]) {
                cnt = n - tbl1Keys[0] - tbl2Keys[1];
            } else {
                cnt = n - tbl1Keys[1] - tbl2Keys[0];
            }
        } else {
            cnt = n - tbl1Keys[0] - tbl2Keys[0];
        }
        
        // Output result
        System.out.println(cnt);
    }
}
```

This Java code preserves the logic and behavior of the original COBOL program. It reads input from standard input, processes it according to the specified rules, sorts the data, calculates the required count, and outputs the result. The code uses Java 17 features and includes comments for clarity where necessary.