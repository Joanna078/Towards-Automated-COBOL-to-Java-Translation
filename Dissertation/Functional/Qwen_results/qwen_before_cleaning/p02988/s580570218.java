import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input N
        int n = Integer.parseInt(scanner.nextLine());
        
        // Input INP
        String inp = scanner.nextLine();
        
        // Initialize array P with size N+1
        int[] p = new int[n + 1];
        
        int p1 = 1;
        for (int i = 1; i <= n; i++) {
            int p2 = p1;
            while (p2 <= inp.length() && inp.charAt(p2 - 1) != ' ') {
                p2++;
            }
            p[i] = Integer.parseInt(inp.substring(p1 - 1, p2 - 1));
            p1 = p2 + 1;
        }
        
        int k = 0;
        for (int i = 2; i < n; i++) {
            if ((p[i - 1] < p[i] && p[i] < p[i + 1]) || (p[i - 1] > p[i] && p[i] > p[i + 1])) {
                k++;
            }
        }
        
        System.out.println(k);
    }
}
```

### Explanation of the Code:
1. **Input Handling**: The program reads two lines from the standard input. The first line is the integer `N`, and the second line is the string `INP`.
2. **Array Initialization**: An array `p` of size `n + 1` is initialized to store the parsed integers from the string `INP`.
3. **Parsing the String**:
   - A loop iterates through the string `INP` to extract numbers separated by spaces.
   - For each number, it calculates its length and stores it in the array `p`.
4. **Counting Local Maxima/Minima**:
   - Another loop checks for local maxima or minima in the array `p` and increments the counter `k` accordingly.
5. **Output**: Finally, the value of `k` is printed to the console.

This Java code maintains the same logic and behavior as the original COBOL program.