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
        int[] x = new int[n];
        int pCnt = 0;
        int mCnt = 0;
        int mn = 999999999;
        int p1 = 0;
        
        // Process the input string
        for (int i = 0; i < n; i++) {
            int p2 = p1;
            while (p2 < inw.length() && inw.charAt(p2) != ' ') {
                p2++;
            }
            
            int xw = Integer.parseInt(inw.substring(p1, p2));
            if (xw < mn) {
                mn = xw;
            }
            
            if (xw < 0) {
                mCnt++;
            } else {
                pCnt++;
            }
            
            x[i] = xw;
            p1 = p2 + 1;
        }
        
        // Calculate I1 and I2
        int i1 = mCnt >= k ? (x[mn - 1] == 0 ? mCnt - k + 2 : mCnt - k + 1) : 1;
        int i2 = pCnt >= k ? mCnt + k : n;
        
        // Find the minimum value of DS
        int cnt = 999999999;
        for (int i = i1 - 1; i <= i2 - k; i++) {
            int ds;
            if (x[i] < 0 && x[i + k] > 0) {
                ds = Math.abs(x[i]) * 2 + x[i + k];
            } else if (x[i] < 0) {
                ds = x[i];
            } else {
                ds = x[i + k];
            }
            
            if (ds < cnt) {
                cnt = ds;
            }
        }
        
        // Output the result
        System.out.println(cnt);
    }
}