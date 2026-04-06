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
        int cur = 1;
        int i = 1;
        int j;
        int len;
        int ans = 0;
        int zs = 0;
        
        while (cur <= maxlen) {
            j = cur;
            while (j <= maxlen && inData.charAt(j - 1) != ' ') {
                j++;
            }
            len = j - cur;
            String subStr = inData.substring(cur - 1, cur - 1 + len);
            int h = Integer.parseInt(subStr);
            
            if (K <= h) {
                ans++;
            }
            
            cur = j + 1;
            i++;
        }
        
        zs = ans;
        System.out.println(String.format("%d", zs));
    }
}
```

### Explanation of Complex Logic:
1. **Reading Input**: The program reads a single line of input which contains `N` and `K` separated by a space, followed by another line containing the actual data.
2. **Splitting Input**: The input is split into `N`, `K`, and the data string using `split`.
3. **Processing Data**: The program iterates through the data string, extracting substrings based on spaces and converting them to integers. It then checks if each integer is less than or equal to `K` and increments the count accordingly.
4. **Output**: Finally, the result is printed formatted as a string.