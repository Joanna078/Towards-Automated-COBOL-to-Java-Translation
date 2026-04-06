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