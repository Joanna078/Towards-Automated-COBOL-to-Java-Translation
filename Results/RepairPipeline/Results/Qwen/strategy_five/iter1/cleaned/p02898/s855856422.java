import java.util.Scanner;

public class ProgramID {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input line
        String ln = scanner.nextLine();
        
        // Split input into N and K
        String[] parts = ln.split(" ");
        int N = Integer.parseInt(parts[0]);
        int K = Integer.parseInt(parts[1]);
        
        // Read data from standard input
        String inData = scanner.nextLine();
        
        // Initialize variables
        int maxlen = N;
        int cur = 0;
        int i = 0;
        int j;
        int len;
        int ans = 0;
        int zs = 0;
        
        while (cur < inData.length()) {
            j = cur;
            while (j < inData.length() && inData.charAt(j) != ' ') {
                j++;
            }
            len = j - cur;
            String subStr = inData.substring(cur, cur + len);
            int h = Integer.parseInt(subStr);
            
            if (K <= h) {
                ans++;
            }
            
            cur = j + 1;
        }
        
        zs = ans;
        System.out.println(String.format("%d", zs));
    }
}