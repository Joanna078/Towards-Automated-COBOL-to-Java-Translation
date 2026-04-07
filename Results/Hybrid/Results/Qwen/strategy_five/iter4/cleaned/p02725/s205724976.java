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
        String inpStr = scanner.nextLine();
        String[] inpParts = inpStr.split(" ");
        int[] inp = new int[inpParts.length];
        for (int i = 0; i < inpParts.length; i++) {
            inp[i] = Integer.parseInt(inpParts[i]);
        }
        
        // Initialize variables
        int z = 0;
        int gk = 0;
        int p1 = 0;
        
        // Process input array
        int[] a = new int[200000];
        int[] sa = new int[200001];
        for (int i = 1; i <= n; i++) {
            int p2 = p1;
            while (p2 < inp.length && inp[p2] != 0) {
                p2++;
            }
            int aI = Arrays.copyOfRange(inp, p1, p2).length > 0 ? Arrays.copyOfRange(inp, p1, p2)[0] : 0;
            a[i - 1] = aI;
            sa[i - 1] = aI - z;
            z = aI;
            gk += aI;
            
            p1 = p2 + 1;
        }
        
        // Adjust N and calculate SA[N]
        n++;
        sa[n - 1] = k - a[n - 2];
        
        // Sort SA array in descending order
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