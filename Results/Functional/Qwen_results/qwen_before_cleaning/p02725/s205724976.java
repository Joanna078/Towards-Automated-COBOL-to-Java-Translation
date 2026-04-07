import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input string
        String s = scanner.nextLine();
        
        // Split input string into K and N
        String[] parts = s.split(" ");
        int k = Integer.parseInt(parts[0]);
        int n = Integer.parseInt(parts[1]);
        
        // Read input array
        int[] inp = new int[1600000];
        for (int i = 0; i < 1600000; i++) {
            inp[i] = scanner.nextInt();
        }
        
        // Initialize variables
        int z = 0;
        int gk = 0;
        int p1 = 1;
        
        // Process input array
        for (int i = 1; i <= n; i++) {
            int p2 = p1;
            while (p2 <= 1600000 && inp[p2 - 1] != 0) {
                p2++;
            }
            int aI = Arrays.copyOfRange(inp, p1 - 1, p2 - 1)[0];
            int saI = aI - z;
            z = aI;
            gk += aI;
            
            p1 = p2 + 1;
        }
        
        // Adjust N and calculate SA[N]
        n++;
        int saN = k - inp[n - 2];
        
        // Sort SA array in descending order
        int[] sa = new int[n];
        System.arraycopy(inp, 0, sa, 0, n);
        Arrays.sort(sa);
        for (int i = 0; i < n / 2; i++) {
            int temp = sa[i];
            sa[i] = sa[n - i - 1];
            sa[n - i - 1] = temp;
        }
        
        // Calculate and display output
        int out = k - sa[0];
        System.out.println(out);
        
        scanner.close();
    }
}
```

This Java code preserves the logic and behavior of the original COBOL program. It reads input from standard input, processes it according to the specified algorithm, and outputs the result. The code uses Java 17 features such as the `Scanner` class for input and the `Arrays.sort()` method for sorting. Comments have been added to explain complex logic.