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
        for (int i = 0; i < n; i++) {
            p2 = i;
            while (p2 < inp.length && inp[p2] != ' ') {
                p2++;
            }
            a[i] = Integer.parseInt(new String(inp, i, p2 - i));
            sa[i] = a[i] - i;
            i = p2;
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