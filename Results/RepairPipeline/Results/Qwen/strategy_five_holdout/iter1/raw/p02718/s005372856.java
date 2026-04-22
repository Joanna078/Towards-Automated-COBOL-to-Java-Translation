```java
import java.util.Arrays;
import java.util.Scanner;

public class ProgramID {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input string
        String ln = scanner.nextLine();
        
        // Split input into N and M
        String[] parts = ln.split(" ");
        int N = Integer.parseInt(parts[0]);
        int M = Integer.parseInt(parts[1]);
        
        // Initialize array A11 with size N
        int[] A11 = new int[N];
        
        // Read next line and populate array A11
        ln = scanner.nextLine();
        String[] numbers = ln.split(" ");
        for (int i = 0; i < N; i++) {
            A11[i] = Integer.parseInt(numbers[i]);
        }
        
        // Initialize variables
        int maxlen = 100;
        int cur = 0;
        int i = 0;
        int j;
        int len;
        int accum = 0;
        
        // Process the input string
        while (cur < ln.length()) {
            j = cur;
            while (j < ln.length() && ln.charAt(j) != ' ') {
                j++;
            }
            len = j - cur;
            int value = Integer.parseInt(ln.substring(cur, j));
            A11[i] = value;
            accum += value;
            cur = j + 1;
            i++;
        }
        
        // Sort array A11 in descending order
        Arrays.sort(A11);
        for (int k = 0; k < A11.length / 2; k++) {
            int temp = A11[k];
            A11[k] = A11[A11.length - 1 - k];
            A11[A11.length - 1 - k] = temp;
        }
        
        // Check condition and display result
        if (accum / (4 * M) <= A11[M - 1]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        scanner.close();
    }
}
```