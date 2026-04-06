```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input from keyboard
        String inw = scanner.nextLine();
        
        // Split input into N and K
        String[] parts = inw.split(" ");
        int n = Integer.parseInt(parts[0]);
        int k = Integer.parseInt(parts[1]);
        
        // Initialize arrays and variables
        int[] x = new int[100000];
        int pCnt = 0;
        int mCnt = 0;
        int mn = 999999999;
        int mx = 0;
        int p1 = 0;
        
        // Process the input string
        for (int i = 1; i <= n; ) {
            int p2 = p1;
            while (p2 < inw.length() && inw.charAt(p2) != ' ') {
                p2++;
            }
            
            int xw = Integer.parseInt(inw.substring(p1, p2));
            if (xw < mn) {
                mn = xw;
                mx = i;
            }
            
            if (xw < 0) {
                mCnt++;
            } else {
                pCnt++;
            }
            
            p1 = p2 + 1;
            x[i - 1] = xw;
            i++;
        }
        
        // Calculate I1 and I2
        int i1 = mCnt >= k ? (x[mx - 1] == 0 ? mCnt - k + 2 : mCnt - k + 1) : 1;
        int i2 = pCnt >= k ? mCnt + k : n;
        
        // Find the minimum value of DS
        int cnt = 999999999;
        for (int i = i1; i <= i2 - k + 1; i++) {
            int ds;
            if (x[i - 1] < 0 && x[i + k - 2] > 0) {
                ds = Math.abs(x[i - 1]) * 2 + x[i + k - 2];
            } else if (x[i - 1] < 0) {
                ds = x[i - 1];
            } else {
                ds = x[i + k - 2];
            }
            
            if (ds < cnt) {
                cnt = ds;
            }
        }
        
        // Output the result
        System.out.println(cnt);
    }
}
```