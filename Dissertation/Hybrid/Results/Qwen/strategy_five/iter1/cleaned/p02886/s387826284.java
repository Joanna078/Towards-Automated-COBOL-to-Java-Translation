import java.util.Scanner;

public class ProgramID {
    public static void main(String[] args) {
        // Input variables
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String ln = scanner.nextLine();
        
        // Working storage
        int[] d = new int[100];
        int maxlen = 100;
        int cur = 0;
        int i = 0;
        int j;
        int k;
        int len;
        long ans = 0;
        StringBuilder zs = new StringBuilder();
        
        // Process input string
        while (cur < maxlen && cur < ln.length() && ln.charAt(cur) != ' ') {
            j = cur;
            while (j < maxlen && j < ln.length() && ln.charAt(j) != ' ') {
                j++;
            }
            len = j - cur;
            System.arraycopy(ln.toCharArray(), cur, d, i, len);
            cur = j + 1;
            i++;
        }

        // Calculate answer
        for (i = 0; i < 50 && i < n; i++) {
            for (k = i + 1; k < 50 && k < n; k++) {
                ans += d[i] * d[k];
            }
        }

        // Output result
        zs.append(ans);
        System.out.println(zs.toString().trim());
        scanner.close();
    }
}