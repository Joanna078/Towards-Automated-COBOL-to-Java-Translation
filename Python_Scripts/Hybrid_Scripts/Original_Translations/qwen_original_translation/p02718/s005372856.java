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
        for (int i = 0; i < N; i++) {
            A11[i] = Integer.parseInt(ln.split(" ")[i]);
        }
        
        // Initialize variables
        int maxlen = 100;
        int cur = 1;
        int i = 1;
        int j;
        int len;
        int accum = 0;
        int ans;
        int zs;
        
        // Process the input string
        while (cur <= maxlen) {
            j = cur;
            while (j <= maxlen && ln.charAt(j - 1) != ' ') {
                j++;
            }
            len = j - cur;
            int value = Integer.parseInt(ln.substring(cur - 1, j - 1));
            A11[i - 1] = value;
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