import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input
        int n = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        scanner.close();
        
        char[] inp = input.toCharArray();
        
        // Initialize variables
        int[] a = new int[n];
        int[] sa = new int[n];
        long cnt = 0;
        long w = 0;
        long s = 0;
        int amr = 0;
        int p1 = 0;
        int p2 = 0;
        
        // Process input
        for (int i = 0; i < n; ) {
            p2 = i;
            while (p2 < n && inp[p2] != ' ') {
                p2++;
            }
            a[i] = Integer.parseInt(new String(inp, i, p2 - i));
            sa[i] = a[i] - i;
            i = p2 + 1;
        }
        
        // Sort array
        Arrays.sort(sa);
        
        // Calculate median
        if ((n % 2) == 1) {
            w = sa[n / 2];
        } else {
            w = Math.round((sa[(n / 2) - 1] + sa[n / 2]) / 2.0);
        }
        
        // Calculate sum of differences
        for (int i = 0; i < n; i++) {
            s = a[i] - (w + i);
            cnt += s;
        }
        
        // Output result
        System.out.println(cnt);
    }
}
```

### Explanation of Complex Logic:
1. **Reading Input**: The COBOL program reads input from standard input. In Java, we use `Scanner` to read the input.
2. **Processing Input**: The COBOL program processes the input string to extract integers and store them in arrays. In Java, we convert the input string to a character array and then parse the substrings into integers.
3. **Sorting**: The COBOL program sorts the array using a simple loop. In Java, we use `Arrays.sort()` for sorting.
4. **Calculating Median**: The COBOL program calculates the median based on whether the number of elements is odd or even. In Java, we use conditional statements to handle both cases.
5. **Summing Differences**: The COBOL program sums up the differences between each element and the calculated median. In Java, we use a loop to perform this calculation.
6. **Output**: The COBOL program outputs the final result. In Java, we print the result directly.